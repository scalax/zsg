package zsg.codegen3
import zsg.replenish._
class SOFAlias
    extends SOFAlias6
    with SOFAlias11
    with SOFAlias16
    with SOFAlias21
    with SOFAlias26
    with SOFAlias31
    with SOFAlias36
    with SOFAlias41
    with SOFAlias46
    with SOFAlias51
    with SOFAlias56
    with SOFAlias61
    with SOFAlias66
    with SOFAlias71
    with SOFAlias76
    with SOFAlias81
    with SOFAlias86
    with SOFAlias91
    with SOFAlias96
    with SOFAlias101
    with SOFAlias106
    with SOFAlias111
    with SOFAlias116
    with SOFAlias121
    with SOFAlias126
    with SOFAlias131
    with SOFAlias136
    with SOFAlias141
    with SOFAlias146
    with SOFAlias151
    with SOFAlias156
    with SOFAlias161
    with SOFAlias166
    with SOFAlias171
    with SOFAlias176
    with SOFAlias181
    with SOFAlias186
    with SOFAlias191
    with SOFAlias196
    with SOFAlias201
    with SOFAlias206
    with SOFAlias211
    with SOFAlias216
    with SOFAlias221
    with SOFAlias226
    with SOFAlias231
    with SOFAlias236
    with SOFAlias241
    with SOFAlias246
    with SOFAlias251 {
  type ZTuple0                     = N_0
  type ZTuple1[T1]                 = N_1[T1]
  type ZTuple2[T1, T2]             = N_2[T1, T2]
  type ZTuple3[T1, T2, T3]         = P_2_Step_1[T1, T2, S_0[T3]]
  type ZTuple4[T1, T2, T3, T4]     = P_2_Step_1[T1, T2, S_1[T3, T4]]
  type ZTuple5[T1, T2, T3, T4, T5] = P_2_Step_1[T1, T2, S_2[T3, T4, T5]]
}
object SOFAlias
    extends SOFInit6
    with SOFInit11
    with SOFInit16
    with SOFInit21
    with SOFInit26
    with SOFInit31
    with SOFInit36
    with SOFInit41
    with SOFInit46
    with SOFInit51
    with SOFInit56
    with SOFInit61
    with SOFInit66
    with SOFInit71
    with SOFInit76
    with SOFInit81
    with SOFInit86
    with SOFInit91
    with SOFInit96
    with SOFInit101
    with SOFInit106
    with SOFInit111
    with SOFInit116
    with SOFInit121
    with SOFInit126
    with SOFInit131
    with SOFInit136
    with SOFInit141
    with SOFInit146
    with SOFInit151
    with SOFInit156
    with SOFInit161
    with SOFInit166
    with SOFInit171
    with SOFInit176
    with SOFInit181
    with SOFInit186
    with SOFInit191
    with SOFInit196
    with SOFInit201
    with SOFInit206
    with SOFInit211
    with SOFInit216
    with SOFInit221
    with SOFInit226
    with SOFInit231
    with SOFInit236
    with SOFInit241
    with SOFInit246
    with SOFInit251 {
  val zTuple0: SOFAlias#ZTuple0                                                                                 = new N_0
  def zTuple1[T1](t1: T1): SOFAlias#ZTuple1[T1]                                                                 = new N_1(t1)
  def zTuple2[T1, T2](t1: T1, t2: T2): SOFAlias#ZTuple2[T1, T2]                                                 = new N_2(t1, t2)
  def zTuple3[T1, T2, T3](t1: T1, t2: T2, t3: T3): SOFAlias#ZTuple3[T1, T2, T3]                                 = new P_2_Step_1(t1, t2, new S_0(t3))
  def zTuple4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): SOFAlias#ZTuple4[T1, T2, T3, T4]                 = new P_2_Step_1(t1, t2, new S_1(t3, t4))
  def zTuple5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): SOFAlias#ZTuple5[T1, T2, T3, T4, T5] = new P_2_Step_1(t1, t2, new S_2(t3, t4, t5))
}
