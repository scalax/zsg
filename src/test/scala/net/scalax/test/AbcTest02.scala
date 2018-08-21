package net.scalax.asuna

import shapeless._

case class Abc(
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
  i15: String,
  i16: String,
  i17: String,
  i18: String,
  i19: Int,
  i20: Long)

object AbcTest02 extends App {

  val times = 10000000
  val timesCol = 1 to times
  val preTimes = 4000000
  val preTimesCol = 1 to times

  trait bb[Case] {
    def cc[H](implicit gen: Generic.Aux[Case, H]): Generic.Aux[Case, H] = gen
  }
  val gen = new bb[Abc] {}.cc
  for (_ <- preTimesCol) {
    val aa = "i01" :: "i02" :: "i03" :: "i04" :: "i05" :: "i06" :: "i07" :: "i08" :: "i09" :: "i10" :: "i11" :: "i12" :: "i13" :: "i14" :: "i15" :: "i16" :: "i17" :: "i18" :: 19 :: 20L :: HNil
    gen.from(aa): Abc
  }
  val sysTimes1 = System.currentTimeMillis
  for (_ <- timesCol) {
    val aa = "i01" :: "i02" :: "i03" :: "i04" :: "i05" :: "i06" :: "i07" :: "i08" :: "i09" :: "i10" :: "i11" :: "i12" :: "i13" :: "i14" :: "i15" :: "i16" :: "i17" :: "i18" :: 19 :: 20L :: HNil
    gen.from(aa): Abc
  }
  val sysTimes2 = System.currentTimeMillis
  println(s"设值 ${times} 次用了 ${sysTimes2 - sysTimes1} 毫秒")

