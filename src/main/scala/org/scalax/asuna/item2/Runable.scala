package org.scalax.asuna.mapper.item

object App extends App {

  type II1  = String
  type II2  = String
  type II3  = Int
  type II4  = String
  type II5  = Int
  type II6  = String
  type II7  = String
  type II8  = String
  type II9  = Int
  type II10 = String

  //val bb = E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5)

  println(E.item0.addRightItem("1").toString + "\n\n\n\n")
  println(E.item0.addRightItem("1").addRightItem("2").toString + "\n\n\n\n")
  println(E.item0.addRightItem("1").addRightItem("2").addRightItem(3).toString + "\n\n\n\n")
  println(E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").toString + "\n\n\n\n")
  println(E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5).toString + "\n\n\n\n")

  println(E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5).addRightItem("6").toString + "\n\n\n\n")
  println(E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5).addRightItem("6").addRightItem("7").toString + "\n\n\n\n")
  println(
    E.item0
      .addRightItem("1")
      .addRightItem("2")
      .addRightItem(3)
      .addRightItem("4")
      .addRightItem(5)
      .addRightItem("6")
      .addRightItem("7")
      .addRightItem("8")
      .toString + "\n\n\n\n")
  println(
    E.item0
      .addRightItem("1")
      .addRightItem("2")
      .addRightItem(3)
      .addRightItem("4")
      .addRightItem(5)
      .addRightItem("6")
      .addRightItem("7")
      .addRightItem("8")
      .addRightItem(9)
      .toString + "\n\n\n\n")
  println(
    E.item0
      .addRightItem("1")
      .addRightItem("2")
      .addRightItem(3)
      .addRightItem("4")
      .addRightItem(5)
      .addRightItem("6")
      .addRightItem("7")
      .addRightItem("8")
      .addRightItem(9)
      .addRightItem(10)
      .toString + "\n\n\n\n")
  println(
    E.item0
      .addRightItem("1")
      .addRightItem("2")
      .addRightItem(3)
      .addRightItem("4")
      .addRightItem(5)
      .addRightItem("6")
      .addRightItem("7")
      .addRightItem("8")
      .addRightItem(9)
      .addRightItem(10)
      .addRightItem(11)
      .toString + "\n\n\n\n")

  println("分隔线")
  val dd = E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5).addRightItem("6")
  val cc = dd.addRightItem("7").addRightItem("8").addRightItem(9).addRightItem(10).addRightItem(11).addRightItem(12)
  println("分隔线")

  println(cc.toString + "\n\n\n\n")
  println(cc.addRightItem("13").toString + "\n\n\n\n")

  println("分隔线")
  val ee = cc.addRightItem("13").addRightItem("14")
  println("分隔线")

  println(ee.toString + "\n\n\n\n")
  println(ee.addRightItem("15").toString + "\n\n\n\n")
  println(ee.addRightItem("15").addRightItem(16).toString + "\n\n\n\n")
  println(ee.addRightItem("15").addRightItem(16).addRightItem(32).toString + "\n\n\n\n")

  /*val i1  = cc.dropRight
  val i2  = i1.dropRight
  val i3  = i2.dropRight
  val i4  = i3.dropRight
  val i5  = i4.dropRight
  val i6  = i5.dropRight
  val i7  = i6.dropRight
  val i8  = i7.dropRight
  val i9  = i8.dropRight
  val i10 = i9.dropRight
  val i11 = i10.dropRight
  val i12 = i11.dropRight

  println(i1)
  println(i2)
  println(i3)
  println(i4)
  println(i5)
  println(i6)
  println(i7)
  println(i8)
  println(i9)
  println(i10)
  println(i11)*/

}

/*
EatValue1:
  i1: 1

EatValue2:
  i1: 1
  i2: 2

PItem2:
  i1: EatValue2:
    i1: 1
    i2: 2
  i2: EatValue1:
    i1: 3

PItem2:
  i1: EatValue2:
    i1: 1
    i2: 2
  i2: EatValue2:
    i1: 3
    i2: 4

Dadao:
  i1: PItem2:
    i1: EatValue2:
      i1: 1
      i2: 2
    i2: EatValue2:
      i1: 3
      i2: 4
  i2: EatValue1:
    i1: 5

PItem2:
  i1: PItem2:
    i1: EatValue2:
      i1: 1
      i2: 2
    i2: EatValue2:
      i1: 3
      i2: 4
  i2: EatValue2:
    i1: 5
    i2: 6

Dadao:
  i1: PItem2:
    i1: PItem2:
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

PItem2:
  i1: PItem2:
    i1: PItem2:
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

Dadao:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
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

PItem2:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
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

Dadao:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
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

PItem2:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
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

Dadao:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
          i1: PItem2:
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

PItem2:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
          i1: PItem2:
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

Dadao:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
          i1: PItem2:
            i1: PItem2:
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

PItem2:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
          i1: PItem2:
            i1: PItem2:
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

Dadao:
  i1: PItem2:
    i1: PItem2:
      i1: PItem2:
        i1: PItem2:
          i1: PItem2:
            i1: PItem2:
              i1: PItem2:
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
