package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_9_1 {
        final def plus1WithTypeParameter9[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9
        ]: Plus1[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple1[AsunaTuple1[AsunaTuple1[Plus1_X9]]]],
            AsunaTuple0,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ] = new Plus1[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple1[AsunaTuple1[AsunaTuple1[Plus1_X9]]]],
            AsunaTuple0,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ] {
                final override def takeHead1(z: Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]): AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple1[AsunaTuple1[AsunaTuple1[Plus1_X9]]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple2(z._7 , z._8))) , BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple1(z._9))))
                final override def takeTail1(z: Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple1[AsunaTuple1[AsunaTuple1[Plus1_X9]]]], y: AsunaTuple0): Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9] =
                    Tuple9(x.i1.i1.i1.i1 , x.i1.i1.i1.i2 , x.i1.i1.i2.i1 , x.i1.i1.i2.i2 , x.i1.i2.i1.i1 , x.i1.i2.i1.i2 , x.i1.i2.i2.i1 , x.i1.i2.i2.i2 , x.i2.i1.i1.i1)
        }
        final def plusWithTypeParameter9[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9 
         , Y1  ]:
        Plus1[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  ) 
        ] = new Plus1[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7  , z._8  , z._9  , z._10 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6  , x._7  , x._8  , x._9 )
        }
}
