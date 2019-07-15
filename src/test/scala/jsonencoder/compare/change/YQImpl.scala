class YQImpl[YY <: HListYuan, QQ <: HListYuan, CC, Con <: Convert](
  override val yueyuan: YY,
  override val yueque: QQ,
  override val current: CC,
  override val currentC: Con
) extends HListYQ {
  self =>

  override type Yueyuan = YY
  override type Yueque  = QQ
  override type Current = CC
  override type C       = Con

  override type Next = Con#M[YQImpl[YY, QQ, CC, Con]]
  override def next: Con#M[YQImpl[YY, QQ, CC, Con]] = currentC.convert(self)

}
