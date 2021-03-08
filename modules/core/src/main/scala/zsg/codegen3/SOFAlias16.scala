package zsg.codegen3
import zsg.replenish._
trait SOFAlias16 {
  type ZTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    P_3_Step_1[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_1[T15, T16]], S_2[T6, T7, T8]]
  type ZTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    P_3_Step_1[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], S_2[T6, T7, T8]]
  type ZTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    P_3_Step_1[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_0[T6, T7, T8, S_0[T18]]]
  type ZTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    P_3_Step_1[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_0[T6, T7, T8, S_1[T18, T19]]]
  type ZTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    P_3_Step_1[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_0_To_1[T6, T7, T8, S_2[T18, T19, T20]]]
}
trait SOFInit16 {
  def zTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16
  ): SOFAlias#ZTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new P_3_Step_1(t1, t2, new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_1(t15, t16)), new S_2(t6, t7, t8))
  def zTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17
  ): SOFAlias#ZTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new P_3_Step_1(t1, t2, new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)), new S_2(t6, t7, t8))
  def zTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18
  ): SOFAlias#ZTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new P_3_Step_1(t1, t2, new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)), new I_0(t6, t7, t8, new S_0(t18)))
  def zTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19
  ): SOFAlias#ZTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new P_3_Step_1(t1, t2, new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)), new I_0(t6, t7, t8, new S_1(t18, t19)))
  def zTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20
  ): SOFAlias#ZTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = new P_3_Step_1(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_0_To_1(t6, t7, t8, new S_2(t18, t19, t20))
  )
}
