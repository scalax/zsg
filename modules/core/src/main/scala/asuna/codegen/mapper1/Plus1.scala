package asuna
trait Plus1[X1, Y1, Z1] {
  def takeHead1(z: Z1): X1
  def takeTail1(z: Z1): Y1
  def plus1(x: X1, y: Y1): Z1
}
object Plus1 {
  def plusWithTypeParameter1[X1_C1, Y1]: Plus1[
    AsunaTuple1[X1_C1],
    Y1,
    AsunaTuple2[Y1, X1_C1]
  ] =
    new Plus1[
      AsunaTuple1[X1_C1],
      Y1,
      AsunaTuple2[Y1, X1_C1]
    ] {
      def takeHead1(z: AsunaTuple2[Y1, X1_C1]): AsunaTuple1[X1_C1]    = z.tail
      def takeTail1(z: AsunaTuple2[Y1, X1_C1]): Y1                    = z.head
      def plus1(x: AsunaTuple1[X1_C1], y: Y1): AsunaTuple2[Y1, X1_C1] = x.::(y)
    }
  def plusWithTypeParameter2[X1_C1, X1_C2, Y1]: Plus1[
    AsunaTuple2[X1_C1, X1_C2],
    Y1,
    AsunaTuple3[Y1, X1_C1, X1_C2]
  ] =
    new Plus1[
      AsunaTuple2[X1_C1, X1_C2],
      Y1,
      AsunaTuple3[Y1, X1_C1, X1_C2]
    ] {
      def takeHead1(z: AsunaTuple3[Y1, X1_C1, X1_C2]): AsunaTuple2[X1_C1, X1_C2]    = z.tail
      def takeTail1(z: AsunaTuple3[Y1, X1_C1, X1_C2]): Y1                           = z.head
      def plus1(x: AsunaTuple2[X1_C1, X1_C2], y: Y1): AsunaTuple3[Y1, X1_C1, X1_C2] = x.::(y)
    }
  def plusWithTypeParameter3[X1_C1, X1_C2, X1_C3, Y1]: Plus1[
    AsunaTuple3[X1_C1, X1_C2, X1_C3],
    Y1,
    AsunaTuple4[Y1, X1_C1, X1_C2, X1_C3]
  ] =
    new Plus1[
      AsunaTuple3[X1_C1, X1_C2, X1_C3],
      Y1,
      AsunaTuple4[Y1, X1_C1, X1_C2, X1_C3]
    ] {
      def takeHead1(z: AsunaTuple4[Y1, X1_C1, X1_C2, X1_C3]): AsunaTuple3[X1_C1, X1_C2, X1_C3]    = z.tail
      def takeTail1(z: AsunaTuple4[Y1, X1_C1, X1_C2, X1_C3]): Y1                                  = z.head
      def plus1(x: AsunaTuple3[X1_C1, X1_C2, X1_C3], y: Y1): AsunaTuple4[Y1, X1_C1, X1_C2, X1_C3] = x.::(y)
    }
  def plusWithTypeParameter4[X1_C1, X1_C2, X1_C3, X1_C4, Y1]: Plus1[
    AsunaTuple4[X1_C1, X1_C2, X1_C3, X1_C4],
    Y1,
    AsunaTuple5[Y1, X1_C1, X1_C2, X1_C3, X1_C4]
  ] =
    new Plus1[
      AsunaTuple4[X1_C1, X1_C2, X1_C3, X1_C4],
      Y1,
      AsunaTuple5[Y1, X1_C1, X1_C2, X1_C3, X1_C4]
    ] {
      def takeHead1(z: AsunaTuple5[Y1, X1_C1, X1_C2, X1_C3, X1_C4]): AsunaTuple4[X1_C1, X1_C2, X1_C3, X1_C4]    = z.tail
      def takeTail1(z: AsunaTuple5[Y1, X1_C1, X1_C2, X1_C3, X1_C4]): Y1                                         = z.head
      def plus1(x: AsunaTuple4[X1_C1, X1_C2, X1_C3, X1_C4], y: Y1): AsunaTuple5[Y1, X1_C1, X1_C2, X1_C3, X1_C4] = x.::(y)
    }
  def plusWithTypeParameter5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, Y1]: Plus1[
    AsunaTuple5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    Y1,
    AsunaTuple6[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]
  ] =
    new Plus1[
      AsunaTuple5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
      Y1,
      AsunaTuple6[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]
    ] {
      def takeHead1(z: AsunaTuple6[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]): AsunaTuple5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]    = z.tail
      def takeTail1(z: AsunaTuple6[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]): Y1                                                = z.head
      def plus1(x: AsunaTuple5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5], y: Y1): AsunaTuple6[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5] = x.::(y)
    }
  def plusWithTypeParameter6[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, Y1]: Plus1[
    AsunaTuple6[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    Y1,
    AsunaTuple7[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]
  ] =
    new Plus1[
      AsunaTuple6[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
      Y1,
      AsunaTuple7[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]
    ] {
      def takeHead1(z: AsunaTuple7[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]): AsunaTuple6[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]    = z.tail
      def takeTail1(z: AsunaTuple7[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]): Y1                                                       = z.head
      def plus1(x: AsunaTuple6[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6], y: Y1): AsunaTuple7[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6] = x.::(y)
    }
  def plusWithTypeParameter7[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, Y1]: Plus1[
    AsunaTuple7[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    Y1,
    AsunaTuple8[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]
  ] =
    new Plus1[
      AsunaTuple7[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
      Y1,
      AsunaTuple8[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]
    ] {
      def takeHead1(z: AsunaTuple8[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]): AsunaTuple7[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]    = z.tail
      def takeTail1(z: AsunaTuple8[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]): Y1                                                              = z.head
      def plus1(x: AsunaTuple7[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7], y: Y1): AsunaTuple8[Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7] = x.::(y)
    }
}
