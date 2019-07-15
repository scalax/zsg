class YueyuanZero extends HListYuan {
  self =>

  override type Head = YueyuanZero
  override def head: YueyuanZero = self

  override type C = QueToYuan
  override def c: QueToYuan = QueToYuan

  override type Tail = YueyuanZero
  override def tail = self

  override type Add[T] = AppendYuan[T, YueyuanZero]
  override def add[T](i: T): AppendYuan[T, YueyuanZero] = new AppendYuan(i, self)

}

object YueyuanZero extends YueyuanZero

class YuequeZero extends HListYuan {
  self =>

  override type Head = YuequeZero
  override def head: YuequeZero = self

  override type C = YuanToQue
  override def c: YuanToQue = YuanToQue

  override type Tail = YuequeZero
  override def tail: YuequeZero = self

  override type Add[T] = AppendQue[T, YuequeZero]
  override def add[T](i: T): AppendQue[T, YuequeZero] = new AppendQue(i, self)

}

object YuequeZero extends YuequeZero
