package asuna
trait ReverseHListTuple0 extends Any with AsunaTuple0 {
  override def pull[T](xyy: T): ReverseHListTuple1[T] = new ReverseHListTuple1(xyy :: HNil)
}
object ReverseHListTuple0 extends ReverseHListTuple0
class ReverseHListTuple1[E1](val head: E1 :: HNil) extends AnyVal with AsunaTuple1[E1] {
  override def pull[T](xyy: T): ReverseHListTuple2[T, E1] = new ReverseHListTuple2[T, E1](xyy :: head)
  override def leftHead: E1                               = head.head
  override def leftTail: ReverseHListTuple0               = ReverseHListTuple0
  override def i1: E1                                     = head.head
}

class ReverseHListTuple8[E1, E2, E3, E4, E5, E6, E7, E8](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: HNil
) extends AnyVal
    with AsunaTuple8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def leftHead: E1 = head.head
  override def leftTail: ReverseHListTuple7[E2, E3, E4, E5, E6, E7, E8] =
    new ReverseHListTuple7(head.tail)
  override def i1: E1 = head.head
  override def i2: E2 = head.tail.head
  override def i3: E3 = head.tail.tail.head
  override def i4: E4 = head.tail.tail.tail.head
  override def i5: E5 = head.tail.tail.tail.tail.head
  override def i6: E6 = head.tail.tail.tail.tail.tail.head
  override def i7: E7 = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8 = head.tail.tail.tail.tail.tail.tail.tail.head
}
