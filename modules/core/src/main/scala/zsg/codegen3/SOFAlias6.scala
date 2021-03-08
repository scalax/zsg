package zsg.codegen3
import zsg.replenish._
trait SOFAlias6 {
  type ZTuple6[T1, T2, T3, T4, T5, T6]                   = P_3_Step_2[T1, T2, S_2[T3, T4, T5], S_0[T6]]
  type ZTuple7[T1, T2, T3, T4, T5, T6, T7]               = P_3_Step_2[T1, T2, S_2[T3, T4, T5], S_1[T6, T7]]
  type ZTuple8[T1, T2, T3, T4, T5, T6, T7, T8]           = P_3_Step_1[T1, T2, S_2[T3, T4, T5], S_2[T6, T7, T8]]
  type ZTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]       = P_3_Step_1[T1, T2, I_0[T3, T4, T5, S_0[T9]], S_2[T6, T7, T8]]
  type ZTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = P_3_Step_1[T1, T2, I_0[T3, T4, T5, S_1[T9, T10]], S_2[T6, T7, T8]]
}
trait SOFInit6 {
  def zTuple6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): SOFAlias#ZTuple6[T1, T2, T3, T4, T5, T6] =
    new P_3_Step_2(t1, t2, new S_2(t3, t4, t5), new S_0(t6))
  def zTuple7[T1, T2, T3, T4, T5, T6, T7](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): SOFAlias#ZTuple7[T1, T2, T3, T4, T5, T6, T7] =
    new P_3_Step_2(t1, t2, new S_2(t3, t4, t5), new S_1(t6, t7))
  def zTuple8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): SOFAlias#ZTuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new P_3_Step_1(t1, t2, new S_2(t3, t4, t5), new S_2(t6, t7, t8))
  def zTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9)
    : SOFAlias#ZTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = new P_3_Step_1(t1, t2, new I_0(t3, t4, t5, new S_0(t9)), new S_2(t6, t7, t8))
  def zTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10)
    : SOFAlias#ZTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new P_3_Step_1(t1, t2, new I_0(t3, t4, t5, new S_1(t9, t10)), new S_2(t6, t7, t8))
}
