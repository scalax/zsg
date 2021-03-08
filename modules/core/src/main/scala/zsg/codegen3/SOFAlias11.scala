package zsg.codegen3
import zsg.replenish._
trait SOFAlias11 {
  type ZTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]           = P_3_Step_1[T1, T2, I_0_To_1[T3, T4, T5, S_2[T9, T10, T11]], S_2[T6, T7, T8]]
  type ZTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]      = P_3_Step_1[T1, T2, I_1[T3, T4, T5, S_2[T9, T10, T11], S_0[T12]], S_2[T6, T7, T8]]
  type ZTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = P_3_Step_1[T1, T2, I_1[T3, T4, T5, S_2[T9, T10, T11], S_1[T12, T13]], S_2[T6, T7, T8]]
  type ZTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    P_3_Step_1[T1, T2, I_1_To_2[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14]], S_2[T6, T7, T8]]
  type ZTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    P_3_Step_1[T1, T2, I_2_Step_2[T3, T4, T5, S_2[T9, T10, T11], S_2[T12, T13, T14], S_0[T15]], S_2[T6, T7, T8]]
}
trait SOFInit11 {
  def zTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11)
    : SOFAlias#ZTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new P_3_Step_1(t1, t2, new I_0_To_1(t3, t4, t5, new S_2(t9, t10, t11)), new S_2(t6, t7, t8))
  def zTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12)
    : SOFAlias#ZTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new P_3_Step_1(t1, t2, new I_1(t3, t4, t5, new S_2(t9, t10, t11), new S_0(t12)), new S_2(t6, t7, t8))
  def zTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
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
    t13: T13
  ): SOFAlias#ZTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new P_3_Step_1(t1, t2, new I_1(t3, t4, t5, new S_2(t9, t10, t11), new S_1(t12, t13)), new S_2(t6, t7, t8))
  def zTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
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
    t14: T14
  ): SOFAlias#ZTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new P_3_Step_1(t1, t2, new I_1_To_2(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14)), new S_2(t6, t7, t8))
  def zTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
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
    t15: T15
  ): SOFAlias#ZTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new P_3_Step_1(t1, t2, new I_2_Step_2(t3, t4, t5, new S_2(t9, t10, t11), new S_2(t12, t13, t14), new S_0(t15)), new S_2(t6, t7, t8))
}
