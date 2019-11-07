package asuna
import asuna.support.heterogeneous._
trait HListPlus_8_5 {
  final def plusWithTypeParameter8[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X3_C8,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X4_C8,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X5_C8,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5
  ]: Plus5[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil,
    X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil,
    X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil,
    X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
    Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil,
    Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil,
    Y4 :: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil,
    Y5 :: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil
  ] =
    new Plus5[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil,
      X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil,
      X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil,
      X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
      Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil,
      Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil,
      Y4 :: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil,
      Y5 :: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil
    ] {
      final override def takeHead1(
        z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil
      ): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil                                         = z.tail
      final override def takeTail1(z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil): Y1 = z.head
      final override def plus1(
        x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
        y: Y1
      ): Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil = x.::(y)
      final override def takeHead2(
        z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil
      ): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil                                         = z.tail
      final override def takeTail2(z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil): Y2 = z.head
      final override def plus2(
        x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil,
        y: Y2
      ): Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: HNil = x.::(y)
      final override def takeHead3(
        z: Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil
      ): X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil                                         = z.tail
      final override def takeTail3(z: Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil): Y3 = z.head
      final override def plus3(
        x: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil,
        y: Y3
      ): Y3 :: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: X3_C8 :: HNil = x.::(y)
      final override def takeHead4(
        z: Y4 :: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil
      ): X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil                                         = z.tail
      final override def takeTail4(z: Y4 :: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil): Y4 = z.head
      final override def plus4(
        x: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil,
        y: Y4
      ): Y4 :: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: X4_C6 :: X4_C7 :: X4_C8 :: HNil = x.::(y)
      final override def takeHead5(
        z: Y5 :: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil
      ): X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil                                         = z.tail
      final override def takeTail5(z: Y5 :: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil): Y5 = z.head
      final override def plus5(
        x: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil,
        y: Y5
      ): Y5 :: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: X5_C6 :: X5_C7 :: X5_C8 :: HNil = x.::(y)
    }
}
