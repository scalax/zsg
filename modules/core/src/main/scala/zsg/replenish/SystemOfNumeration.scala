package zsg.replenish

trait SystemOfNumeration

class P_3_Step_1[T1, T2, +I1 <: SystemOfNumeration, +I2 <: SystemOfNumeration](val _1_th: T1, val _2_th: T2, val _1: I1, val _2: I2) extends SystemOfNumeration

@deprecated
class P_3_Step_2[T1, T2, +I1 <: SystemOfNumeration, +I2 <: SystemOfNumeration](override val _1_th: T1, override val _2_th: T2, override val _1: I1, override val _2: I2)
    extends P_3_Step_1[T1, T2, I1, I2](_1_th = _1_th, _2_th = _2_th, _1 = _1, _2 = _2)
    with SystemOfNumeration

class S_0[T0](val _0_th: T0) extends SystemOfNumeration

class S_1[T0, T1](override val _0_th: T0, val _1_th: T1) extends S_0[T0](_0_th = _0_th) with SystemOfNumeration

class S_2[T0, T1, T2](override val _0_th: T0, override val _1_th: T1, val _2_th: T2) extends S_1[T0, T1](_0_th = _0_th, _1_th = _1_th) with SystemOfNumeration

class I_0[T0, T1, T2, +I0 <: SystemOfNumeration](override val _0_th: T0, override val _1_th: T1, override val _2_th: T2, val _0: I0)
    extends S_2[T0, T1, T2](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th)
    with SystemOfNumeration

class I_0_To_1[T0, T1, T2, +I0 <: SystemOfNumeration](override val _0_th: T0, override val _1_th: T1, override val _2_th: T2, override val _0: I0)
    extends I_0[T0, T1, T2, I0](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0)
    with SystemOfNumeration

class I_1[T0, T1, T2, +I0 <: SystemOfNumeration, +I1 <: SystemOfNumeration](
  override val _0_th: T0,
  override val _1_th: T1,
  override val _2_th: T2,
  override val _0: I0,
  val _1: I1
) extends I_0_To_1[T0, T1, T2, I0](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0)
    with SystemOfNumeration

class I_1_To_2[T0, T1, T2, +I0 <: SystemOfNumeration, +I1 <: SystemOfNumeration](
  override val _0_th: T0,
  override val _1_th: T1,
  override val _2_th: T2,
  override val _0: I0,
  override val _1: I1
) extends I_1[T0, T1, T2, I0, I1](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0, _1 = _1)
    with SystemOfNumeration

class I_2_Step_0[T0, T1, T2, +I0 <: SystemOfNumeration, +I1 <: SystemOfNumeration, +I2 <: SystemOfNumeration](
  override val _0_th: T0,
  override val _1_th: T1,
  override val _2_th: T2,
  override val _0: I0,
  override val _1: I1,
  val _2: I2
) extends I_1_To_2[T0, T1, T2, I0, I1](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0, _1 = _1)
    with SystemOfNumeration

@deprecated
class I_2_Step_1[T0, T1, T2, +I0 <: SystemOfNumeration, +I1 <: SystemOfNumeration, +I2 <: SystemOfNumeration](
  override val _0_th: T0,
  override val _1_th: T1,
  override val _2_th: T2,
  override val _0: I0,
  override val _1: I1,
  override val _2: I2
) extends I_2_Step_0[T0, T1, T2, I0, I1, I2](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0, _1 = _1, _2 = _2)
    with SystemOfNumeration

@deprecated
class I_2_Step_2[T0, T1, T2, +I0 <: SystemOfNumeration, +I1 <: SystemOfNumeration, +I2 <: SystemOfNumeration](
  override val _0_th: T0,
  override val _1_th: T1,
  override val _2_th: T2,
  override val _0: I0,
  override val _1: I1,
  override val _2: I2
) extends I_2_Step_1[T0, T1, T2, I0, I1, I2](_0_th = _0_th, _1_th = _1_th, _2_th = _2_th, _0 = _0, _1 = _1, _2 = _2)
    with SystemOfNumeration
