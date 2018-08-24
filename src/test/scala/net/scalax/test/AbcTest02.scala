package net.scalax.asuna

import net.scalax.asuna.helper.{ CaseModelContent, CaseModelContent1111 }

import scala.language.higherKinds
import shapeless._

case class Abc[T[_]](
  i01: String,
  i02: String,
  i03: String,
  i04: String,
  i05: String,
  i06: String,
  i07: String,
  i08: String,
  i09: String,
  i10: String,
  i11: String,
  i12: String,
  i13: String,
  i14: String,
  i15: T[String],
  i16: List[String],
  i17: String,
  i18: String,
  i19: Int,
  i20: Long)

object AbcTest02 extends App {

  val times = 10000000
  val timesCol = 1 to times
  val preTimes = 4000000
  val preTimesCol = 1 to times

  val pro15 = Option("i15")
  val pro16 = List("i16")

  def aa = "i01" :: "i02" :: "i03" :: "i04" :: "i05" :: "i06" :: "i07" :: "i08" :: "i09" :: "i10" :: "i11" :: "i12" :: "i13" :: "i14" :: pro15 :: pro16 :: "i17" :: "i18" :: 19 :: 20L :: HNil

  trait bb[Case] {
    def cc[H](implicit gen: Generic.Aux[Case, H]): Generic.Aux[Case, H] = gen
  }
  val gen = new bb[Abc[Option]] {}.cc
  for (_ <- preTimesCol) {
    gen.from(aa): Abc[Option]
  }
  val sysTimes1 = System.currentTimeMillis
  for (_ <- timesCol) {
    gen.from(aa): Abc[Option]
  }
  val sysTimes2 = System.currentTimeMillis
  println(s"HList 设值器设值 ${times} 次用了 ${sysTimes2 - sysTimes1} 毫秒")

