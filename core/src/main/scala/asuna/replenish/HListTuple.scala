package asuna
trait HListTuple0 extends Any with AsunaTuple0 {
  override def add[T](xyy: T): HListTuple1[T] = new HListTuple1(xyy :: HNil)
}
object HListTuple0 extends HListTuple0
class HListTuple1[E1](val head: E1 :: HNil) extends AnyVal with AsunaTuple1[E1] {
  override def add[T](xyy: T): HListTuple2[E1, T] = new HListTuple2[E1, T](xyy :: head)
  override def rightHead: E1                      = head.head
  override def rightTail: HListTuple0             = HListTuple0
  override def i1: E1                             = head.head
}

class HListTuple8[E1, E2, E3, E4, E5, E6, E7, E8](val head: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with AsunaTuple8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def rightHead: E8                                      = head.head
  override def rightTail: HListTuple7[E1, E2, E3, E4, E5, E6, E7] = new HListTuple7(head.tail)
  override def i1: E1                                             = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                             = head.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                             = head.tail.tail.tail.tail.tail.head
  override def i4: E4                                             = head.tail.tail.tail.tail.head
  override def i5: E5                                             = head.tail.tail.tail.head
  override def i6: E6                                             = head.tail.tail.head
  override def i7: E7                                             = head.tail.head
  override def i8: E8                                             = head.head
}
