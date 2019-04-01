package org.scalax.asuna.mapper.append.test

import org.scalax.asuna.mapper.append.debug.TupleTest

object TupleTest2 extends App {

  val aa = (1, 2, (2, "124845", "56464", 4, 43, 5, 2345), 23434, 344345, "dfgdg", "tdrtery", ("get4rr", "edgert", 334, 424, ("hfhrt", 345, 34, (34534, "gdfg"))))
  println(TupleTest.encodeTuple(aa)._1.print(List.empty, aa))

  val bb                                                                           = (1, 2, (2, "124845", "56464"))
  val cc                                                                           = TupleTest.encodeTuple(bb)._2(bb)
  val dd: (List[String], List[String], (List[String], List[String], List[String])) = cc
  println(dd)

}
