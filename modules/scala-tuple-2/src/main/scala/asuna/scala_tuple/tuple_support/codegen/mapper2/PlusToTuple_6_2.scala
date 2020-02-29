package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_6_2 {
        final def plus2WithTypeParameter6[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6
        ]: Plus2[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple2[Plus1_X5 , Plus1_X6]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple2[Plus2_X5 , Plus2_X6]]],
            AsunaTuple0 , AsunaTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] = new Plus2[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple2[Plus1_X5 , Plus1_X6]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple2[Plus2_X5 , Plus2_X6]]],
            AsunaTuple0 , AsunaTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] {
                final override def takeHead1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple2[Plus1_X5 , Plus1_X6]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple2[Plus1_X5 , Plus1_X6]]], y: AsunaTuple0): Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
                final override def takeHead2(z: Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple2[Plus2_X5 , Plus2_X6]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail2(z: Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple2[Plus2_X5 , Plus2_X6]]], y: AsunaTuple0): Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
        }
        final def plusWithTypeParameter6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 
          , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  
         , Y1  , Y2  ]:
        Plus2[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ) 
             , Y1  , Y2 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ) 
        ] = new Plus2[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 )
             , (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ) 
             , Y1  , Y2 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )): (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ) =
                    (z._2  , z._3  , z._4  , z._5  , z._6  , z._7 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ), y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ) =
                    (y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6 )
        }
}
