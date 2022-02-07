package zsg.scala.tuple
import zsg.TypeHList
import zsg.TypePositive
import zsg.TypeZero
type Tuple1TypeHList[I1 <: TypeHList] <: TypeHList = I1 match {
  case TypePositive[head1, tail1] => TypePositive[Tuple1[head1], Tuple1TypeHList[tail1]]
  case TypeZero                   => TypeZero
}
type Tuple2TypeHList[I1 <: TypeHList, I2 <: TypeHList] <: TypeHList = (I1, I2) match {
  case (TypePositive[head1, tail1], TypePositive[head2, tail2]) =>
    TypePositive[Tuple2[head1, head2], Tuple2TypeHList[tail1, tail2]]
  case (TypeZero, TypeZero) => TypeZero
}
type Tuple3TypeHList[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList] <: TypeHList = (I1, I2, I3) match {
  case (TypePositive[head1, tail1], TypePositive[head2, tail2], TypePositive[head3, tail3]) =>
    TypePositive[Tuple3[head1, head2, head3], Tuple3TypeHList[tail1, tail2, tail3]]
  case (TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple4TypeHList[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList] <: TypeHList = (I1, I2, I3, I4) match {
  case (TypePositive[head1, tail1], TypePositive[head2, tail2], TypePositive[head3, tail3], TypePositive[head4, tail4]) =>
    TypePositive[Tuple4[head1, head2, head3, head4], Tuple4TypeHList[tail1, tail2, tail3, tail4]]
  case (TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple5TypeHList[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList] <: TypeHList =
  (I1, I2, I3, I4, I5) match {
    case (
          TypePositive[head1, tail1],
          TypePositive[head2, tail2],
          TypePositive[head3, tail3],
          TypePositive[head4, tail4],
          TypePositive[head5, tail5]
        ) =>
      TypePositive[Tuple5[head1, head2, head3, head4, head5], Tuple5TypeHList[tail1, tail2, tail3, tail4, tail5]]
    case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
  }
type Tuple6TypeHList[I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList] <: TypeHList =
  (I1, I2, I3, I4, I5, I6) match {
    case (
          TypePositive[head1, tail1],
          TypePositive[head2, tail2],
          TypePositive[head3, tail3],
          TypePositive[head4, tail4],
          TypePositive[head5, tail5],
          TypePositive[head6, tail6]
        ) =>
      TypePositive[Tuple6[head1, head2, head3, head4, head5, head6], Tuple6TypeHList[tail1, tail2, tail3, tail4, tail5, tail6]]
    case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
  }
type Tuple7TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7]
      ) =>
    TypePositive[Tuple7[head1, head2, head3, head4, head5, head6, head7], Tuple7TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7]]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple8TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8]
      ) =>
    TypePositive[
      Tuple8[head1, head2, head3, head4, head5, head6, head7, head8],
      Tuple8TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple9TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9]
      ) =>
    TypePositive[
      Tuple9[head1, head2, head3, head4, head5, head6, head7, head8, head9],
      Tuple9TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple10TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10]
      ) =>
    TypePositive[
      Tuple10[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10],
      Tuple10TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple11TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11]
      ) =>
    TypePositive[
      Tuple11[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11],
      Tuple11TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple12TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12]
      ) =>
    TypePositive[
      Tuple12[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12],
      Tuple12TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11, tail12]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) => TypeZero
}
type Tuple13TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13]
      ) =>
    TypePositive[
      Tuple13[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12, head13],
      Tuple13TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11, tail12, tail13]
    ]
  case (TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero, TypeZero) =>
    TypeZero
}
type Tuple14TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14]
      ) =>
    TypePositive[
      Tuple14[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12, head13, head14],
      Tuple14TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11, tail12, tail13, tail14]
    ]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple15TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15]
      ) =>
    TypePositive[
      Tuple15[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12, head13, head14, head15],
      Tuple15TypeHList[tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11, tail12, tail13, tail14, tail15]
    ]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple16TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16]
      ) =>
    TypePositive[
      Tuple16[head1, head2, head3, head4, head5, head6, head7, head8, head9, head10, head11, head12, head13, head14, head15, head16],
      Tuple16TypeHList[
        tail1,
        tail2,
        tail3,
        tail4,
        tail5,
        tail6,
        tail7,
        tail8,
        tail9,
        tail10,
        tail11,
        tail12,
        tail13,
        tail14,
        tail15,
        tail16
      ]
    ]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple17TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17]
      ) =>
    TypePositive[Tuple17[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17
    ], Tuple17TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple18TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList,
  I18 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17],
        TypePositive[head18, tail18]
      ) =>
    TypePositive[Tuple18[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17,
      head18
    ], Tuple18TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17,
      tail18
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple19TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList,
  I18 <: TypeHList,
  I19 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17],
        TypePositive[head18, tail18],
        TypePositive[head19, tail19]
      ) =>
    TypePositive[Tuple19[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17,
      head18,
      head19
    ], Tuple19TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17,
      tail18,
      tail19
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple20TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList,
  I18 <: TypeHList,
  I19 <: TypeHList,
  I20 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17],
        TypePositive[head18, tail18],
        TypePositive[head19, tail19],
        TypePositive[head20, tail20]
      ) =>
    TypePositive[Tuple20[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17,
      head18,
      head19,
      head20
    ], Tuple20TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17,
      tail18,
      tail19,
      tail20
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple21TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList,
  I18 <: TypeHList,
  I19 <: TypeHList,
  I20 <: TypeHList,
  I21 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17],
        TypePositive[head18, tail18],
        TypePositive[head19, tail19],
        TypePositive[head20, tail20],
        TypePositive[head21, tail21]
      ) =>
    TypePositive[Tuple21[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17,
      head18,
      head19,
      head20,
      head21
    ], Tuple21TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17,
      tail18,
      tail19,
      tail20,
      tail21
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
type Tuple22TypeHList[
  I1 <: TypeHList,
  I2 <: TypeHList,
  I3 <: TypeHList,
  I4 <: TypeHList,
  I5 <: TypeHList,
  I6 <: TypeHList,
  I7 <: TypeHList,
  I8 <: TypeHList,
  I9 <: TypeHList,
  I10 <: TypeHList,
  I11 <: TypeHList,
  I12 <: TypeHList,
  I13 <: TypeHList,
  I14 <: TypeHList,
  I15 <: TypeHList,
  I16 <: TypeHList,
  I17 <: TypeHList,
  I18 <: TypeHList,
  I19 <: TypeHList,
  I20 <: TypeHList,
  I21 <: TypeHList,
  I22 <: TypeHList
] <: TypeHList = (I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22) match {
  case (
        TypePositive[head1, tail1],
        TypePositive[head2, tail2],
        TypePositive[head3, tail3],
        TypePositive[head4, tail4],
        TypePositive[head5, tail5],
        TypePositive[head6, tail6],
        TypePositive[head7, tail7],
        TypePositive[head8, tail8],
        TypePositive[head9, tail9],
        TypePositive[head10, tail10],
        TypePositive[head11, tail11],
        TypePositive[head12, tail12],
        TypePositive[head13, tail13],
        TypePositive[head14, tail14],
        TypePositive[head15, tail15],
        TypePositive[head16, tail16],
        TypePositive[head17, tail17],
        TypePositive[head18, tail18],
        TypePositive[head19, tail19],
        TypePositive[head20, tail20],
        TypePositive[head21, tail21],
        TypePositive[head22, tail22]
      ) =>
    TypePositive[Tuple22[
      head1,
      head2,
      head3,
      head4,
      head5,
      head6,
      head7,
      head8,
      head9,
      head10,
      head11,
      head12,
      head13,
      head14,
      head15,
      head16,
      head17,
      head18,
      head19,
      head20,
      head21,
      head22
    ], Tuple22TypeHList[
      tail1,
      tail2,
      tail3,
      tail4,
      tail5,
      tail6,
      tail7,
      tail8,
      tail9,
      tail10,
      tail11,
      tail12,
      tail13,
      tail14,
      tail15,
      tail16,
      tail17,
      tail18,
      tail19,
      tail20,
      tail21,
      tail22
    ]]
  case (
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero,
        TypeZero
      ) =>
    TypeZero
}
