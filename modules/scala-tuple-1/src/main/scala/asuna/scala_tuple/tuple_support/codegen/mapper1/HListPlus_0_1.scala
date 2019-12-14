package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait HListPlus_0_1 {
  final def plusWithTypeParameter0[Y1]: Plus1[
    asuna.AsunaTuple0,
    Y1,
    Y1 :: HNil
  ] =
    new Plus1[
      asuna.AsunaTuple0,
      Y1,
      Y1 :: HNil
    ] {
      final override def takeHead1(z: Y1 :: HNil): asuna.AsunaTuple0    = asuna.AsunaTuple0.value
      final override def takeTail1(z: Y1 :: HNil): Y1                   = z.head
      final override def plus1(x: asuna.AsunaTuple0, y: Y1): Y1 :: HNil = y :: HNil.value
    }
}
