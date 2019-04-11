package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait EatItem extends Any {

  type SelfType <: PItem1PP
  def selfItem: SelfType

  type ToPItem1[TT <: PItem1PP, T] <: PItem2PP
  type ToPItem2[TT <: PItem2PP, T] <: PItem2PP

  def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): ToPItem1[TT, T]
  def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): ToPItem2[TT, T]

  type AddRightItem[T] = ToPItem1[SelfType, T]
  def addRightItem[T](t: T): ToPItem1[SelfType, T] = toPItem1(selfItem, t)

  type RightSub <: PItem1PP
  type RightReplace[T <: PItem1PP] <: PItem1PP

  def rightSub: RightSub
  def rightReplace[T <: PItem1PP](t: T): RightReplace[T]

  type RightDrop <: PItem1PP
  type DropIO <: RightDropIO
  type DropRightItem

  def rightDrop: RightDrop
  def dropIO: DropIO
  def dropRightItem: DropRightItem

}

trait EatValue0 extends Any {
  self =>

  type AddRightItem[T] = EatValue1[T]

  def addRightItem[T](t: T): EatValue1[T] = new EatValue1(t)

}

object EatValue0 extends EatValue0

class EatValue1[T1](val value1: T1) extends AnyVal with EatItem with PItem1PP {
  self =>

  override type SelfType = EatValue1[T1]
  override def selfItem: EatValue1[T1] = self

  override type TT1 = EatValue1[T1]
  override def i1: EatValue1[T1] = self

  override type ToPItem1[TT <: PItem1PP, T] = EatValue2[T1, T]
  override type ToPItem2[TT <: PItem2PP, T] = Dadao[TT#TT1, TT#TT2#ToPItem1[TT#TT2, T]]

  //这踏马也不能动了
  override def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): EatValue2[T1, T] = {
    println("77" * 10)
    new EatValue2[T1, T] {
      override val value1: T1 = self.value1
      override val value2     = t
    }
  }

  //这踏马不能动了
  override def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): Dadao[TT#TT1, TT#TT2#ToPItem1[TT#TT2, T]] = {
    println("88" * 10)
    new Dadao[TT#TT1, TT#TT2#ToPItem1[TT#TT2, T]] {
      override val i1 = tt.i1
      override val i2 = tt.i2.toPItem1(tt.i2, t)
    }
  }

  override type RightSub                    = NotUse
  override type RightReplace[T <: PItem1PP] = NotUse

  override def rightSub: NotUse                          = NotUse
  override def rightReplace[T <: PItem1PP](t: T): NotUse = NotUse

  override type RightDrop     = NotUse
  override type DropIO        = EatValue1RightDropIO
  override type DropRightItem = T1

  override def rightDrop: NotUse            = NotUse
  override def dropIO: EatValue1RightDropIO = EatValue1RightDropIO
  override def dropRightItem: T1            = self.value1

  override def toString: String = {
    val ii =
      s"""i1: ${self.value1}""".stripMargin.split("\n").filterNot(_.isEmpty).map(s => s"  ${s}").mkString("\n")
    s"EatValue1:\n${ii}"
  }

}

trait EatValue2[T1, T2] extends Any with EatItem with PItem2PP {
  self =>

  override type SelfType = EatValue2[T1, T2]
  override def selfItem: EatValue2[T1, T2] = self

  def value1: T1
  def value2: T2

  override type TT1 = EatValue1[T1]
  override type TT2 = EatValue1[T2]
  override def i1: EatValue1[T1] = new EatValue1(self.value1)
  override def i2: EatValue1[T2] = new EatValue1(self.value2)

  override type ToPItem1[TT <: PItem1PP, T] = Dadao[TT, EatValue1[T]]
  override type ToPItem2[TT <: PItem2PP, T] = PItem2[TT, EatValue1[T]]

