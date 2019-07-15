class AppendYuan[HH, TT <: HListYuan](override val head: HH, override val tail: TT) extends HListYuan {
  self =>

  override type Head = HH
  override type Tail = TT

  override type C = YuanToQue
  override val c: YuanToQue = YuanToQue

  override type Add[T] = AppendYuan[T, AppendYuan[HH, TT]]
  override def add[T](i: T): AppendYuan[T, AppendYuan[HH, TT]] = new AppendYuan(i, self)

}

class AppendQue[HH, TT <: HListYuan](override val head: HH, override val tail: TT) extends HListYuan {
  self =>

  override type Head = HH
  override type Tail = TT

  override type C = QueToYuan
  override val c: QueToYuan = QueToYuan

  override type Add[T] = AppendQue[T, AppendQue[HH, TT]]
  override def add[T](i: T): AppendQue[T, AppendQue[HH, TT]] = new AppendQue(i, self)

}