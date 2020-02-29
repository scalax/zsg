package asuna.scala_tuple.tuple_support
import asuna.Plus6
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_3_6 {
        final def plus6WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3
        ]: Plus6[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple1[Plus4_X3]],
            AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple1[Plus5_X3]],
            AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple1[Plus6_X3]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]
        ] = new Plus6[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple1[Plus4_X3]],
            AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple1[Plus5_X3]],
            AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple1[Plus6_X3]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]], y: AsunaTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]], y: AsunaTuple0): Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]], y: AsunaTuple0): Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead4(z: Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]): AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple1[Plus4_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail4(z: Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple1[Plus4_X3]], y: AsunaTuple0): Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead5(z: Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3]): AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple1[Plus5_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail5(z: Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus5(x: AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple1[Plus5_X3]], y: AsunaTuple0): Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead6(z: Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]): AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple1[Plus6_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail6(z: Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus6(x: AsunaTuple2[AsunaTuple2[Plus6_X1 , Plus6_X2] , AsunaTuple1[Plus6_X3]], y: AsunaTuple0): Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
        }
        final def plusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3 
          , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3    , X5_C1  , X5_C2  , X5_C3    , X6_C1  , X6_C2  , X6_C3  
         , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  ]:
        Plus6[
            (X1_C1  , X1_C2  , X1_C3 )
             , (X2_C1  , X2_C2  , X2_C3 )  , (X3_C1  , X3_C2  , X3_C3 )  , (X4_C1  , X4_C2  , X4_C3 )  , (X5_C1  , X5_C2  , X5_C3 )  , (X6_C1  , X6_C2  , X6_C3 ) 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  )  , ( Y5  , X5_C1  , X5_C2  , X5_C3  )  , ( Y6  , X6_C1  , X6_C2  , X6_C3  ) 
        ] = new Plus6[
            (X1_C1  , X1_C2  , X1_C3 )
             , (X2_C1  , X2_C2  , X2_C3 )  , (X3_C1  , X3_C2  , X3_C3 )  , (X4_C1  , X4_C2  , X4_C3 )  , (X5_C1  , X5_C2  , X5_C3 )  , (X6_C1  , X6_C2  , X6_C3 ) 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  )  , ( Y5  , X5_C1  , X5_C2  , X5_C3  )  , ( Y6  , X6_C1  , X6_C2  , X6_C3  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): (X1_C1  , X1_C2  , X1_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  )): (X2_C1  , X2_C2  , X2_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2  , X2_C3 ), y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  )): (X3_C1  , X3_C2  , X3_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  )): Y3 = z._1
                final override def plus3(x: (X3_C1  , X3_C2  , X3_C3 ), y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  )): (X4_C1  , X4_C2  , X4_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  )): Y4 = z._1
                final override def plus4(x: (X4_C1  , X4_C2  , X4_C3 ), y: Y4): ( Y4  , X4_C1  , X4_C2  , X4_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead5(z: ( Y5  , X5_C1  , X5_C2  , X5_C3  )): (X5_C1  , X5_C2  , X5_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail5(z: ( Y5  , X5_C1  , X5_C2  , X5_C3  )): Y5 = z._1
                final override def plus5(x: (X5_C1  , X5_C2  , X5_C3 ), y: Y5): ( Y5  , X5_C1  , X5_C2  , X5_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead6(z: ( Y6  , X6_C1  , X6_C2  , X6_C3  )): (X6_C1  , X6_C2  , X6_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail6(z: ( Y6  , X6_C1  , X6_C2  , X6_C3  )): Y6 = z._1
                final override def plus6(x: (X6_C1  , X6_C2  , X6_C3 ), y: Y6): ( Y6  , X6_C1  , X6_C2  , X6_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
        }
}
