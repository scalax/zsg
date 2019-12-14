package asuna.scala_tuple.tuple_support
import asuna.Plus5
import asuna.support.heterogeneous._
trait HListPlus_0_5 {
  final def plusWithTypeParameter0[Y1, Y2, Y3, Y4, Y5]: Plus5[
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
    Y1 :: HNil,
    Y2 :: HNil,
    Y3 :: HNil,
    Y4 :: HNil,
    Y5 :: HNil
  ] =
    new Plus5[
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
      Y1 :: HNil,
      Y2 :: HNil,
      Y3 :: HNil,
      Y4 :: HNil,
      Y5 :: HNil
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
    }
}
