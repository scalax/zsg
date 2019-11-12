package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait PlusToTuple_10_2 {
  final def plusWithTypeParameter10[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X1_C9,
    X1_C10,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8,
    X2_C9,
    X2_C10,
    Y1,
    Y2
  ]: Plus2[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: HNil,
    Y1,
    Y2,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)
  ] =
    new Plus2[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: HNil,
      Y1,
      Y2,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)
    ] {
      final override def takeHead1(
        z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10)
      ): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: z._7 :: z._8 :: z._9 :: z._10 :: z._11 :: HNil
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10)): Y1 = z._1
      final override def plus1(
        x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: HNil,
        y: Y1
      ): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10) =
        (
          y,
          x.head,
          x.tail.head,
          x.tail.tail.head,
          x.tail.tail.tail.head,
          x.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
        )
      final override def takeHead2(
        z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)
      ): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: z._7 :: z._8 :: z._9 :: z._10 :: z._11 :: HNil
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)): Y2 = z._1
      final override def plus2(
        x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: HNil,
        y: Y2
      ): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10) =
        (
          y,
          x.head,
          x.tail.head,
          x.tail.tail.head,
          x.tail.tail.tail.head,
          x.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
        )
    }
}