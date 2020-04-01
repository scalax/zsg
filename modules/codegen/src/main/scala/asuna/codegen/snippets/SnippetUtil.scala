package asuna.codegen

import scala.annotation.tailrec

object SnippetUtil {

  def XI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"X${u}")
  def YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"Y${u}")
  def II_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"final val i${u}: X${u}")
  def TI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"T${u}")
  def TagI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"Tag${u}")
  def ZI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"Z${u}")
  def Any_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(_ => s"Any")

  def AsunaTuple0_Snippet(seq: Seq[Int]): List[String]     = seq.to(List).map(_ => s"AsunaTuple0")
  def AsunaTuple1_YI_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(i => s"AsunaTuple1[Y${i}]")
  def AsunaTuple1_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"AsunaTuple1[Any]")

  def Tuple1_YI_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(i => s"Tuple1[Y${i}]")
  def Tuple1_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"Tuple1[Any]")

  def AsunaTuple2_XI_YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"AsunaTuple2[Y${u}, X${u}]")
  def AsunaTuple2_Any_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"AsunaTuple2[Any, Any]")

  def Tuple2_XI_YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"Tuple2[Y${u}, X${u}]")
  def Tuple2_Any_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"Tuple2[Any, Any]")

  @tailrec
  def groupedTupleItem(item: Seq[String])(groupSize: Int): String = {
    item
      .grouped(groupSize)
      .map { i =>
        i.mkString(s"AsunaTuple${i.size}[", " , ", "]")
      }
      .to(List) match {
      case h :: Nil =>
        h
      case r =>
        groupedTupleItem(r)(groupSize)
    }
  }

  def plusX_AsunaTuple2_XI_Snippet(plusSeq: Seq[Int])(seq: Seq[Int]): Seq[String] =
    for {
      plusIndex <- plusSeq
    } yield {
      groupedTupleItem(seq.map(r => s"Plus${plusIndex}_X${r}"))(2)
    }

  def single_plusX_AsunaTuple2_XI_Snippet(plusIndex: Int)(seq: Seq[Int]): String = {
    groupedTupleItem(seq.map(r => s"Plus${plusIndex}_X${r}"))(2)
  }

  def PlusX_XI_Snippet(pluxSeq: Seq[Int])(seq: Seq[Int]): Seq[Iterable[String]] = pluxSeq.map(i => seq.map(ii => s"Plus${i}_X${ii}"))
  def single_PlusX_XI_Snippet(pluxIndex: Int)(seq: Seq[Int]): Seq[String]       = seq.map(ii => s"Plus${pluxIndex}_X${ii}")

  def ApplicationX_XI_Snippet(pluxSeq: Seq[Int])(seq: Seq[Int]): Seq[String] = {
    seq.map { i =>
      val plusXIP = pluxSeq.map(ii => s"Plus${ii}_X${i}").mkString(" , ")
      s"t${i}: Application${pluxSeq.size}[F, Tag${i}, ${plusXIP}]"
    }
  }

  def Tuple_To_AsunaTuple(item: Seq[String])(groupSize: Int): String = {
    item
      .grouped(groupSize)
      .map { i =>
        i.mkString(s"BuildContent.tuple${i.size}(", " , ", ")")
      }
      .to(List) match {
      case h :: Nil =>
        h
      case r =>
        Tuple_To_AsunaTuple(r)(groupSize)
    }
  }

  def single_Tuple_To_AsunaTuple(seq: Seq[Int]): String = {
    Tuple_To_AsunaTuple(seq.map(r => s"z._${r}"))(2)
  }

  def Tuple_To_AsunaTuple2(item: Seq[String])(groupSize: Int)(init: Boolean): String = {
    item
      .grouped(groupSize)
      .map { i =>
        if (init) {
          i.mkString(s"AppendTag.tag(", " , ", ")")
        } else {
          i.mkString(s"AppendTag.nodeTag(", " , ", ")")
        }
      }
      .to(List) match {
      case h :: Nil =>
        h
      case r =>
        Tuple_To_AsunaTuple2(r)(groupSize)(false)
    }
  }

  def Lift_Tuple_To_AsunaTuple2(seq: Seq[Int]): String = {
    Tuple_To_AsunaTuple2(seq.map(r => s"AppendTag[Tag${r}]"))(2)(true)
  }

  def Tuple2Group[T](i: List[T])(groupSize: Int)(on: T => List[List[Int]]): List[List[Int]] = {
    if (i.size >= groupSize && i.size > 1) {
      Tuple2Group(i.grouped(groupSize).to(List).map(_.zipWithIndex.to(List)))(groupSize)(s => s.flatMap { case (item, index) => on(item).map(p => index :: p) })
    } else {
      i.flatMap(on)
    }
  }

  def Tuple2_Index_To_ScalaTuple_Index(tupleSize: Int): String = {
    if (tupleSize == 1) {
      s"Tuple1(x.i1)"
    } else {
      val result = Tuple2Group((1 to tupleSize).map(_ => List.empty[Int]).to(List))(2)(i => List(i: List[Int]))
      result.map(_.map(p => s".i${p + 1}").mkString("x", "", "")).mkString(s"Tuple${tupleSize}(", " , ", ")")
    }
  }

}
