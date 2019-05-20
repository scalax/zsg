package org.scalax.asuna.mapper.append.test

import org.scalax.asuna.ii.item._
import org.scalax.asuna.mapper.append.debug.Util

object TupleTest2 extends App {

  val aa = (1, 2, (2, "124845", "56464", 4, 43, 5, 2345), 23434, 344345, "dfgdg", "tdrtery", ("get4rr", "edgert", 334, 424, ("hfhrt", 345, 34, (34534, "gdfg"))))
  println(Util.pp.encodeTuple(aa)._1.print(aa))

  val bb                                                                           = (1, 2, (2, "124845", "56464"))
  val cc                                                                           = Util.pp.encodeTuple(bb)._2(bb)
  val dd: (List[String], List[String], (List[String], List[String], List[String])) = cc
  println(dd)

  type aa = NodeTag4[
      NodeTag2[ItemTag2[String, Int], ItemTag3[Long, Long, Int]]
    , NodeTag3[ItemTag3[Int, Int, Int], ItemTag3[Int, String, Int], ItemTag2[Int, Int]]
    , ItemTag1[Int]
    , ItemTag2[Int, Short]
  ]

  type bb = NodeTag4[
      NodeTag2[ItemTag2[Int, String], ItemTag3[String, String, String]]
    , NodeTag3[ItemTag3[String, Int, Int], ItemTag3[Int, String, Int], ItemTag2[Int, Int]]
    , ItemTag1[Long]
    , ItemTag2[Int, String]
  ]

  val iiii: aa#Pull[bb] = null

}