  //这踏马暂时也无法动了
  override def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): Dadao[TT, EatValue1[T]] = {
    println("55" * 10)
    new Dadao[TT, EatValue1[T]] {
      override val i1 = tt
      override val i2 = new EatValue1(t)
    }
  }

  //这里要有大盗
  override def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): PItem2[TT, EatValue1[T]] = {
    println("66" * 10)
    new PItem2[TT, EatValue1[T]] {
      override val i1 = tt
      override val i2 = new EatValue1(t)
    }
  }

  override type RightSub                    = NotUse
  override type RightReplace[T <: PItem1PP] = NotUse

  override def rightSub: NotUse                          = NotUse
  override def rightReplace[T <: PItem1PP](t: T): NotUse = NotUse

  override type RightDrop     = EatValue1[T1]
  override type DropIO        = EatValue2RightDropIO
  override type DropRightItem = T2

  override def rightDrop: EatValue1[T1]     = new EatValue1[T1](self.value1)
  override def dropIO: EatValue2RightDropIO = EatValue2RightDropIO
  override def dropRightItem: T2            = self.value2

  override def toString: String = {
    val ii =
      s"""
         |i1: ${self.value1}
         |i2: ${self.value2}""".stripMargin.split("\n").filterNot(_.isEmpty).map(s => s"  ${s}").mkString("\n")
    s"EatValue2:\n${ii}"
  }

}

trait PItem1PP extends Any with EatItem {
  type TT1 <: PItem1PP
  def i1: TT1
}

trait PItem2PP extends Any with PItem1PP with EatItem {
  override type TT1 <: PItem1PP
  type TT2 <: PItem1PP

  override def i1: TT1
  def i2: TT2
}

trait PItem2[T1 <: PItem1PP, T2 <: PItem1PP] extends Any with PItem2PP with EatItem {
  self =>

  override type TT1 = T1
  override type TT2 = T2

  override def i1: T1
  override def i2: T2

  override type SelfType = PItem2[T1, T2]
  override def selfItem: PItem2[T1, T2] = self

