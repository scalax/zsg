package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_4_1 {
        final def plus1WithTypeParameter4[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4
        ]: Plus1[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] = new Plus1[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] {
                final override def takeHead1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]], y: AsunaTuple0): Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
        }
        final def plusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4 
         , Y1  ]:
        Plus1[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ) 
        ] = new Plus1[
            (X1_C1  , X1_C2  , X1_C3  , X1_C4 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4 ) =
                    (z._2  , z._3  , z._4  , z._5 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ) =
                    (y  , x._1  , x._2  , x._3  , x._4 )
        }
}
