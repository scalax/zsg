package net.scalax.asuna.core

import cats.data.Validated
import net.scalax.asuna.shape.ShapeHelper
import shapeless._

trait CirceModels extends CirceReaderHelper {

  case class Student(id: Int, name: String, age: Long, nick: String)

  class CirceModelReader0 extends CirceReaderQuery[Student] with ShapeHelper {

    def id = column[Int]("id")
    def name = column[String]("name")
    def age = column[Long]("我是莎莎酱的年龄")
    def nick = column[String]("我是莎莎酱的昵称")

    val gen = Generic[Student]

    override lazy val playCirceSv = (id :: name :: age :: nick :: HNil).mapFull(s => gen.from(s))(t => gen.to(t))

  }

  object CirceModelReader0 extends CirceModelReader0

  val minAge = 233333339L
  val validateStr1 = s"魔理沙的年龄必须大于${minAge}岁"
  val validateStr2 = s"昵称不能小于 30 个字"

  trait CirceModelReader1 extends CirceModelReader0 {

    override val age = super.age.validate { l =>
      if (l < minAge)
        Validated.invalidNel(validateStr1)
      else
        Validated.validNel(l)
    }

    override val nick = super.nick.validate { l =>
      if (l.size < 30)
        Validated.invalidNel(validateStr2)
      else
        Validated.validNel(l)
    }

  }

  object CirceModelReader1 extends CirceModelReader1

}