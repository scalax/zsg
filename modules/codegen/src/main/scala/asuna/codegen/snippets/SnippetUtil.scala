package zsg.codegen

import scala.annotation.tailrec

object SnippetUtil {

  def XI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"X${u}")
  // def XI_CI_F_Snippet(xi: Seq[Int], ci: Seq[Int]): List[String] = xi.to(List).map(u => s"t${u}: F[${ci.map(c => s"X${u}_C${c}").mkString(" , ")}]")

  def YI_Snippet(seq: Seq[Int]): List[String]          = seq.to(List).map(u => s"Y${u}")
  def II_Snippet(seq: Seq[Int]): List[String]          = seq.to(List).map(u => s"final val i${u}: X${u}")
  def TI_Snippet(seq: Seq[Int]): List[String]          = seq.to(List).map(u => s"T${u}")
  def ZI_Snippet(seq: Seq[Int]): List[String]          = seq.to(List).map(u => s"Z${u}")
  def Any_Snippet(seq: Seq[Int]): List[String]         = seq.to(List).map(_ => s"Any")
  def XI_TupleTag_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"X${u} <: TupleTag")
  def YI_TupleTag_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"Y${u} <: TupleTag")

  def TupleTag_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"TupleTag")

  def AsunaTuple0_Snippet(seq: Seq[Int]): List[String]     = seq.to(List).map(_ => s"ZsgTuple0")
  def AsunaTuple1_XI_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(i => s"ZsgTuple1[X${i}]")
  def AsunaTuple1_YI_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(i => s"ZsgTuple1[Y${i}]")
  def AsunaTuple1_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"ZsgTuple1[Any]")
  def NodeTuple1_XI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(i => s"NodeTuple1[X${i}]")
  def NodeTuple1_YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(i => s"NodeTuple1[Y${i}]")

  def NodeTuple1_TupleTag_Any_Snippet(seq: Seq[Int]): List[String]     = seq.to(List).map(_ => s"NodeTuple1[TupleTag]")
  def NodeTuple2_TupleTag_Any_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"NodeTuple2[TupleTag, TupleTag]")

  def Tuple1_YI_Snippet(seq: Seq[Int]): List[String]  = seq.to(List).map(i => s"Tuple1[Y${i}]")
  def Tuple1_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"Tuple1[Any]")

  def NodeTuple2_XI_YI_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(u => s"NodeTuple2[Y${u}, X${u}]")

  def AsunaTuple2_XI_YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"ZsgTuple2[Y${u}, X${u}]")
  def AsunaTuple2_Any_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"ZsgTuple2[Any, Any]")

  def Tuple2_XI_YI_Snippet(seq: Seq[Int]): List[String]   = seq.to(List).map(u => s"Tuple2[Y${u}, X${u}]")
  def Tuple2_Any_Any_Snippet(seq: Seq[Int]): List[String] = seq.to(List).map(_ => s"Tuple2[Any, Any]")

  /*@tailrec
  def groupedTupleItem(item: Seq[String])(groupSize: Int)(init: Boolean): String = {
    if (init) {
      item.grouped(groupSize).map { i => i.mkString(s"ZsgTuple${i.size}[", " , ", "]") }.to(List) match {
        case h :: Nil =>
          h
        case r =>
          groupedTupleItem(r)(groupSize)(false)
      }
    } else {
      item.grouped(groupSize).map { i => i.mkString(s"NodeTuple${i.size}[", " , ", "]") }.to(List) match {
        case h :: Nil =>
          h
        case r =>
          groupedTupleItem(r)(groupSize)(false)
      }
    }
  }*/

  def plusX_AsunaTuple2_XI_Snippet(plusSeq: Seq[Int])(seq: Seq[Int]): Seq[String] =
    for {
      plusIndex <- plusSeq
    } yield {
      seq.map(r => s"Plus${plusIndex}_X${r}").mkString(s"zsg.ZTuple${seq.size}[", " , ", "]")
    }

  def single_plusX_AsunaTuple2_XI_Snippet(plusIndex: Int)(seq: Seq[Int]): String = {
    seq.map(r => s"Plus${plusIndex}_X${r}").mkString(s"zsg.ZTuple${seq.size}[", " , ", "]")
  }

  def PlusX_XI_Snippet(pluxSeq: Seq[Int])(seq: Seq[Int]): Seq[Iterable[String]] = pluxSeq.map(i => seq.map(ii => s"Plus${i}_X${ii}"))
  def single_PlusX_XI_Snippet(pluxIndex: Int)(seq: Seq[Int]): Seq[String]       = seq.map(ii => s"Plus${pluxIndex}_X${ii}")

  /*def ApplicationX_XI_Snippet(pluxSeq: Seq[Int])(seq: Seq[Int]): Seq[String] = {
    seq.map { i =>
      val plusXIP = pluxSeq.map(ii => s"Plus${ii}_X${i}").mkString(" , ")
      s"t${i}: F[${plusXIP}]"
    }
  }*/

  /*def Tuple_To_AsunaTuple(item: Seq[String])(groupSize: Int)(init: Boolean): String = {
    (if (init) item.grouped(groupSize).map { i => i.mkString(s"BuildContent.tuple${i.size}(", " , ", ")") }
     else
       item.grouped(groupSize).map { i => i.mkString(s"BuildContent.nodeTuple${i.size}(", " , ", ")") }).to(List) match {
      case h :: Nil =>
        h
      case r =>
        Tuple_To_AsunaTuple(r)(groupSize)(false)
    }
  }*/

  def single_Tuple_To_AsunaTuple(seq: Seq[Int]): String = {
    seq.map(r => s"i${r} = z._${r}").mkString(s"new zsg.ZTuple${seq.size}(", " , ", ")")
  }

  def Tuple_To_AsunaTuple2(item: Seq[String])(groupSize: Int)(init: Boolean): String = {
    (if (init)
       item.grouped(groupSize).to(List).map { i => i.mkString(s"zsg.ZTuple${i.size}[", " , ", "]") }
     else
       item.grouped(groupSize).to(List).map { i => i.mkString(s"zsg.ZNode${i.size}[", " , ", "]") }) match {
      case h :: Nil =>
        h
      case r =>
        Tuple_To_AsunaTuple2(r)(groupSize)(false)
    }
  }

  def Lift_Tuple_To_AsunaTuple2(typeParameterCount: Seq[Int], seq: Seq[Int]): String = {
    typeParameterCount.map(count => seq.map(i => s"Plus${count}_X${i}").mkString(s"zsg.ZTuple${seq.size}[", " , ", "]")).mkString(" , ")
  }

  def Tuple2Group[T](i: List[T])(groupSize: Int)(on: T => List[List[Int]]): List[List[Int]] = {
    if (i.size > 1) {
      Tuple2Group(i.grouped(groupSize).to(List).map(_.zipWithIndex.to(List)))(groupSize)(s => s.flatMap { case (item, index) => on(item).map(p => index :: p) })
    } else {
      i.flatMap(on)
    }
  }

  def Tuple2_Index_To_ScalaTuple_Index(tupleSize: Int): String = {
    (1 to tupleSize).map(s => s"_${s} = x.i${s}").mkString(s"Tuple${tupleSize}(", " , ", ")")
  }

  def Tuple2_Index_To_DebugCaseClass_Index(tupleSize: Int): String = {
    if (tupleSize == 1) {
      s"d1 = tuple.i1"
    } else {
      val result = Tuple2Group((1 to tupleSize).map(_ => List.empty[Int]).to(List))(groupSize = 22)(i => List(i: List[Int]))
      result.zipWithIndex.map { case (item, index) => item.map(p => s".i${p + 1}").mkString(s"d${index + 1} = tuple", "", "") }.mkString(" , ")
    }
  }

}
