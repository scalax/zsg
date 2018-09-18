package play.api.libs.circe

import cats.implicits._
import akka.stream.scaladsl.{Flow, Sink}
import akka.util.ByteString
import cats.Traverse
import io.circe._
import io.circe.syntax._
import net.scalax.asuna.core.{CirceReaderQuery, ValidateModel}
import play.api.http._
import play.api.libs.streams.Execution.Implicits.trampoline
import play.api.libs.streams.Accumulator
import play.api.Logger
import play.api.mvc._

import scala.concurrent.Future
import scala.util.control.NonFatal

trait PlayCirceValidate extends Status {

  private val defaultPrinter = Printer.noSpaces

  def parse: PlayBodyParsers

  protected def onValidateError(err: ValidateModel): Result = {
    Results.BadRequest(err.asJson)
  }

  protected def onCirceError(e: Error): Result = {
    onValidateError(ValidateModel(whole = List(s"请求内容不是 Json")))
  }

  implicit val contentTypeOf_Json: ContentTypeOf[Json] = {
    ContentTypeOf(Some(ContentTypes.JSON))
  }

  implicit def writableOf_Json(implicit codec: Codec, printer: Printer = defaultPrinter): Writeable[Json] = {
    Writeable(a => codec.encode(a.pretty(printer)))
  }

  object validatedJson {

    val logger = Logger(classOf[PlayCirceValidate])

    //def json[T: Decoder]: BodyParser[T] = json.validate(decodeJson[T])

    def byQuery[U](query: CirceReaderQuery[U]): BodyParser[U] = byQuery(query, parse.DefaultMaxTextLength)

    def byQuery[U](query: CirceReaderQuery[U], maxLength: Int): BodyParser[U] =
      parse.when(
          _.contentType.exists(m => m.equalsIgnoreCase("text/json") || m.equalsIgnoreCase("application/json"))
        , tolerantQuery(query, maxLength)
        , createBadResult("Expecting text/json or application/json body", UNSUPPORTED_MEDIA_TYPE)
      )

    //def tolerantJson[T: Decoder]: BodyParser[T] = tolerantJson.validate(decodeJson[T])

    def tolerantQuery[U](query: CirceReaderQuery[U]): BodyParser[U] = tolerantQuery(query, parse.DefaultMaxTextLength)

    def tolerantJson(maxLength: Int): BodyParser[Json] = {
      tolerantBodyParser[Json]("json", maxLength, "Invalid Json") { (request, bytes) =>
        val bodyString = new String(bytes.toArray[Byte], detectCharset(request))
        parser.parse(bodyString).leftMap(onCirceError)
      }
    }

    def tolerantQuery[U](query: CirceReaderQuery[U], maxLength: Int): BodyParser[U] = {
      tolerantJson(maxLength).validateM { j =>
        val r = j.as[JsonObject].leftMap(_ => onValidateError(ValidateModel(whole = List(s"请求内容不是 Json 对象")))).right.map { j =>
          query.tranData(j).map(s => s.toEither.leftMap(onValidateError))
        }
        Traverse[({ type X[Y] = Either[Result, Y] })#X].sequence(r).map(s => s.right.flatMap(identity))
      }
    }

    private def detectCharset(request: RequestHeader) = {
      val CharsetPattern = "(?i)\\bcharset=\\s*\"?([^\\s;\"]*)".r
      request.headers.get("Content-Type") match {
        case Some(CharsetPattern(c)) => c
        case _                       => "UTF-8"
      }
    }

    private def decodeJson[T: Decoder](json: Json) = {
      implicitly[Decoder[T]].decodeJson(json).leftMap { ex =>
        logger.debug(s"Cannot decode json $json", ex)
        onCirceError(ex)
      }
    }

    private def createBadResult(msg: String, statusCode: Int = BAD_REQUEST): RequestHeader => Future[Result] = { request =>
      LazyHttpErrorHandler.onClientError(request, statusCode, msg)
    }

    private def tolerantBodyParser[A](name: String, maxLength: Int, errorMessage: String)(
        parser: (RequestHeader, ByteString) => Either[Result, A]
    ): BodyParser[A] = {
      BodyParser(name + ", maxLength=" + maxLength) { request =>
        import play.core.Execution.Implicits.trampoline

        def parseBody(bytes: ByteString): Future[Either[Result, A]] = {
          try {
            Future.successful(parser(request, bytes))
          } catch {
            case NonFatal(e) =>
              logger.debug(errorMessage, e)
              createBadResult(errorMessage + ": " + e.getMessage)(request).map(Left(_))
          }
        }

        Accumulator.strict[ByteString, Either[Result, A]](
            // If the body was strict
          {
            case Some(bytes) if bytes.size <= maxLength =>
              parseBody(bytes)
            case None =>
              parseBody(ByteString.empty)
            case _ =>
              createBadResult("Request Entity Too Large", REQUEST_ENTITY_TOO_LARGE)(request).map(Left.apply)
          },
          // Otherwise, use an enforce max length accumulator on a folding sink
          enforceMaxLength(
              request
            , maxLength
            , Accumulator(Sink.fold[ByteString, ByteString](ByteString.empty)((state, bs) => state ++ bs)).mapFuture(parseBody)
          ).toSink
        )
      }
    }

    private[play] def enforceMaxLength[A](
        request: RequestHeader
      , maxLength: Int
      , accumulator: Accumulator[ByteString, Either[Result, A]]
    ): Accumulator[ByteString, Either[Result, A]] = {
      val takeUpToFlow = Flow.fromGraph(new BodyParsers.TakeUpTo(maxLength.toLong))
      Accumulator(takeUpToFlow.toMat(accumulator.toSink) { (statusFuture, resultFuture) =>
        import play.core.Execution.Implicits.trampoline
        statusFuture.flatMap {
          case MaxSizeExceeded(_) =>
            val badResult = createBadResult("Request Entity Too Large", REQUEST_ENTITY_TOO_LARGE)(request)
            badResult.map(Left(_))

          case MaxSizeNotExceeded =>
            resultFuture
        }
      })
    }
  }

}