  override type ToPItem1[TT <: PItem1PP, T] = ({
    type II   = T2#ToPItem1[T2, T]
    type IIII = Dadao[Dadao[T1, II#TT1], II#TT2]
  })#IIII
  override type ToPItem2[TT <: PItem2PP, T] = PItem2[TT#TT1, T2#ToPItem2[SelfType, T]]

  override def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): ({
    type II   = T2#ToPItem1[T2, T]
    type IIII = Dadao[Dadao[T1, II#TT1], II#TT2]
  })#IIII = {
    println("44" * 10)
    type II = T2#ToPItem1[T2, T]
    val ii = self.i2.toPItem1(self.i2, t)
    new Dadao[Dadao[T1, II#TT1], II#TT2] {
      override val i1 = new Dadao[T1, II#TT1] {
        override val i1 = self.i1
        override val i2 = ii.i1
      }
      override val i2 = ii.i2
    }
  }

  override def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): PItem2[TT#TT1, T2#ToPItem2[SelfType, T]] = {
    println("33" * 10)
    new PItem2[TT#TT1, T2#ToPItem2[SelfType, T]] {
      override val i1 = tt.i1
      override val i2 = self.i2.toPItem2(self.selfItem, t)
    }
  }

  override type RightSub                    = T2
  override type RightReplace[T <: PItem1PP] = PItem2[T1, T]

  override def rightSub: T2 = i2
  override def rightReplace[T <: PItem1PP](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }

  override type RightDrop     = T1
  override type DropIO        = RightSub#DropIO#UpToPItem2
  override type DropRightItem = T2#DropRightItem

  override def rightDrop: T1                      = self.i1
  override def dropIO: RightSub#DropIO#UpToPItem2 = rightSub.dropIO.upToPItem2
  override def dropRightItem: T2#DropRightItem    = self.i2.dropRightItem

  override def toString: String = {
    val ii =
      s"""
         |i1: ${i1}
         |i2: ${i2}
       """.stripMargin.split("\n").filterNot(_.trim.isEmpty).map(s => s"  ${s}").mkString("\n")
    s"PItem2:\n${ii}"
  }

}

trait Dadao[T1 <: PItem1PP, T2 <: PItem1PP] extends Any with PItem2PP with EatItem {
  self =>

  override type SelfType = Dadao[T1, T2]
  override def selfItem: Dadao[T1, T2] = self

  override type TT1 = T1
  override type TT2 = T2

  override def i1: T1
  override def i2: T2

  override type ToPItem1[TT <: PItem1PP, T] = SelfType#ToPItem2[SelfType, T]
  override type ToPItem2[TT <: PItem2PP, T] = PItem2[TT#TT1, T2#ToPItem1[T2, T]]

  override def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): SelfType#ToPItem2[SelfType, T] = {
    println("11" * 10)
    selfItem.toPItem2(selfItem, t)
  }

  override def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): PItem2[TT#TT1, T2#ToPItem1[T2, T]] = {
    println("22" * 10)
    new PItem2[TT#TT1, T2#ToPItem1[T2, T]] {
      override val i1 = tt.i1
      override val i2 = self.i2.toPItem1(self.i2, t)
    }
  }

  override type RightSub                    = T2
  override type RightReplace[T <: PItem1PP] = PItem2[T1, T]

  override def rightSub: T2 = i2
  override def rightReplace[T <: PItem1PP](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }

  override type RightDrop     = T1
  override type DropIO        = RightSub#DropIO#UpToPItem2
  override type DropRightItem = T2#DropRightItem

  override def rightDrop: T1                      = self.i1
  override def dropIO: RightSub#DropIO#UpToPItem2 = rightSub.dropIO.upToPItem2
  override def dropRightItem: T2#DropRightItem    = self.i2.dropRightItem

  override def toString: String = {
    val ii = s"""|i1: ${i1}
         |i2: ${i2}
       """.stripMargin.split("\n").filterNot(_.trim.isEmpty).map(s => s"  ${s}").mkString("\n")
    s"Dadao:\n${ii}"
  }

}

object E {
  val item0: EatValue0 = EatValue0
}

/*
EatValue1:
  i1: 1




77777777777777777777
EatValue2:
  i1: 1
  i2: 2




77777777777777777777
55555555555555555555
Dadao:
  i1: EatValue2:
    i1: 1
    i2: 2
  i2: EatValue1:
    i1: 3




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
PItem2:
  i1: EatValue2:
    i1: 1
    i2: 2
  i2: EatValue2:
    i1: 3
    i2: 4




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: EatValue2:
      i1: 1
      i2: 2
    i2: EatValue2:
      i1: 3
      i2: 4
  i2: EatValue1:
    i1: 5




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
PItem2:
  i1: Dadao:
    i1: EatValue2:
      i1: 1
      i2: 2
    i2: EatValue2:
      i1: 3
      i2: 4
  i2: EatValue2:
    i1: 5
    i2: 6




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: EatValue2:
        i1: 1
        i2: 2
      i2: EatValue2:
        i1: 3
        i2: 4
    i2: EatValue2:
      i1: 5
      i2: 6
  i2: EatValue1:
    i1: 7




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
PItem2:
  i1: Dadao:
    i1: Dadao:
      i1: EatValue2:
        i1: 1
        i2: 2
      i2: EatValue2:
        i1: 3
        i2: 4
    i2: EatValue2:
      i1: 5
      i2: 6
  i2: EatValue2:
    i1: 7
    i2: 8




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: EatValue2:
          i1: 1
          i2: 2
        i2: EatValue2:
          i1: 3
          i2: 4
      i2: EatValue2:
        i1: 5
        i2: 6
    i2: EatValue2:
      i1: 7
      i2: 8
  i2: EatValue1:
    i1: 9




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
PItem2:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: EatValue2:
          i1: 1
          i2: 2
        i2: EatValue2:
          i1: 3
          i2: 4
      i2: EatValue2:
        i1: 5
        i2: 6
    i2: EatValue2:
      i1: 7
      i2: 8
  i2: EatValue2:
    i1: 9
    i2: 10




77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: EatValue2:
            i1: 1
            i2: 2
          i2: EatValue2:
            i1: 3
            i2: 4
        i2: EatValue2:
          i1: 5
          i2: 6
      i2: EatValue2:
        i1: 7
        i2: 8
    i2: EatValue2:
      i1: 9
      i2: 10
  i2: EatValue1:
    i1: 11




分隔线
77777777777777777777
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
分隔线
PItem2:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: EatValue2:
            i1: 1
            i2: 2
          i2: EatValue2:
            i1: 3
            i2: 4
        i2: EatValue2:
          i1: 5
          i2: 6
      i2: EatValue2:
        i1: 7
        i2: 8
    i2: EatValue2:
      i1: 9
      i2: 10
  i2: EatValue2:
    i1: 11
    i2: 12




44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: Dadao:
            i1: EatValue2:
              i1: 1
              i2: 2
            i2: EatValue2:
              i1: 3
              i2: 4
          i2: EatValue2:
            i1: 5
            i2: 6
        i2: EatValue2:
          i1: 7
          i2: 8
      i2: EatValue2:
        i1: 9
        i2: 10
    i2: EatValue2:
      i1: 11
      i2: 12
  i2: EatValue1:
    i1: 13




分隔线
44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
分隔线
PItem2:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: Dadao:
            i1: EatValue2:
              i1: 1
              i2: 2
            i2: EatValue2:
              i1: 3
              i2: 4
          i2: EatValue2:
            i1: 5
            i2: 6
        i2: EatValue2:
          i1: 7
          i2: 8
      i2: EatValue2:
        i1: 9
        i2: 10
    i2: EatValue2:
      i1: 11
      i2: 12
  i2: EatValue2:
    i1: 13
    i2: 14




44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: Dadao:
            i1: Dadao:
              i1: EatValue2:
                i1: 1
                i2: 2
              i2: EatValue2:
                i1: 3
                i2: 4
            i2: EatValue2:
              i1: 5
              i2: 6
          i2: EatValue2:
            i1: 7
            i2: 8
        i2: EatValue2:
          i1: 9
          i2: 10
      i2: EatValue2:
        i1: 11
        i2: 12
    i2: EatValue2:
      i1: 13
      i2: 14
  i2: EatValue1:
    i1: 15




44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
PItem2:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: Dadao:
            i1: Dadao:
              i1: EatValue2:
                i1: 1
                i2: 2
              i2: EatValue2:
                i1: 3
                i2: 4
            i2: EatValue2:
              i1: 5
              i2: 6
          i2: EatValue2:
            i1: 7
            i2: 8
        i2: EatValue2:
          i1: 9
          i2: 10
      i2: EatValue2:
        i1: 11
        i2: 12
    i2: EatValue2:
      i1: 13
      i2: 14
  i2: EatValue2:
    i1: 15
    i2: 16




44444444444444444444
55555555555555555555
11111111111111111111
22222222222222222222
77777777777777777777
44444444444444444444
55555555555555555555
Dadao:
  i1: Dadao:
    i1: Dadao:
      i1: Dadao:
        i1: Dadao:
          i1: Dadao:
            i1: Dadao:
              i1: Dadao:
                i1: EatValue2:
                  i1: 1
                  i2: 2
                i2: EatValue2:
                  i1: 3
                  i2: 4
              i2: EatValue2:
                i1: 5
                i2: 6
            i2: EatValue2:
              i1: 7
              i2: 8
          i2: EatValue2:
            i1: 9
            i2: 10
        i2: EatValue2:
          i1: 11
          i2: 12
      i2: EatValue2:
        i1: 13
        i2: 14
    i2: EatValue2:
      i1: 15
      i2: 16
  i2: EatValue1:
    i1: 32
 */
