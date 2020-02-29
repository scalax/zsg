package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_7_4 {
        final def plus4WithTypeParameter7[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7
        ]: Plus4[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple1[Plus1_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple2[AsunaTuple2[Plus2_X5 , Plus2_X6] , AsunaTuple1[Plus2_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple2[AsunaTuple2[Plus3_X5 , Plus3_X6] , AsunaTuple1[Plus3_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple2[AsunaTuple2[Plus4_X5 , Plus4_X6] , AsunaTuple1[Plus4_X7]]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]
        ] = new Plus4[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple1[Plus1_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple2[AsunaTuple2[Plus2_X5 , Plus2_X6] , AsunaTuple1[Plus2_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple2[AsunaTuple2[Plus3_X5 , Plus3_X6] , AsunaTuple1[Plus3_X7]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple2[AsunaTuple2[Plus4_X5 , Plus4_X6] , AsunaTuple1[Plus4_X7]]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]
        ] {
                final override def takeHead1(z: Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple1[Plus1_X7]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple1(z._7)))
                final override def takeTail1(z: Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple1[Plus1_X7]]], y: AsunaTuple0): Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7] =
                    Tuple7(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2 , x.i2.i2.i1)
                final override def takeHead2(z: Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple2[AsunaTuple2[Plus2_X5 , Plus2_X6] , AsunaTuple1[Plus2_X7]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple1(z._7)))
                final override def takeTail2(z: Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple2[AsunaTuple2[Plus2_X5 , Plus2_X6] , AsunaTuple1[Plus2_X7]]], y: AsunaTuple0): Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7] =
                    Tuple7(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2 , x.i2.i2.i1)
                final override def takeHead3(z: Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple2[AsunaTuple2[Plus3_X5 , Plus3_X6] , AsunaTuple1[Plus3_X7]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple1(z._7)))
                final override def takeTail3(z: Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple2[AsunaTuple2[Plus3_X5 , Plus3_X6] , AsunaTuple1[Plus3_X7]]], y: AsunaTuple0): Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7] =
                    Tuple7(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2 , x.i2.i2.i1)
                final override def takeHead4(z: Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple2[AsunaTuple2[Plus4_X5 , Plus4_X6] , AsunaTuple1[Plus4_X7]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple1(z._7)))
                final override def takeTail4(z: Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple2[AsunaTuple2[Plus4_X5 , Plus4_X6] , AsunaTuple1[Plus4_X7]]], y: AsunaTuple0): Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7] =
                    Tuple7(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2 , x.i2.i2.i1)
        }
        final def plusWithTypeParameter7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 
          , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  
         , Y1  , Y2  , Y3  , Y4  ]:
        Plus4[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 )  , (X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 )  , (X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ) 
             , Y1  , Y2  , Y3  , Y4 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  ) 
        ] = new Plus4[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 )  , (X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 )  , (X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ) 
             , Y1  , Y2  , Y3  , Y4 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7  , z._8 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6  , x._7 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  )): (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7  , z._8 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ), y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6  , x._7 )
                final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  )): (X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7  , z._8 )
                final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  )): Y3 = z._1
                final override def plus3(x: (X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 ), y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6  , x._7 )
                final override def takeHead4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  )): (X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7  , z._8 )
                final override def takeTail4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  )): Y4 = z._1
                final override def plus4(x: (X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ), y: Y4): ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6  , x._7 )
        }
}
