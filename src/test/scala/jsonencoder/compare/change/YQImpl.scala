class YQImpl[YY <: HListYuan, QQ <: HListYuan](
  override val source: YY,
  override val target: QQ
) extends HListYQ {
  self =>

  override type Source = YY
  override type Target = QQ

  override type CanReverse = Target#C#M[YQImpl[YY, QQ]]
  override def canReverse: Target#C#M[YQImpl[YY, QQ]] = target.c.convert(self)

  override type NextNext = YQImpl[YY#Add[QQ#Head], QQ#Tail]
  override def nextNext: YQImpl[YY#Add[QQ#Head], QQ#Tail] = new YQImpl(source.add(target.head), target.tail)

  override type Next = CanReverse#NextNext
  override def next: CanReverse#NextNext = canReverse.nextNext

}
