import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.mapper.item._
import org.scalax.asuna.mapper._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric

object Test01 extends App {

  trait JsonEncoder1[T, II] {
    self =>

    def p(obj: T, m: List[(String, Json)]): List[(String, Json)]
    def toJsonObject: ObjectEncoder[T] = ObjectEncoder.instance(s => JsonObject.fromIterable(p(s, List.empty)))

  }

}
