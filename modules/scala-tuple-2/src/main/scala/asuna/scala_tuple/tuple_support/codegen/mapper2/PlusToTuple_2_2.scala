package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_2 {
        final def plus2WithTypeParameter2[
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2
        ]: Plus2[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ] = new Plus2[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ] {
                final override def takeHead1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple2[Plus1_X1 , Plus1_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[Plus1_X1 , Plus1_X2], y: AsunaTuple0): Tuple2[Plus1_X1 , Plus1_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple2[Plus2_X1 , Plus2_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[Plus2_X1 , Plus2_X2], y: AsunaTuple0): Tuple2[Plus2_X1 , Plus2_X2] =
                    Tuple2(x.i1 , x.i2)
        }
        final def plusWithTypeParameter2[X1_C1  , X1_C2 
          , X2_C1  , X2_C2  
         , Y1  , Y2  ]:
        Plus2[
            (X1_C1  , X1_C2 )
             , (X2_C1  , X2_C2 ) 
             , Y1  , Y2 
             , ( Y1  , X1_C1  , X1_C2  )  , ( Y2  , X2_C1  , X2_C2  ) 
        ] = new Plus2[
            (X1_C1  , X1_C2 )
             , (X2_C1  , X2_C2 ) 
             , Y1  , Y2 
             , ( Y1  , X1_C1  , X1_C2  )  , ( Y2  , X2_C1  , X2_C2  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  )): (X1_C1  , X1_C2 ) =
                    (z._2  , z._3 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2 ), y: Y1): ( Y1  , X1_C1  , X1_C2  ) =
                    (y  , x._1  , x._2 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  )): (X2_C1  , X2_C2 ) =
                    (z._2  , z._3 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2 ), y: Y2): ( Y2  , X2_C1  , X2_C2  ) =
                    (y  , x._1  , x._2 )
        }
}
