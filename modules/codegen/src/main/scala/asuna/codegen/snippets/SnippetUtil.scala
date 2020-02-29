package asuna.codegen

import scala.annotation.tailrec

object SnippetUtil {

  def XI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(u => s"X${u}")
  def YI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(u => s"Y${u}")
  def ZI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(u => s"Z${u}")
  def Any_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(_ => s"Any")

  def AsunaTuple0_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(_ => s"AsunaTuple0")
  def AsunaTuple1_YI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(i => s"AsunaTuple1[Y${i}]")
  def AsunaTuple1_Any_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(_ => s"AsunaTuple1[Any]")

  def AsunaTuple2_XI_YI_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(u => s"AsunaTuple2[Y${u}, X${u}]")
  def AsunaTuple2_Any_Any_Snippet(seq: Iterable[Int]): Iterable[String] = seq.map(_ => s"AsunaTuple2[Any, Any]")

  @tailrec
  def groupedTupleItem(item: Iterable[String])(groupSize: Int): String = {
    item.grouped(groupSize).map { i =>
      i.mkString(s"AsunaTuple${i.size}[", " , ", "]")
    }.to(List) match {
      case h :: Nil =>
        h
      case r =>
        groupedTupleItem(r)(groupSize)
    }
  }

  def plusX_AsunaTuple2_XI_Snippet(plusSeq: Iterable[Int])(seq: Iterable[Int]): Iterable[String] = for {
    plusIndex <- plusSeq
  } yield {
    groupedTupleItem(seq.map(r => s"Plus${plusIndex}_X${r}"))(2)
  }

  def single_plusX_AsunaTuple2_XI_Snippet(plusIndex: Int)(seq: Iterable[Int]): String = {
    groupedTupleItem(seq.map(r => s"Plus${plusIndex}_X${r}"))(2)
  }

  def PlusX_XI_Snippet(pluxSeq: Iterable[Int])(seq: Iterable[Int]): Iterable[Iterable[String]] = pluxSeq.map(i => seq.map(ii => s"Plus${i}_X${ii}"))
  def single_PlusX_XI_Snippet(pluxIndex: Int)(seq: Iterable[Int]): Iterable[String] = seq.map(ii => s"Plus${pluxIndex}_X${ii}")

  def Tuple_To_AsunaTuple(item: Iterable[String])(groupSize: Int): String = {
    item.grouped(groupSize).map { i =>
      i.mkString(s"BuildContent.tuple${i.size}(", " , ", ")")
    }.to(List) match {
      case h :: Nil =>
        h
      case r =>
        Tuple_To_AsunaTuple(r)(groupSize)
    }
  }

  def single_Tuple_To_AsunaTuple(seq: Iterable[Int]): String = {
    Tuple_To_AsunaTuple(seq.map(r => s"z._${r}"))(2)
  }

  /*def AsunaTupleIndexToScalaTupleIndex(index: Int)(groupSize: Int)(current: List[Int]): List[Int] = {
    def maxGroupSize(currentGroupSize: Int): Int = if ((index / currentGroupSize) >= groupSize)
      maxGroupSize(currentGroupSize * groupSize)
    else currentGroupSize

    if (index == 0) {
      current
    } else if (index < groupSize) {
      index :: current
    } else {
      val max = maxGroupSize(groupSize)
      val m = index / max
      AsunaTupleIndexToScalaTupleIndex(index - m * max)(groupSize)(m :: current)
    }
  }

  def Tuple2_Index_To_ScalaTuple_Index(groupSize: Int): String = {
    val result = for {
      pp <- 1 to groupSize
    } yield {
      AsunaTupleIndexToScalaTupleIndex(pp)(2)(List.empty)
    }
    val maxCount = result.map(_.size).max
    result.map(p => (if(p.size < maxCount) { List.fill(maxCount - p.size)(0) ::: p } else p).map(p => s".i${p + 1}").mkString("x", "", ""))
      .mkString(s"Tuple${groupSize}(", " , ", ")")
  }*/

  def Tuple2Group[T](i: List[T])(groupSize: Int)(on: T => List[List[Int]]): List[List[Int]] = {
    if (i.size >= groupSize && i.size > 1) {
      Tuple2Group(i.grouped(groupSize).to(List).map(_.zipWithIndex.to(List)))(groupSize)(s => s.flatMap { case (item, index) => on(item).map(p => index :: p) })
    } else {
      i.flatMap(on)
    }
  }

  def Tuple2_Index_To_ScalaTuple_Index(tupleSize: Int): String = {
    val result = Tuple2Group((1 to tupleSize).map(_ => List.empty[Int]).to(List))(2)(i => List(i: List[Int]))
    result.map(_.map(p => s".i${p + 1}").mkString("x", "", ""))
      .mkString(s"Tuple${tupleSize}(", " , ", ")")
  }

}
