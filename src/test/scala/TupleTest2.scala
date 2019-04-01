package org.scalax.asuna.mapper.append.test

import org.scalax.asuna.ii.item.AppendTuple
import org.scalax.asuna.mapper.append.debug.TupleTest
import org.scalax.asuna.mapper.item.{Application, Context}

object TupleTest2 extends App {

  implicit def ii: Application[TupleTest.TupleContext[AppendTuple], String, TupleTest.Type1] =
    new Application[TupleTest.TupleContext[AppendTuple], String, TupleTest.Type1] {
      override def application(cotext: Context[TupleTest.TupleContext[AppendTuple]]): (TupleTest.TupleEncoder[String], String => List[String]) =
        (new TupleTest.TupleEncoder[String] {
          override def body(t: String) = List(t.toString)
        }, t => List(s"copy1: ${t}", s"copy2: ${t}"))
    }

  implicit def ii2: Application[TupleTest.TupleContext[AppendTuple], Int, TupleTest.Type2] = new Application[TupleTest.TupleContext[AppendTuple], Int, TupleTest.Type2] {
    override def application(cotext: Context[TupleTest.TupleContext[AppendTuple]]): (TupleTest.TupleEncoder[Int], Int => List[String]) =
      (new TupleTest.TupleEncoder[Int] {
        override def body(t: Int) = List(t.toString)
      }, t => List(s"${t}", s"plus one: ${t + 1}"))
  }

  val aa = (1, 2, (2, "124845", "56464", 4, 43, 5, 2345), 23434, 344345, "dfgdg", "tdrtery", ("get4rr", "edgert", 334, 424, ("hfhrt", 345, 34, (34534, "gdfg"))))
  println(TupleTest.encodeTuple(aa)._1.print(aa))

  val bb                                                                           = (1, 2, (2, "124845", "56464"))
  val cc                                                                           = TupleTest.encodeTuple(bb)._2(bb)
  val dd: (List[String], List[String], (List[String], List[String], List[String])) = cc
  println(dd)

}
