package net.scalax.asuna.core

import cats.data.Validated

trait CirceModels extends CirceReaderHelper {

  case class Student(id: Int, name: String, age: Long, nick: String)

  trait CirceModelReader0 {

    def id = column[Int]("id")
    def name = column[String]("name")
    def age = column[Long]("我是莎莎酱的年龄")
    def nick = column[String]("我是莎莎酱的昵称")

    def reader = circe.effect(circe.caseOnly[CirceModelReader0.type, Student](CirceModelReader0))

  }

  object CirceModelReader0 extends CirceModelReader0

  val minAge = 233333339L
  val validateStr1 = s"魔理沙的年龄必须大于${minAge}岁"
  val validateStr2 = s"昵称不能小于 30 个字"

  class CirceModelReader1(circeTable: CirceModelReader0) {

    val id = circeTable.id

    val name = circeTable.name

    val age = circeTable.age.validate { l =>
      if (l < minAge)
        Validated.invalidNel(validateStr1)
      else
        Validated.validNel(l)
    }

    val nick = circeTable.nick.validate { l =>
      if (l.size < 30)
        Validated.invalidNel(validateStr2)
      else
        Validated.validNel(l)
    }

    def reader = circe.effect(circe.caseOnly[CirceModelReader1, Student](this))

  }

  object CirceModelReader1 extends CirceModelReader1(CirceModelReader0)

}