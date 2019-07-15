class AppendYuan[HH, TT <: HListYuan](override val head: HH, override val tail: TT) extends HListYuan {
  self =>

  override type Head = HH
  override type Tail = TT

  override type C = CloneYQ
  override val c: CloneYQ = CloneYQ

  override type Add[T] = AppendYuan[T, AppendYuan[HH, TT]]
  override def add[T](i: T): AppendYuan[T, AppendYuan[HH, TT]] = new AppendYuan(i, self)

}
