package asuna.codegen3

trait 进位准备[T] {
  def noSuchElement: T            = throw new IllegalStateException("No such element.")
  def noSuchModelElement: 进位准备[T] = throw new IllegalStateException("No such element.")

  def _0_th: T
  def _1_th: T
  def _2_th: T

  def _0: 进位准备[T]
  def _1: 进位准备[T]
  def _2: 进位准备[T]

  def next(t: T): 进位准备[T]
  def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T]
}

class P_3_Step_1[T](override val _1_th: T, override val _2_th: T, override val _1: 进位准备[T], override val _2: 进位准备[T]) extends 进位准备[T] {
  override def _0_th: T    = noSuchElement
  override def _0: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = _1.加数后上级进位操作(new P_3_Step_1(_1_th, _2_th, _1.next(t), _2), new P_3_Step_2(_1_th, _2_th, _1.next(t), _2))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noSuchModelElement
}

class P_3_Step_2[T](override val _1_th: T, override val _2_th: T, override val _1: 进位准备[T], override val _2: 进位准备[T]) extends 进位准备[T] {
  override def _0_th: T    = noSuchElement
  override def _0: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = _2.加数后上级进位操作(new P_3_Step_2(_1_th, _2_th, _1, _2.next(t)), new P_3_Step_1(_1_th, _2_th, _1, _2.next(t)))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noSuchModelElement
}

class S_0[T](override val _0_th: T) extends 进位准备[T] {
  override def _1_th: T    = noSuchElement
  override def _2_th: T    = noSuchElement
  override def _0: 进位准备[T] = noSuchModelElement
  override def _1: 进位准备[T] = noSuchModelElement
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = new S_1(_0_th, t)
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class S_1[T](override val _0_th: T, override val _1_th: T) extends 进位准备[T] {
  override def _2_th: T    = noSuchElement
  override def _0: 进位准备[T] = noSuchModelElement
  override def _1: 进位准备[T] = noSuchModelElement
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = new S_2(_0_th, _1_th, t)
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = need

}

class S_2[T](override val _0_th: T, override val _1_th: T, override val _2_th: T) extends 进位准备[T] {
  override def _0: 进位准备[T] = noSuchModelElement
  override def _1: 进位准备[T] = noSuchModelElement
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = new I_0(_0_th, _1_th, _2_th, new S_0(t))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed

}

class I_0[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T]) extends 进位准备[T] {
  override def _1: 进位准备[T] = noSuchModelElement
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = _0.加数后上级进位操作(new I_0(_0_th, _1_th, _2_th, _0.next(t)), new I_0_To_1(_0_th, _1_th, _2_th, _0.next(t)))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_0_To_1[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T]) extends 进位准备[T] {
  override def _1: 进位准备[T] = noSuchModelElement
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = new I_1(_0_th, _1_th, _2_th, _0, new S_0(t))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_1[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T], override val _1: 进位准备[T]) extends 进位准备[T] {
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = _1.加数后上级进位操作(new I_1(_0_th, _1_th, _2_th, _0, _1.next(t)), new I_1_To_2(_0_th, _1_th, _2_th, _0, _1.next(t)))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_1_To_2[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T], override val _1: 进位准备[T]) extends 进位准备[T] {
  override def _2: 进位准备[T] = noSuchModelElement

  override def next(t: T): 进位准备[T]                                      = new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, new S_0(t))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_2_Step_0[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T], override val _1: 进位准备[T], override val _2: 进位准备[T])
    extends 进位准备[T] {

  override def next(t: T): 进位准备[T]                                      = _0.加数后上级进位操作(new I_2_Step_0(_0_th, _1_th, _2_th, _0.next(t), _1, _2), new I_2_Step_1(_0_th, _1_th, _2_th, _0.next(t), _1, _2))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_2_Step_1[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T], override val _1: 进位准备[T], override val _2: 进位准备[T])
    extends 进位准备[T] {
  override def next(t: T): 进位准备[T]                                      = _1.加数后上级进位操作(new I_2_Step_1(_0_th, _1_th, _2_th, _0, _1.next(t), _2), new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1.next(t), _2))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = noNeed
}

class I_2_Step_2[T](override val _0_th: T, override val _1_th: T, override val _2_th: T, override val _0: 进位准备[T], override val _1: 进位准备[T], override val _2: 进位准备[T])
    extends 进位准备[T] {
  override def next(t: T): 进位准备[T]                                      = _2.加数后上级进位操作(new I_2_Step_2(_0_th, _1_th, _2_th, _0, _1, _2.next(t)), new I_2_Step_0(_0_th, _1_th, _2_th, _0, _1, _2.next(t)))
  override def 加数后上级进位操作(noNeed: => 进位准备[T], need: => 进位准备[T]): 进位准备[T] = _2.加数后上级进位操作(noNeed, need)
}
