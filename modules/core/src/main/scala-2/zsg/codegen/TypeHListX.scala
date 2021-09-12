package zsg
object TypeAlias {
  type TypeHList1[T1]                                 = TypeHList { type Head = T1 }
  type TypeHList2[T1, T2]                             = TypeHList { type Head = T1; type Tail = TypeHList1[T2] }
  type TypeHList3[T1, T2, T3]                         = TypeHList { type Head = T1; type Tail = TypeHList2[T2, T3] }
  type TypeHList4[T1, T2, T3, T4]                     = TypeHList { type Head = T1; type Tail = TypeHList3[T2, T3, T4] }
  type TypeHList5[T1, T2, T3, T4, T5]                 = TypeHList { type Head = T1; type Tail = TypeHList4[T2, T3, T4, T5] }
  type TypeHList6[T1, T2, T3, T4, T5, T6]             = TypeHList { type Head = T1; type Tail = TypeHList5[T2, T3, T4, T5, T6] }
  type TypeHList7[T1, T2, T3, T4, T5, T6, T7]         = TypeHList { type Head = T1; type Tail = TypeHList6[T2, T3, T4, T5, T6, T7] }
  type TypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]     = TypeHList { type Head = T1; type Tail = TypeHList7[T2, T3, T4, T5, T6, T7, T8] }
  type TypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = TypeHList { type Head = T1; type Tail = TypeHList8[T2, T3, T4, T5, T6, T7, T8, T9] }
  type TypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = TypeHList {
    type Head = T1; type Tail = TypeHList9[T2, T3, T4, T5, T6, T7, T8, T9, T10]
  }
  type TypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = TypeHList {
    type Head = T1; type Tail = TypeHList10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  }
  type TypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = TypeHList {
    type Head = T1; type Tail = TypeHList11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  }
  type TypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = TypeHList {
    type Head = T1; type Tail = TypeHList12[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  }
  type TypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = TypeHList {
    type Head = T1; type Tail = TypeHList13[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  }
  type TypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = TypeHList {
    type Head = T1; type Tail = TypeHList14[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  }
  type TypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = TypeHList {
    type Head = T1; type Tail = TypeHList15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  }
  type TypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = TypeHList {
    type Head = T1; type Tail = TypeHList16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  }
  type TypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = TypeHList {
    type Head = T1; type Tail = TypeHList17[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  }
  type TypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = TypeHList {
    type Head = T1; type Tail = TypeHList18[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  }
  type TypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = TypeHList {
    type Head = T1; type Tail = TypeHList19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  }
  type TypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = TypeHList {
    type Head = T1; type Tail = TypeHList20[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  }
  type TypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = TypeHList {
    type Head = T1; type Tail = TypeHList21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  }
}
