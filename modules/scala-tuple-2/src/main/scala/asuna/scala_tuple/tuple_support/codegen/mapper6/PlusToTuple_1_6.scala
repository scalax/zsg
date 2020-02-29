package asuna.scala_tuple.tuple_support
import asuna.Plus6
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_6 {
        final def plusWithTypeParameter1[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 
         , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  ]:
        Plus6[
            X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6 
             , (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1)  , (Y4 , X4_C1)  , (Y5 , X5_C1)  , (Y6 , X6_C1) 
        ] = new Plus6[
            X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 
             , Y1  , Y2  , Y3  , Y4  , Y5  , Y6 
             , (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1)  , (Y4 , X4_C1)  , (Y5 , X5_C1)  , (Y6 , X6_C1) 
        ] {
                final override def takeHead1(z: (Y1 , X1_C1)): X1_C1 = z._2
                final override def takeTail1(z: (Y1 , X1_C1)): Y1 = z._1
                final override def plus1(x: X1_C1, y: Y1): (Y1 , X1_C1) = (y, x)
                final override def takeHead2(z: (Y2 , X2_C1)): X2_C1 = z._2
                final override def takeTail2(z: (Y2 , X2_C1)): Y2 = z._1
                final override def plus2(x: X2_C1, y: Y2): (Y2 , X2_C1) = (y, x)
                final override def takeHead3(z: (Y3 , X3_C1)): X3_C1 = z._2
                final override def takeTail3(z: (Y3 , X3_C1)): Y3 = z._1
                final override def plus3(x: X3_C1, y: Y3): (Y3 , X3_C1) = (y, x)
                final override def takeHead4(z: (Y4 , X4_C1)): X4_C1 = z._2
                final override def takeTail4(z: (Y4 , X4_C1)): Y4 = z._1
                final override def plus4(x: X4_C1, y: Y4): (Y4 , X4_C1) = (y, x)
                final override def takeHead5(z: (Y5 , X5_C1)): X5_C1 = z._2
                final override def takeTail5(z: (Y5 , X5_C1)): Y5 = z._1
                final override def plus5(x: X5_C1, y: Y5): (Y5 , X5_C1) = (y, x)
                final override def takeHead6(z: (Y6 , X6_C1)): X6_C1 = z._2
                final override def takeTail6(z: (Y6 , X6_C1)): Y6 = z._1
                final override def plus6(x: X6_C1, y: Y6): (Y6 , X6_C1) = (y, x)
        }
}
