package zsg.macros.case_class_test

import zsg.PropertyTag

trait ModelFromStringImpl[I, M] {
  def getData(str: String): (String, M)
}

object ModelFromStringImpl {
  implicit val outImplicit1: ModelFromStringImpl[PropertyTag[String], String] = new ModelFromStringImpl[PropertyTag[String], String] {
    override def getData(str: String): (String, String) = {
      val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
      val str2 = str1.takeWhile(s => s != ')')
      val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
      (str3, str2)
    }
  }

  implicit val outImplicit2: ModelFromStringImpl[PropertyTag[Int], Int] = new ModelFromStringImpl[PropertyTag[Int], Int] {
    override def getData(str: String): (String, Int) = {
      val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
      val str2 = str1.takeWhile(s => s != ')')
      val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
      (str3, str2.toInt)
    }
  }

  implicit val outImplicit3: ModelFromStringImpl[PropertyTag[Long], Long] = new ModelFromStringImpl[PropertyTag[Long], Long] {
    override def getData(str: String): (String, Long) = {
      val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
      val str2 = str1.takeWhile(s => s != ')')
      val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
      (str3, str2.toLong)
    }
  }
}
