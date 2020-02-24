package asuna.scala_tuple.tuple_support
import asuna.Plus1
trait PlusToTuple_21_1 {
  final def plusWithTypeParameter21[
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
    X1_C17,
    X1_C18,
    X1_C19,
    X1_C20,
    X1_C21,
    Y1
  ]: Plus1[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21),
    Y1,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21)
  ] =
    new Plus1[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21),
      Y1,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21)
    ] {
      final override def takeHead1(
        z: (
          Y1,
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
          X1_C17,
          X1_C18,
          X1_C19,
          X1_C20,
          X1_C21
        )
      ): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11, z._12, z._13, z._14, z._15, z._16, z._17, z._18, z._19, z._20, z._21, z._22)
      final override def takeTail1(
        z: (
          Y1,
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
          X1_C17,
          X1_C18,
          X1_C19,
          X1_C20,
          X1_C21
        )
      ): Y1 = z._1
      final override def plus1(
        x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15, X1_C16, X1_C17, X1_C18, X1_C19, X1_C20, X1_C21),
        y: Y1
      ): (
        Y1,
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
        X1_C17,
        X1_C18,
        X1_C19,
        X1_C20,
        X1_C21
      ) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10, x._11, x._12, x._13, x._14, x._15, x._16, x._17, x._18, x._19, x._20, x._21)
    }
}
