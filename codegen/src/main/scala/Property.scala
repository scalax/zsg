package org.scalax.asuna.codegen

object Property {

  def toItemImpl(size: Int, initList: List[String]): List[String] = {
    if (initList.size >= size) {
      initList.take(size)
    } else {
      toItemImpl(size, initList.map(s => s".i1${s}") ::: initList.map(s => s".i2${s}"))
    }
  }

  def toItem(size: Int): List[String] = {
    toItemImpl(size, List(""))
  }

  def toItem1(size: Int): List[String] = {
    val i = toItem(size)
    i.zipWithIndex.map { case (item, s) => s"def i${s + 1}: T${s + 1} = item.item${item}" }
  }

  def toItem1II(size: Int): String = toItem1(size).mkString("\n")

  def toItem2(size: Int): List[String] = {
    val i = toItem(size)
    i.reverse.zipWithIndex.map { case (item, s) => s"def i${s + 1}: T${s + 1} = item.item${item}" }
  }

  def toItem2II(size: Int): String = toItem2(size).mkString("\n")

}