  val dt = {
    val a1 = scala.collection.mutable.Map.empty[Symbol, Any]
    a1 += (('i01, "i01"))
    a1 += (('i02, "i02"))
    a1 += (('i03, "i03"))
    a1 += (('i04, "i04"))
    a1 += (('i05, "i05"))
    a1 += (('i06, "i06"))
    a1 += (('i07, "i07"))
    a1 += (('i08, "i08"))
    a1 += (('i09, "i09"))
    a1 += (('i10, "i10"))
    a1 += (('i11, "i11"))
    a1 += (('i12, "i12"))
    a1 += (('i13, "i13"))
    a1 += (('i14, "i14"))
    a1 += (('i15, pro15))
    a1 += (('i16, pro16))
    a1 += (('i17, "i17"))
    a1 += (('i18, "i18"))
    a1 += (('i19, 19))
    a1 += (('i20, 20L))
    a1
  }

  for (_ <- preTimesCol) {
    Abc(
      i01 = dt('i01).asInstanceOf[String],
      i02 = dt('i02).asInstanceOf[String],
      i03 = dt('i03).asInstanceOf[String],
      i04 = dt('i04).asInstanceOf[String],
      i05 = dt('i05).asInstanceOf[String],
      i06 = dt('i06).asInstanceOf[String],
      i07 = dt('i07).asInstanceOf[String],
      i08 = dt('i08).asInstanceOf[String],
      i09 = dt('i09).asInstanceOf[String],
      i10 = dt('i10).asInstanceOf[String],
      i11 = dt('i11).asInstanceOf[String],
      i12 = dt('i12).asInstanceOf[String],
      i13 = dt('i13).asInstanceOf[String],
      i14 = dt('i14).asInstanceOf[String],
      i15 = dt('i15).asInstanceOf[Option[String]],
      i16 = dt('i16).asInstanceOf[List[String]],
      i17 = dt('i17).asInstanceOf[String],
      i18 = dt('i18).asInstanceOf[String],
      i19 = dt('i19).asInstanceOf[Int],
      i20 = dt('i20).asInstanceOf[Long]): Abc[Option]
  }

  val sysTimes3 = System.currentTimeMillis
  for (_ <- timesCol) {
    Abc(
      i01 = dt('i01).asInstanceOf[String],
      i02 = dt('i02).asInstanceOf[String],
      i03 = dt('i03).asInstanceOf[String],
      i04 = dt('i04).asInstanceOf[String],
      i05 = dt('i05).asInstanceOf[String],
      i06 = dt('i06).asInstanceOf[String],
      i07 = dt('i07).asInstanceOf[String],
      i08 = dt('i08).asInstanceOf[String],
      i09 = dt('i09).asInstanceOf[String],
      i10 = dt('i10).asInstanceOf[String],
      i11 = dt('i11).asInstanceOf[String],
      i12 = dt('i12).asInstanceOf[String],
      i13 = dt('i13).asInstanceOf[String],
      i14 = dt('i14).asInstanceOf[String],
      i15 = dt('i15).asInstanceOf[Option[String]],
      i16 = dt('i16).asInstanceOf[List[String]],
      i17 = dt('i17).asInstanceOf[String],
      i18 = dt('i18).asInstanceOf[String],
      i19 = dt('i19).asInstanceOf[Int],
      i20 = dt('i20).asInstanceOf[Long]): Abc[Option]
  }
  val sysTimes4 = System.currentTimeMillis
  println(s"mutable.Map 设值器设值 ${times} 次用了 ${sysTimes4 - sysTimes3} 毫秒")

  val caseContect = CaseModelContent.getInstance[Abc[Option]]

  def arrContent = {
    val arr = new Array[Any](20)
    caseContect.set(arr, 'i01, "i01")
    caseContect.set(arr, 'i02, "i02")
    caseContect.set(arr, 'i03, "i03")
    caseContect.set(arr, 'i04, "i04")
    caseContect.set(arr, 'i05, "i05")
    caseContect.set(arr, 'i06, "i06")
    caseContect.set(arr, 'i07, "i07")
    caseContect.set(arr, 'i08, "i08")
    caseContect.set(arr, 'i09, "i09")
    caseContect.set(arr, 'i10, "i10")
    caseContect.set(arr, 'i11, "i11")
    caseContect.set(arr, 'i12, "i12")
    caseContect.set(arr, 'i13, "i13")
    caseContect.set(arr, 'i14, "i14")
    caseContect.set(arr, 'i15, pro15)
    caseContect.set(arr, 'i16, pro16)
    caseContect.set(arr, 'i17, "i17")
    caseContect.set(arr, 'i18, "i18")
    caseContect.set(arr, 'i19, 19)
    caseContect.set(arr, 'i20, 20L)
    arr
  }

  for (_ <- preTimesCol) {
    caseContect.toModel(arrContent): Abc[Option]
  }

  val sysTimes5 = System.currentTimeMillis
  for (_ <- timesCol) {
    caseContect.toModel(arrContent): Abc[Option]
  }
  val sysTimes6 = System.currentTimeMillis
  println(s"Array 设值器设值 ${times} 次用了 ${sysTimes6 - sysTimes5} 毫秒")

  val caseContect1111 = CaseModelContent1111.getInstance[Abc[Option]]

  def arrContent1111 = {
    val i01 = CaseModelContent1111.set6(CaseModelContent1111.emptySetter, 'i01, "i01", 'i02, "i02", 'i03, "i03", 'i04, "i04", 'i05, "i05", 'i06, "i06", 'i07, "i07", 'i08, "i08", 'i09, "i09", 'i10, "i10")
    CaseModelContent1111.set6(i01, 'i11, "i11", 'i12, "i12", 'i13, "i13", 'i14, "i14", 'i15, pro15, 'i16, pro16, 'i17, "i17", 'i18, "i18", 'i19, 19, 'i20, 20L)
  }

  for (_ <- preTimesCol) {
    caseContect1111.toModel(arrContent1111): Abc[Option]
  }

  val sysTimes7 = System.currentTimeMillis
  for (_ <- timesCol) {
    caseContect1111.toModel(arrContent1111): Abc[Option]
  }
  val sysTimes8 = System.currentTimeMillis
  println(s"Function 设值器设值 ${times} 次用了 ${sysTimes8 - sysTimes7} 毫秒")

}