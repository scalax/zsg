package net.scalax.test01

import akka.http.scaladsl.model.headers.Cookie
import akka.http.scaladsl.testkit.ScalatestRouteTest
import net.scalax.asuna.akkahttp.AkkaHttpParameterHelper
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.data.macroImpl.{EmptyLazyOutput, LazyData}
import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.encoder.InputTable
import net.scalax.asuna.helper.mapper.CaseClassMapper
import org.scalatest._

import scala.concurrent.{duration, Await, Future}

case class Model(id: Int, name: String, age: Int, nick: String, cusField: String, field1: String, field2: Long, field3: String, extCookieField: Map[String, String])

class AkkaHttpTest extends WordSpec with Matchers with ScalatestRouteTest with AkkaHttpParameterHelper {

  class ParameterTable(fieldKeys: List[String]) {
    self =>

    import akka.http.scaladsl.server._
    import Directives._

    //常量字段
    def id = helper.LiteralColumn(-1)
    //String 类型字段
    def name = helper.cookie
    //其他需要 Unmarshaller 的字段
    def age = helper.formFieldAs[Int]
    //String 类型字段，Url 参数
    def nick = helper.parameter
    //model 字段名称对不上的但又不方便修改 model 的可以使用 akka-http 原生方法
    def cusField = formField("my_name_field")

    //field1 field2 field3 是表单中的字段，因为属性名称和提交的表单一样，所以可以用默认的 implicit 自动生成，这几个字段可以达到类似 shapeless 的效果

    //Map[String, String] 类型的动态字段，可以与其他逻辑匹配生成
    def extCookieField = akkahttp.shaped(fieldKeys.map(key => formField(key).map(value => Tuple1((key, value))))).dmap(_.toMap)

    //根据 asnua 生成的自定义 Directive1
    def cusDirective: Directive1[Model] = akkahttp.effect(akkahttp.caseOnly[ParameterTable, Model].compileDecoder2222.inputTable(self)).toDirective

  }

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  import akka.http.scaladsl.server._
  import Directives._

  val route =
    path("formtest") {
      post {
        //此时传入由其他途径获取到的需要解析的 form 字段
        new ParameterTable(List("cKey1", "cKey2")).cusDirective { model =>
          complete(model.toString)
        }
      }
    } ~ path("index") {
      get {
        complete("hello")
      }
    }

  "akkahttp's shape should auto shape values" in {
    import akka.http.scaladsl.model._
    Post(
        "/formtest?nick=nick_value"
      , FormData(
          ("age", "3456")
        , ("my_name_field", "my_name_field_value")
        , ("field1", "field1Value")
        , ("field2", "52345234")
        , ("field3", "field3Value")
        , ("cKey1", "cKey1Value")
        , ("cKey2", "cKey2Value")
        , ("cKey3", "NotUsed")
      )
    ) ~>
      Cookie("name", "name_cookie_value") ~>
      route ~>
      check {
        responseAs[String] shouldEqual
          Model(
              id = -1
            , name = "name_cookie_value"
            , age = 3456
            , nick = "nick_value"
            , cusField = "my_name_field_value"
            , field1 = "field1Value"
            , field2 = 52345234L
            , field3 = "field3Value"
            , extCookieField = Map(("cKey1", "cKey1Value"), ("cKey2", "cKey2Value"))
          ).toString
      }
  }

}
