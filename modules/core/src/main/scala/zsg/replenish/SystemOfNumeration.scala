package zsg.replenish

trait SystemOfNumeration

class P_3_Step_1[T1, T2, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](val _1_th: T1, val _2_th: T2, val _1: I1, val _2: I2) extends SystemOfNumeration

class P_3_Step_2[T1, T2, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](val _1_th: T1, val _2_th: T2, val _1: I1, val _2: I2) extends SystemOfNumeration

class S_0[T0](val _0_th: T0) extends SystemOfNumeration

class S_1[T0, T1](val _0_th: T0, val _1_th: T1) extends SystemOfNumeration

class S_2[T0, T1, T2](val _0_th: T0, val _1_th: T1, val _2_th: T2) extends SystemOfNumeration

class I_0[T0, T1, T2, I0](val _0_th: T0, val _1_th: T1, val _2_th: T2, val _0: I0) extends SystemOfNumeration

class I_0_To_1[T0, T1, T2, I0 <: SystemOfNumeration](val _0_th: T0, val _1_th: T1, val _2_th: T2, val _0: I0) extends SystemOfNumeration

class I_1[T0, T1, T2, I0, I1](val _0_th: T0, val _1_th: T1, val _2_th: T2, val _0: I0, val _1: I1) extends SystemOfNumeration

class I_1_To_2[T0, T1, T2, I0 <: SystemOfNumeration, I1 <: SystemOfNumeration](val _0_th: T0, val _1_th: T1, val _2_th: T2, val _0: I0, val _1: I1)
    extends SystemOfNumeration

class I_2_Step_0[T0, T1, T2, I0 <: SystemOfNumeration, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](
  val _0_th: T0,
  val _1_th: T1,
  val _2_th: T2,
  val _0: I0,
  val _1: I1,
  val _2: I2
) extends SystemOfNumeration

class I_2_Step_1[T0, T1, T2, I0 <: SystemOfNumeration, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](
  val _0_th: T0,
  val _1_th: T1,
  val _2_th: T2,
  val _0: I0,
  val _1: I1,
  val _2: I2
) extends SystemOfNumeration

class I_2_Step_2[T0, T1, T2, I0 <: SystemOfNumeration, I1 <: SystemOfNumeration, I2 <: SystemOfNumeration](
  val _0_th: T0,
  val _1_th: T1,
  val _2_th: T2,
  val _0: I0,
  val _1: I1,
  val _2: I2
) extends SystemOfNumeration
