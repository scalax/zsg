class `月圆` extends HListYuan {
  self =>

  override type Head = `月圆`
  override def head: `月圆` = self

  override type C = QueToYuan
  override def c: QueToYuan = QueToYuan

  override type Tail = `月圆`
  override def tail = self

  override type Add[T] = AppendYuan[T, `月圆`]
  override def add[T](i: T): AppendYuan[T, `月圆`] = new AppendYuan(i, self)

}

object `月圆` extends `月圆`

class `月缺` extends HListYuan {
  self =>

  override type Head = `月缺`
  override def head: `月缺` = self

  override type C = YuanToQue
  override def c: YuanToQue = YuanToQue

  override type Tail = `月缺`
  override def tail: `月缺` = self

  override type Add[T] = AppendQue[T, `月缺`]
  override def add[T](i: T): AppendQue[T, `月缺`] = new AppendQue(i, self)

}

object `月缺` extends `月缺`
