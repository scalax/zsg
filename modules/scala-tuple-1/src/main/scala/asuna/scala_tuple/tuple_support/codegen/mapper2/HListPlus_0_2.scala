package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait HListPlus_0_2 {
final def plusWithTypeParameter0[Y1  , Y2  ]:
Plus2[
asuna.AsunaTuple0  , asuna.AsunaTuple0
, Y1  , Y2
, Y1 :: HNil  , Y2 :: HNil
] = new Plus2[
asuna.AsunaTuple0  , asuna.AsunaTuple0
, Y1  , Y2
, Y1 :: HNil  , Y2 :: HNil
] {
final override def takeHead1(z: Y1 :: HNil): asuna.AsunaTuple0 = asuna.AsunaTuple0.value
final override def takeTail1(z: Y1 :: HNil): Y1 = z.head
final override def plus1(x: asuna.AsunaTuple0, y: Y1): Y1 :: HNil = y :: HNil.value
final override def takeHead2(z: Y2 :: HNil): asuna.AsunaTuple0 = asuna.AsunaTuple0.value
final override def takeTail2(z: Y2 :: HNil): Y2 = z.head
final override def plus2(x: asuna.AsunaTuple0, y: Y2): Y2 :: HNil = y :: HNil.value
}
}
