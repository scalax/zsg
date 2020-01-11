package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.support.heterogeneous._
trait HListPlus_0_8 {
  final def plusWithTypeParameter0[Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8]: Plus8[
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    asuna.AsunaTuple0,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    Y8,
    Y1 :: HNil,
    Y2 :: HNil,
    Y3 :: HNil,
    Y4 :: HNil,
    Y5 :: HNil,
    Y6 :: HNil,
    Y7 :: HNil,
    Y8 :: HNil
  ] =
    new Plus8[
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      asuna.AsunaTuple0,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Y7,
      Y8,
      Y1 :: HNil,
      Y2 :: HNil,
      Y3 :: HNil,
      Y4 :: HNil,
      Y5 :: HNil,
      Y6 :: HNil,
      Y7 :: HNil,
      Y8 :: HNil
    ] {
      final override def takeHead1(z: Y1 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail1(z: Y1 :: HNil): Y1                   = z.head
      final override def plus1(x: asuna.AsunaTuple0, y: Y1): Y1 :: HNil = y :: HNil.value
      final override def takeHead2(z: Y2 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail2(z: Y2 :: HNil): Y2                   = z.head
      final override def plus2(x: asuna.AsunaTuple0, y: Y2): Y2 :: HNil = y :: HNil.value
      final override def takeHead3(z: Y3 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail3(z: Y3 :: HNil): Y3                   = z.head
      final override def plus3(x: asuna.AsunaTuple0, y: Y3): Y3 :: HNil = y :: HNil.value
      final override def takeHead4(z: Y4 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail4(z: Y4 :: HNil): Y4                   = z.head
      final override def plus4(x: asuna.AsunaTuple0, y: Y4): Y4 :: HNil = y :: HNil.value
      final override def takeHead5(z: Y5 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail5(z: Y5 :: HNil): Y5                   = z.head
      final override def plus5(x: asuna.AsunaTuple0, y: Y5): Y5 :: HNil = y :: HNil.value
      final override def takeHead6(z: Y6 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail6(z: Y6 :: HNil): Y6                   = z.head
      final override def plus6(x: asuna.AsunaTuple0, y: Y6): Y6 :: HNil = y :: HNil.value
      final override def takeHead7(z: Y7 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail7(z: Y7 :: HNil): Y7                   = z.head
      final override def plus7(x: asuna.AsunaTuple0, y: Y7): Y7 :: HNil = y :: HNil.value
      final override def takeHead8(z: Y8 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail8(z: Y8 :: HNil): Y8                   = z.head
      final override def plus8(x: asuna.AsunaTuple0, y: Y8): Y8 :: HNil = y :: HNil.value
    }
}