  val dt = scala.collection.mutable.Map.empty[Symbol, Any]
  dt += (('i01, "i01"))
  dt += (('i02, "i02"))
  dt += (('i03, "i03"))
  dt += (('i04, "i04"))
  dt += (('i05, "i05"))
  dt += (('i06, "i06"))
  dt += (('i07, "i07"))
  dt += (('i08, "i08"))
  dt += (('i09, "i09"))
  dt += (('i10, "i10"))
  dt += (('i11, "i11"))
  dt += (('i12, "i12"))
  dt += (('i13, "i13"))
  dt += (('i14, "i14"))
  dt += (('i15, "i15"))
  dt += (('i16, "i16"))
  dt += (('i17, "i17"))
  dt += (('i18, "i18"))
  dt += (('i19, 19))
  dt += (('i20, 20L))

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
      i15 = dt('i15).asInstanceOf[String],
      i16 = dt('i16).asInstanceOf[String],
      i17 = dt('i17).asInstanceOf[String],
      i18 = dt('i18).asInstanceOf[String],
      i19 = dt('i19).asInstanceOf[Int],
      i20 = dt('i20).asInstanceOf[Long]): Abc
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
      i15 = dt('i15).asInstanceOf[String],
      i16 = dt('i16).asInstanceOf[String],
      i17 = dt('i17).asInstanceOf[String],
      i18 = dt('i18).asInstanceOf[String],
      i19 = dt('i19).asInstanceOf[Int],
      i20 = dt('i20).asInstanceOf[Long]): Abc
  }
  val sysTimes4 = System.currentTimeMillis
  println(s"设值 ${times} 次用了 ${sysTimes4 - sysTimes3} 毫秒")

  def set(arr: Array[Any], key: Symbol, value: Any): Unit = {
    if ('i01 eq key) {
      arr(0) = value
    } else if ('i02 eq key) {
      arr(1) = value
    } else if ('i03 eq key) {
      arr(2) = value
    } else if ('i04 eq key) {
      arr(3) = value
    } else if ('i05 eq key) {
      arr(4) = value
    } else if ('i06 eq key) {
      arr(5) = value
    } else if ('i07 eq key) {
      arr(6) = value
    } else if ('i08 eq key) {
      arr(7) = value
    } else if ('i09 eq key) {
      arr(8) = value
    } else if ('i10 eq key) {
      arr(9) = value
    } else if ('i11 eq key) {
      arr(10) = value
    } else if ('i12 eq key) {
      arr(11) = value
    } else if ('i13 eq key) {
      arr(12) = value
    } else if ('i14 eq key) {
      arr(13) = value
    } else if ('i15 eq key) {
      arr(14) = value
    } else if ('i16 eq key) {
      arr(15) = value
    } else if ('i17 eq key) {
      arr(16) = value
    } else if ('i18 eq key) {
      arr(17) = value
    } else if ('i19 eq key) {
      arr(18) = value
    } else if ('i20 eq key) {
      arr(19) = value
    }
  }

  def get(arr: Array[Any], key: Symbol): Any = {
    if ('i01 eq key) {
      arr(0)
    } else if ('i02 eq key) {
      arr(1)
    } else if ('i03 eq key) {
      arr(2)
    } else if ('i04 eq key) {
      arr(3)
    } else if ('i05 eq key) {
      arr(4)
    } else if ('i06 eq key) {
      arr(5)
    } else if ('i07 eq key) {
      arr(6)
    } else if ('i08 eq key) {
      arr(7)
    } else if ('i09 eq key) {
      arr(8)
    } else if ('i10 eq key) {
      arr(9)
    } else if ('i11 eq key) {
      arr(10)
    } else if ('i12 eq key) {
      arr(11)
    } else if ('i13 eq key) {
      arr(12)
    } else if ('i14 eq key) {
      arr(13)
    } else if ('i15 eq key) {
      arr(14)
    } else if ('i16 eq key) {
      arr(15)
    } else if ('i17 eq key) {
      arr(16)
    } else if ('i18 eq key) {
      arr(17)
    } else if ('i19 eq key) {
      arr(18)
    } else if ('i20 eq key) {
      arr(19)
    }
  }

  for (_ <- preTimesCol) {
    val arr = new Array[Any](20)
    set(arr, 'i01, "i01")
    set(arr, 'i02, "i02")
    set(arr, 'i03, "i03")
    set(arr, 'i04, "i04")
    set(arr, 'i05, "i05")
    set(arr, 'i06, "i06")
    set(arr, 'i07, "i07")
    set(arr, 'i08, "i08")
    set(arr, 'i09, "i09")
    set(arr, 'i10, "i10")
    set(arr, 'i11, "i11")
    set(arr, 'i12, "i12")
    set(arr, 'i13, "i13")
    set(arr, 'i14, "i14")
    set(arr, 'i15, "i15")
    set(arr, 'i16, "i16")
    set(arr, 'i17, "i17")
    set(arr, 'i18, "i18")
    set(arr, 'i19, 19)
    set(arr, 'i20, 20L)

    Abc(
      i01 = get(arr, 'i01).asInstanceOf[String],
      i02 = get(arr, 'i02).asInstanceOf[String],
      i03 = get(arr, 'i03).asInstanceOf[String],
      i04 = get(arr, 'i04).asInstanceOf[String],
      i05 = get(arr, 'i05).asInstanceOf[String],
      i06 = get(arr, 'i06).asInstanceOf[String],
      i07 = get(arr, 'i07).asInstanceOf[String],
      i08 = get(arr, 'i08).asInstanceOf[String],
      i09 = get(arr, 'i09).asInstanceOf[String],
      i10 = get(arr, 'i10).asInstanceOf[String],
      i11 = get(arr, 'i11).asInstanceOf[String],
      i12 = get(arr, 'i12).asInstanceOf[String],
      i13 = get(arr, 'i13).asInstanceOf[String],
      i14 = get(arr, 'i14).asInstanceOf[String],
      i15 = get(arr, 'i15).asInstanceOf[String],
      i16 = get(arr, 'i16).asInstanceOf[String],
      i17 = get(arr, 'i17).asInstanceOf[String],
      i18 = get(arr, 'i18).asInstanceOf[String],
      i19 = get(arr, 'i19).asInstanceOf[Int],
      i20 = get(arr, 'i20).asInstanceOf[Long]): Abc
  }

  val sysTimes5 = System.currentTimeMillis
  for (_ <- timesCol) {
    val arr = new Array[Any](20)
    set(arr, 'i01, "i01")
    set(arr, 'i02, "i02")
    set(arr, 'i03, "i03")
    set(arr, 'i04, "i04")
    set(arr, 'i05, "i05")
    set(arr, 'i06, "i06")
    set(arr, 'i07, "i07")
    set(arr, 'i08, "i08")
    set(arr, 'i09, "i09")
    set(arr, 'i10, "i10")
    set(arr, 'i11, "i11")
    set(arr, 'i12, "i12")
    set(arr, 'i13, "i13")
    set(arr, 'i14, "i14")
    set(arr, 'i15, "i15")
    set(arr, 'i16, "i16")
    set(arr, 'i17, "i17")
    set(arr, 'i18, "i18")
    set(arr, 'i19, 19)
    set(arr, 'i20, 20L)

    Abc(
      i01 = get(arr, 'i01).asInstanceOf[String],
      i02 = get(arr, 'i02).asInstanceOf[String],
      i03 = get(arr, 'i03).asInstanceOf[String],
      i04 = get(arr, 'i04).asInstanceOf[String],
      i05 = get(arr, 'i05).asInstanceOf[String],
      i06 = get(arr, 'i06).asInstanceOf[String],
      i07 = get(arr, 'i07).asInstanceOf[String],
      i08 = get(arr, 'i08).asInstanceOf[String],
      i09 = get(arr, 'i09).asInstanceOf[String],
      i10 = get(arr, 'i10).asInstanceOf[String],
      i11 = get(arr, 'i11).asInstanceOf[String],
      i12 = get(arr, 'i12).asInstanceOf[String],
      i13 = get(arr, 'i13).asInstanceOf[String],
      i14 = get(arr, 'i14).asInstanceOf[String],
      i15 = get(arr, 'i15).asInstanceOf[String],
      i16 = get(arr, 'i16).asInstanceOf[String],
      i17 = get(arr, 'i17).asInstanceOf[String],
      i18 = get(arr, 'i18).asInstanceOf[String],
      i19 = get(arr, 'i19).asInstanceOf[Int],
      i20 = get(arr, 'i20).asInstanceOf[Long]): Abc
  }
  val sysTimes6 = System.currentTimeMillis
  println(s"设值 ${times} 次用了 ${sysTimes6 - sysTimes5} 毫秒")

}