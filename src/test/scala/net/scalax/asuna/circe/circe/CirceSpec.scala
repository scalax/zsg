package org.scalax.asuna.core.circe.circe

import java.nio.charset.StandardCharsets

import io.circe.generic.auto._
import io.circe.syntax._
import org.scalax.asuna.core.{CirceModels, ValidateField, ValidateModel}
import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api._
import play.api.libs.ws.WSClient
import play.api.routing._
import play.api.routing.sird._
import play.api.mvc._
import play.api.inject.guice._

import scala.concurrent._

class CirceSpec extends PlaySpec with GuiceOneServerPerSuite with CirceModels {

  lazy val controllersComponent = app.injector.instanceOf[ControllerComponents]
  lazy val circeController      = new CirceController(controllersComponent)
  lazy val wsClient             = app.injector.instanceOf[WSClient]
  lazy val url                  = s"http://127.0.0.1:$port"
  val jsonStr =
    """
      |{ "id": 233, "name": "aabbccdd", "我是莎莎酱的年龄": 23416254, "我是莎莎酱的昵称": "hahahaha" }
    """.stripMargin
  val requestJson = io.circe.parser.parse(jsonStr)

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  override def fakeApplication(): Application =
    new GuiceApplicationBuilder()
      .router(Router.from {
        case POST(p"/post")     => circeController.post
        case POST(p"/postJson") => circeController.postJson
      })
      .build()

  "Circe trait" must {
    "parse json as object" in {
      val resp     = wsClient.url(url + "/post").addHttpHeaders("Content-Type" -> "application/json").post(jsonStr)
      val response = await(resp)
      val body     = response.bodyAsBytes.decodeString(StandardCharsets.UTF_8)
      response.status mustEqual 200
      io.circe.parser.parse(body) mustEqual Right(Student(id = 233, age = 23416254, nick = "hahahaha", name = "aabbccdd").asJson)
    }
    "parse json" in {
      val resp     = wsClient.url(url + "/postJson").addHttpHeaders("Content-Type" -> "application/json").post(jsonStr)
      val response = await(resp)
      val body     = response.bodyAsBytes.decodeString(StandardCharsets.UTF_8)
      response.status mustEqual 400
      io.circe.parser.parse(body) mustEqual Right(
          ValidateModel(fields = List(ValidateField("我是莎莎酱的年龄", s"魔理沙的年龄必须大于${233333339L}岁"), ValidateField("我是莎莎酱的昵称", "昵称不能小于 30 个字"))).asJson
      )
    }
  }
}
