package zsg.replenish

trait SystemOfNumeration

class P_3_Step_1[T1, T2, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](val _1_th: T1, val _2_th: T2, val _1: I1, val _2: I2) extends SystemOfNumeration

/*case class P_3_Step_2[T](override val _1_th: T, override val _2_th: T, override val _1: SystemOfNumeration[T], override val _2: SystemOfNumeration[T])
    extends SystemOfNumeration[T] {
  override def _0_th: T                  = noSuchElement
  override def _0: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = _2.加数后上级进位操作(new P_3_Step_2(_1_th, _2_th, _1, _2.next(t)), new P_3_Step_1(_1_th, _2_th, _1, _2.next(t)))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noSuchModelElement
}

case class S_0[T](override val _0_th: T) extends SystemOfNumeration[T] {
  override def _1_th: T                  = noSuchElement
  override def _2_th: T                  = noSuchElement
  override def _0: SystemOfNumeration[T] = noSuchModelElement
  override def _1: SystemOfNumeration[T] = noSuchModelElement
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = new S_1(_0_th, t)
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class S_1[T](override val _0_th: T, override val _1_th: T) extends SystemOfNumeration[T] {
  override def _2_th: T                  = noSuchElement
  override def _0: SystemOfNumeration[T] = noSuchModelElement
  override def _1: SystemOfNumeration[T] = noSuchModelElement
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = new S_2(_0_th, _1_th, t)
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = need

}

case class S_2[T](override val _0_th: T, override val _1_th: T, override val _2_th: T) extends SystemOfNumeration[T] {
  override def _0: SystemOfNumeration[T] = noSuchModelElement
  override def _1: SystemOfNumeration[T] = noSuchModelElement
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = new I_0(_0_th, _1_th, _2_th, new S_0(t))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed

}

case class I_0[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: SystemOfNumeration[T]) extends SystemOfNumeration[T] {
  override def _1: SystemOfNumeration[T] = noSuchModelElement
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = _0.加数后上级进位操作(new I_0(_0_th, _1_th, _2_th, _0.next(t)), new I_0_To_1(_0_th, _1_th, _2_th, _0.next(t)))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_0_To_1[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: SystemOfNumeration[T]) extends SystemOfNumeration[T] {
  override def _1: SystemOfNumeration[T] = noSuchModelElement
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = new I_1(_0_th, _1_th, _2_th, _0, new S_0(t))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_1[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: SystemOfNumeration[T], override val _1: SystemOfNumeration[T])
    extends SystemOfNumeration[T] {
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = _1.加数后上级进位操作(new I_1(_0_th, _1_th, _2_th, _0, _1.next(t)), new I_1_To_2(_0_th, _1_th, _2_th, _0, _1.next(t)))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_1_To_2[T](
  override val _0_th: T,
  override val _1_th: T,
  override val _2_th: T,
  override val _0: SystemOfNumeration[T],
  override val _1: SystemOfNumeration[T]
) extends SystemOfNumeration[T] {
  override def _2: SystemOfNumeration[T] = noSuchModelElement

  override def next(t: T): SystemOfNumeration[T]                                                                  = new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, new S_0(t))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_2_Step_0[T](
  override val _0_th: T,
  override val _1_th: T,
  override val _2_th: T,
  override val _0: SystemOfNumeration[T],
  override val _1: SystemOfNumeration[T],
  override val _2: SystemOfNumeration[T]
) extends SystemOfNumeration[T] {

  override def next(t: T): SystemOfNumeration[T] =
    _0.加数后上级进位操作(new I_2_Step_0(_0_th, _1_th, _2_th, _0.next(t), _1, _2), new I_2_Step_1(_0_th, _1_th, _2_th, _0.next(t), _1, _2))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_2_Step_1[T](
  override val _0_th: T,
  override val _1_th: T,
  override val _2_th: T,
  override val _0: SystemOfNumeration[T],
  override val _1: SystemOfNumeration[T],
  override val _2: SystemOfNumeration[T]
) extends SystemOfNumeration[T] {
  override def next(t: T): SystemOfNumeration[T] =
    _1.加数后上级进位操作(new I_2_Step_1(_0_th, _1_th, _2_th, _0, _1.next(t), _2), new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1.next(t), _2))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = noNeed
}

case class I_2_Step_2[T](
  override val _0_th: T,
  override val _1_th: T,
  override val _2_th: T,
  override val _0: SystemOfNumeration[T],
  override val _1: SystemOfNumeration[T],
  override val _2: SystemOfNumeration[T]
) extends SystemOfNumeration[T] {
  override def next(t: T): SystemOfNumeration[T] =
    _2.加数后上级进位操作(new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, _2.next(t)), new I_2_Step_0(_0_th, _1_th, _2_th, _0, _1, _2.next(t)))
  override def 加数后上级进位操作(noNeed: => SystemOfNumeration[T], need: => SystemOfNumeration[T]): SystemOfNumeration[T] = _2.加数后上级进位操作(noNeed, need)
}*/
