class YueyuanZero extends HListYuan {
  self =>

  override type Head = YueyuanZero
  override def head: YueyuanZero = self

  override type C = ReverseYQ
  override def c: ReverseYQ = ReverseYQ

  override type Tail = YueyuanZero
  override def tail = self

  override type Add[T] = AppendYuan[T, YueyuanZero]
  override def add[T](i: T): AppendYuan[T, YueyuanZero] = new AppendYuan(i, self)

}

object YueyuanZero extends YueyuanZero
