package zsg.scala.tuple
import zsg.TypeHList
    class Tuple1TypeHList[  I1 <: TypeHList ] extends TypeHList {
      override type Head = Tuple1[  I1#Head ]
      override type Tail = Tuple1TypeHList[  I1#Tail ]
    }
    class Tuple2TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList ] extends TypeHList {
      override type Head = Tuple2[  I1#Head   ,  I2#Head ]
      override type Tail = Tuple2TypeHList[  I1#Tail   ,  I2#Tail ]
    }
    class Tuple3TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList ] extends TypeHList {
      override type Head = Tuple3[  I1#Head   ,  I2#Head   ,  I3#Head ]
      override type Tail = Tuple3TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail ]
    }
    class Tuple4TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList ] extends TypeHList {
      override type Head = Tuple4[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head ]
      override type Tail = Tuple4TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail ]
    }
    class Tuple5TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList ] extends TypeHList {
      override type Head = Tuple5[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head ]
      override type Tail = Tuple5TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail ]
    }
    class Tuple6TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList ] extends TypeHList {
      override type Head = Tuple6[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head ]
      override type Tail = Tuple6TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail ]
    }
    class Tuple7TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList ] extends TypeHList {
      override type Head = Tuple7[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head ]
      override type Tail = Tuple7TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail ]
    }
    class Tuple8TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList ] extends TypeHList {
      override type Head = Tuple8[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head ]
      override type Tail = Tuple8TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail ]
    }
    class Tuple9TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList ] extends TypeHList {
      override type Head = Tuple9[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head ]
      override type Tail = Tuple9TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail ]
    }
    class Tuple10TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList ] extends TypeHList {
      override type Head = Tuple10[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head ]
      override type Tail = Tuple10TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail ]
    }
    class Tuple11TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList ] extends TypeHList {
      override type Head = Tuple11[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head ]
      override type Tail = Tuple11TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail ]
    }
    class Tuple12TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList ] extends TypeHList {
      override type Head = Tuple12[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head ]
      override type Tail = Tuple12TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail ]
    }
    class Tuple13TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList ] extends TypeHList {
      override type Head = Tuple13[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head ]
      override type Tail = Tuple13TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail ]
    }
    class Tuple14TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList ] extends TypeHList {
      override type Head = Tuple14[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head ]
      override type Tail = Tuple14TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail ]
    }
    class Tuple15TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList ] extends TypeHList {
      override type Head = Tuple15[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head ]
      override type Tail = Tuple15TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail ]
    }
    class Tuple16TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList ] extends TypeHList {
      override type Head = Tuple16[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head ]
      override type Tail = Tuple16TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail ]
    }
    class Tuple17TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList ] extends TypeHList {
      override type Head = Tuple17[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head ]
      override type Tail = Tuple17TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail ]
    }
    class Tuple18TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList   ,  I18 <: TypeHList ] extends TypeHList {
      override type Head = Tuple18[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head   ,  I18#Head ]
      override type Tail = Tuple18TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail   ,  I18#Tail ]
    }
    class Tuple19TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList   ,  I18 <: TypeHList   ,  I19 <: TypeHList ] extends TypeHList {
      override type Head = Tuple19[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head   ,  I18#Head   ,  I19#Head ]
      override type Tail = Tuple19TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail   ,  I18#Tail   ,  I19#Tail ]
    }
    class Tuple20TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList   ,  I18 <: TypeHList   ,  I19 <: TypeHList   ,  I20 <: TypeHList ] extends TypeHList {
      override type Head = Tuple20[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head   ,  I18#Head   ,  I19#Head   ,  I20#Head ]
      override type Tail = Tuple20TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail   ,  I18#Tail   ,  I19#Tail   ,  I20#Tail ]
    }
    class Tuple21TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList   ,  I18 <: TypeHList   ,  I19 <: TypeHList   ,  I20 <: TypeHList   ,  I21 <: TypeHList ] extends TypeHList {
      override type Head = Tuple21[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head   ,  I18#Head   ,  I19#Head   ,  I20#Head   ,  I21#Head ]
      override type Tail = Tuple21TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail   ,  I18#Tail   ,  I19#Tail   ,  I20#Tail   ,  I21#Tail ]
    }
    class Tuple22TypeHList[  I1 <: TypeHList   ,  I2 <: TypeHList   ,  I3 <: TypeHList   ,  I4 <: TypeHList   ,  I5 <: TypeHList   ,  I6 <: TypeHList   ,  I7 <: TypeHList   ,  I8 <: TypeHList   ,  I9 <: TypeHList   ,  I10 <: TypeHList   ,  I11 <: TypeHList   ,  I12 <: TypeHList   ,  I13 <: TypeHList   ,  I14 <: TypeHList   ,  I15 <: TypeHList   ,  I16 <: TypeHList   ,  I17 <: TypeHList   ,  I18 <: TypeHList   ,  I19 <: TypeHList   ,  I20 <: TypeHList   ,  I21 <: TypeHList   ,  I22 <: TypeHList ] extends TypeHList {
      override type Head = Tuple22[  I1#Head   ,  I2#Head   ,  I3#Head   ,  I4#Head   ,  I5#Head   ,  I6#Head   ,  I7#Head   ,  I8#Head   ,  I9#Head   ,  I10#Head   ,  I11#Head   ,  I12#Head   ,  I13#Head   ,  I14#Head   ,  I15#Head   ,  I16#Head   ,  I17#Head   ,  I18#Head   ,  I19#Head   ,  I20#Head   ,  I21#Head   ,  I22#Head ]
      override type Tail = Tuple22TypeHList[  I1#Tail   ,  I2#Tail   ,  I3#Tail   ,  I4#Tail   ,  I5#Tail   ,  I6#Tail   ,  I7#Tail   ,  I8#Tail   ,  I9#Tail   ,  I10#Tail   ,  I11#Tail   ,  I12#Tail   ,  I13#Tail   ,  I14#Tail   ,  I15#Tail   ,  I16#Tail   ,  I17#Tail   ,  I18#Tail   ,  I19#Tail   ,  I20#Tail   ,  I21#Tail   ,  I22#Tail ]
    }
