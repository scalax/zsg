package zsg
package inner {
    object innerTypeAlias {
        import zsg._
        type TakeTail1[T <: TypeHList] <: TypeHList = T match {
            case TypePositive[head, tail] => tail
        }
            type TakeTail2[T <: TypeHList] <: TypeHList = TakeTail1[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail3[T <: TypeHList] <: TypeHList = TakeTail2[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail4[T <: TypeHList] <: TypeHList = TakeTail3[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail5[T <: TypeHList] <: TypeHList = TakeTail4[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail6[T <: TypeHList] <: TypeHList = TakeTail5[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail7[T <: TypeHList] <: TypeHList = TakeTail6[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail8[T <: TypeHList] <: TypeHList = TakeTail7[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail9[T <: TypeHList] <: TypeHList = TakeTail8[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail10[T <: TypeHList] <: TypeHList = TakeTail9[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail11[T <: TypeHList] <: TypeHList = TakeTail10[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail12[T <: TypeHList] <: TypeHList = TakeTail11[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail13[T <: TypeHList] <: TypeHList = TakeTail12[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail14[T <: TypeHList] <: TypeHList = TakeTail13[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail15[T <: TypeHList] <: TypeHList = TakeTail14[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail16[T <: TypeHList] <: TypeHList = TakeTail15[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail17[T <: TypeHList] <: TypeHList = TakeTail16[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail18[T <: TypeHList] <: TypeHList = TakeTail17[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail19[T <: TypeHList] <: TypeHList = TakeTail18[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail20[T <: TypeHList] <: TypeHList = TakeTail19[T] match {
                case TypePositive[head, tail] => tail
            }
            type TakeTail21[T <: TypeHList] <: TypeHList = TakeTail20[T] match {
                case TypePositive[head, tail] => tail
            }
    }
}
type TakeHead1[T <: TypeHList] = T match {
    case TypePositive[head, tail] => head
}
    type TakeHead2[T <: TypeHList] = inner.innerTypeAlias.TakeTail1[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead3[T <: TypeHList] = inner.innerTypeAlias.TakeTail2[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead4[T <: TypeHList] = inner.innerTypeAlias.TakeTail3[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead5[T <: TypeHList] = inner.innerTypeAlias.TakeTail4[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead6[T <: TypeHList] = inner.innerTypeAlias.TakeTail5[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead7[T <: TypeHList] = inner.innerTypeAlias.TakeTail6[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead8[T <: TypeHList] = inner.innerTypeAlias.TakeTail7[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead9[T <: TypeHList] = inner.innerTypeAlias.TakeTail8[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead10[T <: TypeHList] = inner.innerTypeAlias.TakeTail9[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead11[T <: TypeHList] = inner.innerTypeAlias.TakeTail10[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead12[T <: TypeHList] = inner.innerTypeAlias.TakeTail11[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead13[T <: TypeHList] = inner.innerTypeAlias.TakeTail12[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead14[T <: TypeHList] = inner.innerTypeAlias.TakeTail13[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead15[T <: TypeHList] = inner.innerTypeAlias.TakeTail14[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead16[T <: TypeHList] = inner.innerTypeAlias.TakeTail15[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead17[T <: TypeHList] = inner.innerTypeAlias.TakeTail16[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead18[T <: TypeHList] = inner.innerTypeAlias.TakeTail17[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead19[T <: TypeHList] = inner.innerTypeAlias.TakeTail18[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead20[T <: TypeHList] = inner.innerTypeAlias.TakeTail19[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead21[T <: TypeHList] = inner.innerTypeAlias.TakeTail20[T] match {
        case TypePositive[head, tail] => head
    }
    type TakeHead22[T <: TypeHList] = inner.innerTypeAlias.TakeTail21[T] match {
        case TypePositive[head, tail] => head
    }
    type TypeHList2[T1, T2] = TypePositive[T1, TypePositive[T2, TypeZero]]
    type TypeHList3[T1, T2, T3] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypeZero]]]
    type TypeHList4[T1, T2, T3, T4] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypeZero]]]]
    type TypeHList5[T1, T2, T3, T4, T5] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypeZero]]]]]
    type TypeHList6[T1, T2, T3, T4, T5, T6] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypeZero]]]]]]
    type TypeHList7[T1, T2, T3, T4, T5, T6, T7] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypeZero]]]]]]]
    type TypeHList8[T1, T2, T3, T4, T5, T6, T7, T8] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypeZero]]]]]]]]
    type TypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypeZero]]]]]]]]]
    type TypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypeZero]]]]]]]]]]
    type TypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypeZero]]]]]]]]]]]
    type TypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypeZero]]]]]]]]]]]]
    type TypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypeZero]]]]]]]]]]]]]
    type TypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypeZero]]]]]]]]]]]]]]
    type TypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypeZero]]]]]]]]]]]]]]]
    type TypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypeZero]]]]]]]]]]]]]]]]
    type TypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypeZero]]]]]]]]]]]]]]]]]
    type TypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypePositive[T18, TypeZero]]]]]]]]]]]]]]]]]]
    type TypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypePositive[T18, TypePositive[T19, TypeZero]]]]]]]]]]]]]]]]]]]
    type TypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypePositive[T18, TypePositive[T19, TypePositive[T20, TypeZero]]]]]]]]]]]]]]]]]]]]
    type TypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypePositive[T18, TypePositive[T19, TypePositive[T20, TypePositive[T21, TypeZero]]]]]]]]]]]]]]]]]]]]]
    type TypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = TypePositive[T1, TypePositive[T2, TypePositive[T3, TypePositive[T4, TypePositive[T5, TypePositive[T6, TypePositive[T7, TypePositive[T8, TypePositive[T9, TypePositive[T10, TypePositive[T11, TypePositive[T12, TypePositive[T13, TypePositive[T14, TypePositive[T15, TypePositive[T16, TypePositive[T17, TypePositive[T18, TypePositive[T19, TypePositive[T20, TypePositive[T21, TypePositive[T22, TypeZero]]]]]]]]]]]]]]]]]]]]]]
