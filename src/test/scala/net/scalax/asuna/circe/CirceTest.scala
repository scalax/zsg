package net.scalax.asuna.core

import io.circe.JsonObject
import org.scalatest._

class CirceTest extends FlatSpec with Matchers with CirceModels {

  val jsonStr =
    """
      |{ "id": 233, "name": "aabbccdd", "我是莎莎酱的年龄": 23416254, "我是莎莎酱的昵称": "hahahaha" }
    """.stripMargin

  "common json reader" should "read json as case class" in {
    val jsonEt = io.circe.parser.parse(jsonStr).flatMap(_.as[JsonObject])
    jsonEt.isRight should be(true)
    val json = jsonEt.right.get
    val model = CirceModelReader0.tranData(json)
    model.isValid should be(true)
    model.getOrElse(throw new Exception("Error result")) should be(Student(id = 233, name = "aabbccdd", age = 23416254, nick = "hahahaha"))
  }

  it should "read json and return validate error" in {
    val jsonEt = io.circe.parser.parse(jsonStr).flatMap(_.as[JsonObject])
    jsonEt.isRight should be(true)
    val json = jsonEt.right.get
    val model = CirceModelReader1.tranData(json)
    model.isInvalid should be(true)
    model.toEither.left.get.toList should be(List(ValidateField("我是莎莎酱的年龄", validateStr1), ValidateField("我是莎莎酱的昵称", validateStr2)))
  }

}