package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_3 {
        final def plusWithTypeParameter1[X1_C1  , X2_C1  , X3_C1 
         , Y1  , Y2  , Y3  ]:
        Plus3[
            X1_C1  , X2_C1  , X3_C1 
             , Y1  , Y2  , Y3 
             , (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1) 
        ] = new Plus3[
            X1_C1  , X2_C1  , X3_C1 
             , Y1  , Y2  , Y3 
             , (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1) 
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
        }
}
