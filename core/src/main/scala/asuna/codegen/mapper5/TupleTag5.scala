package asuna
import impl._
class TupleTag5[ T1, M1 <: Message  ,   T2, M2 <: Message  ,   T3, M3 <: Message  ,   T4, M4 <: Message  ,   T5, M5 <: Message  ] extends TupleTag {
override type AsunaTupleType = AsunaTuple5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]
override type M[M <: Message] = TupleTag5[ T1, M :-<>-: M1  ,   T2, M :-<>-: M2  ,   T3, M :-<>-: M3  ,   T4, M :-<>-: M4  ,   T5, M :-<>-: M5  ]
def debug[K <: KindContext  , I1 <: TypeHList  , I2 <: TypeHList  , I3 <: TypeHList  , I4 <: TypeHList  , I5 <: TypeHList ](c: Context[K])(implicit
dapp1: DebugItemApplication[K, T1, I1, M1]  ,
dapp2: DebugItemApplication[K, T2, I2, M2]  ,
dapp3: DebugItemApplication[K, T3, I3, M3]  ,
dapp4: DebugItemApplication[K, T4, I4, M4]  ,
dapp5: DebugItemApplication[K, T5, I5, M5]
): Application[K, TupleTag5[ T1, M1  ,   T2, M2  ,   T3, M3  ,   T4, M4  ,   T5, M5  ], TupleTypeHList5[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ]] =
TupleTag5.tupleTagApplicationImplicit5( dapp1  ,   dapp2  ,   dapp3  ,   dapp4  ,   dapp5  )
}
object TupleTag5 {
implicit def tupleTagApplicationImplicit5[K <: KindContext  , H1  , H2  , H3  , H4  , H5
, T1 <: TypeHList  , T2 <: TypeHList  , T3 <: TypeHList  , T4 <: TypeHList  , T5 <: TypeHList
, M1 <: Message  , M2 <: Message  , M3 <: Message  , M4 <: Message  , M5 <: Message ]
(implicit  t1: Application[K, H1, T1]  ,   t2: Application[K, H2, T2]  ,   t3: Application[K, H3, T3]  ,   t4: Application[K, H4, T4]  ,   t5: Application[K, H5, T5]  )
: Application[K, TupleTag5[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ], TupleTypeHList5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] =
new Application[K, TupleTag5[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ], TupleTypeHList5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] {
override def application(context: Context[K]): K#M[TupleTypeHList5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] = {
if (context.isReverse) {
context.append[HListTypeHList4
[T5  , T4  , T3  , T2 ],
T1,
TupleTypeHList5
[T1  , T2  , T3  , T4  , T5 ]
](
context.append[HListTypeHList3
[T5  , T4  , T3 ],
T2,
HListTypeHList4
[T5  , T4  , T3  , T2 ]
](
context.append[HListTypeHList2
[T5  , T4 ],
T3,
HListTypeHList3
[T5  , T4  , T3 ]
](
context.append[HListTypeHList1
[T5 ],
T4,
HListTypeHList2
[T5  , T4 ]
](
context.append[TupleTypeHList0, T5, HListTypeHList1[T5]]
(context.start, t5.application(context), AnyHListTypeHListPlus.hlistPlus1)
,
t4.application(context), HListTypeHListPlus2.plus2)
,
t3.application(context), HListTypeHListPlus3.plus3)
,
t2.application(context), HListTypeHListPlus4.plus4)
,
t1.application(context), HListToTupleTypeHListPlus5.put5)
} else {
context.append[HListTypeHList4
[T1  , T2  , T3  , T4 ],
T5,
TupleTypeHList5
[T1  , T2  , T3  , T4  , T5 ]
](
context.append[HListTypeHList3
[T1  , T2  , T3 ],
T4,
HListTypeHList4
[T1  , T2  , T3  , T4 ]
](
context.append[HListTypeHList2
[T1  , T2 ],
T3,
HListTypeHList3
[T1  , T2  , T3 ]
](
context.append[HListTypeHList1
[T1 ],
T2,
HListTypeHList2
[T1  , T2 ]
](
context.append[TupleTypeHList0, T1, HListTypeHList1[T1]]
(context.start, t1.application(context), AnyHListTypeHListPlus.hlistPlus1)
,
t2.application(context), HListTypeHListPlus2.plus2)
,
t3.application(context), HListTypeHListPlus3.plus3)
,
t4.application(context), HListTypeHListPlus4.plus4)
,
t5.application(context), HListToTupleTypeHListPlus5.plus5)
}
}
}
}
