package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait HListPlus_16_2 {
  final def plusWithTypeParameter16[
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
    X1_C11,
    X1_C12,
    X1_C13,
    X1_C14,
    X1_C15,
    X1_C16,
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
    X2_C11,
    X2_C12,
    X2_C13,
    X2_C14,
    X2_C15,
    X2_C16,
    Y1,
    Y2
  ]: Plus2[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil,
    Y1,
    Y2,
    Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil,
    Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil
  ] =
    new Plus2[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil,
      Y1,
      Y2,
      Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil,
      Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil
    ] {
      final override def takeHead1(
        z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil
      ): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil =
        z.tail
      final override def takeTail1(
        z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil
      ): Y1 = z.head
      final override def plus1(
        x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil,
        y: Y1
      ): Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: X1_C9 :: X1_C10 :: X1_C11 :: X1_C12 :: X1_C13 :: X1_C14 :: X1_C15 :: X1_C16 :: HNil =
        x.::(y)
      final override def takeHead2(
        z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil
      ): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil =
        z.tail
      final override def takeTail2(
        z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil
      ): Y2 = z.head
      final override def plus2(
        x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil,
        y: Y2
      ): Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: X2_C8 :: X2_C9 :: X2_C10 :: X2_C11 :: X2_C12 :: X2_C13 :: X2_C14 :: X2_C15 :: X2_C16 :: HNil =
        x.::(y)
    }
}