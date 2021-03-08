package zsg.codegen3
import zsg.replenish._
trait SOFAlias21 {
  type ZTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    P_3_Step_2[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_1[T6, T7, T8, S_2[T18, T19, T20], S_0[T21]]]
  type ZTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    P_3_Step_2[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_1[T6, T7, T8, S_2[T18, T19, T20], S_1[T21, T22]]]
  type ZTuple23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23] =
    P_3_Step_2[T1, T2, I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]], I_1_To_2[T6, T7, T8, S_2[T18, T19, T20], S_2[T21, T22, T23]]]
  type ZTuple24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24] = P_3_Step_2[
    T1,
    T2,
    I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]],
    I_2_Step_2[T6, T7, T8, S_2[T18, T19, T20], S_2[T21, T22, T23], S_0[T24]]
  ]
  type ZTuple25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25] = P_3_Step_2[
    T1,
    T2,
    I_2_Step_0[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_2[T15, T16, T17]],
    I_2_Step_2[T6, T7, T8, S_2[T18, T19, T20], S_2[T21, T22, T23], S_1[T24, T25]]
  ]
}
trait SOFInit21 {
  def zTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
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
    t20: T20,
    t21: T21
  ): SOFAlias#ZTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = new P_3_Step_2(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_1(t6, t7, t8, new S_2(t18, t19, t20), new S_0(t21))
  )
  def zTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
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
    t20: T20,
    t21: T21,
    t22: T22
  ): SOFAlias#ZTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = new P_3_Step_2(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_1(t6, t7, t8, new S_2(t18, t19, t20), new S_1(t21, t22))
  )
  def zTuple23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23](
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
    t20: T20,
    t21: T21,
    t22: T22,
    t23: T23
  ): SOFAlias#ZTuple23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23] = new P_3_Step_2(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_1_To_2(t6, t7, t8, new S_2(t18, t19, t20), new S_2(t21, t22, t23))
  )
  def zTuple24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24](
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
    t20: T20,
    t21: T21,
    t22: T22,
    t23: T23,
    t24: T24
  ): SOFAlias#ZTuple24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24] = new P_3_Step_2(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_2_Step_2(t6, t7, t8, new S_2(t18, t19, t20), new S_2(t21, t22, t23), new S_0(t24))
  )
  def zTuple25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25](
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
    t20: T20,
    t21: T21,
    t22: T22,
    t23: T23,
    t24: T24,
    t25: T25
  ): SOFAlias#ZTuple25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25] = new P_3_Step_2(
    t1,
    t2,
    new I_2_Step_0(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_2(t15, t16, t17)),
    new I_2_Step_2(t6, t7, t8, new S_2(t18, t19, t20), new S_2(t21, t22, t23), new S_1(t24, t25))
  )
}
