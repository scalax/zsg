package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_4_8 {
        final def plus8WithTypeParameter4[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4,
            Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4
        ]: Plus8[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]],
            AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]],
            AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple2[Plus6_X3 , Plus6_X4]],
            AsunaTuple2[AsunaTuple2[Plus7_X1 , Plus7_X2] , AsunaTuple2[Plus7_X3 , Plus7_X4]],
            AsunaTuple2[AsunaTuple2[Plus8_X1 , Plus8_X2] , AsunaTuple2[Plus8_X3 , Plus8_X4]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ] = new Plus8[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]],
            AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]],
            AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple2[Plus6_X3 , Plus6_X4]],
            AsunaTuple2[AsunaTuple2[Plus7_X1 , Plus7_X2] , AsunaTuple2[Plus7_X3 , Plus7_X4]],
            AsunaTuple2[AsunaTuple2[Plus8_X1 , Plus8_X2] , AsunaTuple2[Plus8_X3 , Plus8_X4]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ] {
                final override def takeHead1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]], y: AsunaTuple0): Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]], y: AsunaTuple0): Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead3(z: Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]): AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail3(z: Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]], y: AsunaTuple0): Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead4(z: Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]): AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail4(z: Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]], y: AsunaTuple0): Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead5(z: Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]): AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail5(z: Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus5(x: AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]], y: AsunaTuple0): Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead6(z: Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4]): AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple2[Plus6_X3 , Plus6_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail6(z: Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus6(x: AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple2[Plus6_X3 , Plus6_X4]], y: AsunaTuple0): Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead7(z: Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4]): AsunaTuple2[AsunaTuple2[Plus7_X1 , Plus7_X2] , AsunaTuple2[Plus7_X3 , Plus7_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail7(z: Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus7(x: AsunaTuple2[AsunaTuple2[Plus7_X1 , Plus7_X2] , AsunaTuple2[Plus7_X3 , Plus7_X4]], y: AsunaTuple0): Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead8(z: Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]): AsunaTuple2[AsunaTuple2[Plus8_X1 , Plus8_X2] , AsunaTuple2[Plus8_X3 , Plus8_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail8(z: Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus8(x: AsunaTuple2[AsunaTuple2[Plus8_X1 , Plus8_X2] , AsunaTuple2[Plus8_X3 , Plus8_X4]], y: AsunaTuple0): Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
        }
        final def plusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4 
          , X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4    , X4_C1  , X4_C2  , X4_C3  , X4_C4    , X5_C1  , X5_C2  , X5_C3  , X5_C4    , X6_C1  , X6_C2  , X6_C3  , X6_C4    , X7_C1  , X7_C2  , X7_C3  , X7_C4    , X8_C1  , X8_C2  , X8_C3  , X8_C4  
         , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  ]:
        Plus8[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4 )  , (X3_C1  , X3_C2  , X3_C3  , X3_C4 )  , (X4_C1  , X4_C2  , X4_C3  , X4_C4 )  , (X5_C1  , X5_C2  , X5_C3  , X5_C4 )  , (X6_C1  , X6_C2  , X6_C3  , X6_C4 )  , (X7_C1  , X7_C2  , X7_C3  , X7_C4 )  , (X8_C1  , X8_C2  , X8_C3  , X8_C4 ) 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  )  , ( Y5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  )  , ( Y6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  )  , ( Y7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  )  , ( Y8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  ) 
        ] = new Plus8[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4 )  , (X3_C1  , X3_C2  , X3_C3  , X3_C4 )  , (X4_C1  , X4_C2  , X4_C3  , X4_C4 )  , (X5_C1  , X5_C2  , X5_C3  , X5_C4 )  , (X6_C1  , X6_C2  , X6_C3  , X6_C4 )  , (X7_C1  , X7_C2  , X7_C3  , X7_C4 )  , (X8_C1  , X8_C2  , X8_C3  , X8_C4 ) 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  )  , ( Y5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  )  , ( Y6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  )  , ( Y7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  )  , ( Y8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  )): (X2_C1  , X2_C2  , X2_C3  , X2_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2  , X2_C3  , X2_C4 ), y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  )): (X3_C1  , X3_C2  , X3_C3  , X3_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  )): Y3 = z._1
                final override def plus3(x: (X3_C1  , X3_C2  , X3_C3  , X3_C4 ), y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  )): (X4_C1  , X4_C2  , X4_C3  , X4_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  )): Y4 = z._1
                final override def plus4(x: (X4_C1  , X4_C2  , X4_C3  , X4_C4 ), y: Y4): ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead5(z: ( Y5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  )): (X5_C1  , X5_C2  , X5_C3  , X5_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail5(z: ( Y5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  )): Y5 = z._1
                final override def plus5(x: (X5_C1  , X5_C2  , X5_C3  , X5_C4 ), y: Y5): ( Y5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead6(z: ( Y6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  )): (X6_C1  , X6_C2  , X6_C3  , X6_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail6(z: ( Y6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  )): Y6 = z._1
                final override def plus6(x: (X6_C1  , X6_C2  , X6_C3  , X6_C4 ), y: Y6): ( Y6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead7(z: ( Y7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  )): (X7_C1  , X7_C2  , X7_C3  , X7_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail7(z: ( Y7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  )): Y7 = z._1
                final override def plus7(x: (X7_C1  , X7_C2  , X7_C3  , X7_C4 ), y: Y7): ( Y7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
                final override def takeHead8(z: ( Y8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  )): (X8_C1  , X8_C2  , X8_C3  , X8_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail8(z: ( Y8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  )): Y8 = z._1
                final override def plus8(x: (X8_C1  , X8_C2  , X8_C3  , X8_C4 ), y: Y8): ( Y8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
        }
}
