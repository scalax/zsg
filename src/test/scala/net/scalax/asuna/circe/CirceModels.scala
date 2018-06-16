package net.scalax.asuna.core

import cats.data.Validated
import net.scalax.asuna.shape.ShapeHelper
import shapeless._

trait CirceModels extends CirceReaderHelper with ShapeHelper {

  case class Student(id: Int, name: String, age: Long, nick: String)

  trait CirceModelReader0 {

    def id = column[Int]("id")
    def name = column[String]("name")
    def age = column[Long]("我是莎莎酱的年龄")
    def nick = column[String]("我是莎莎酱的昵称")

    val gen = Generic[Student]

    val reader = toCirceReader((id :: name :: age :: nick :: HNil).map(gen.from))

  }

  object CirceModelReader0 extends CirceModelReader0

  val minAge = 233333339L
  val validateStr1 = s"魔理沙的年龄必须大于${minAge}岁"
  val validateStr2 = s"昵称不能小于 30 个字"

  trait CirceModelReader1 extends CirceModelReader0 {

    val age11 = super.age.validate { l =>
      if (l < minAge)
        Validated.invalidNel(validateStr1)
      else
        Validated.validNel(l)
    }

    val nick22 = super.nick.validate { l =>
      if (l.size < 30)
        Validated.invalidNel(validateStr2)
      else
        Validated.validNel(l)
    }

    override val reader = toCirceReader((id :: name :: age11 :: nick22 :: HNil).map(gen.from))
  }

  object CirceModelReader1 extends CirceModelReader1

}