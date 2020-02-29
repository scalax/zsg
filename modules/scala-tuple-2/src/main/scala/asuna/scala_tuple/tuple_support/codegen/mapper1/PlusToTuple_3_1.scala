package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_3_1 {
        final def plus1WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3
        ]: Plus1[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] = new Plus1[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]], y: AsunaTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
        }
        final def plusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3 
         , Y1  ]:
        Plus1[
            (X1_C1  , X1_C2  , X1_C3 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  ) 
        ] = new Plus1[
            (X1_C1  , X1_C2  , X1_C3 )
             , Y1 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): (X1_C1  , X1_C2  , X1_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
        }
}
