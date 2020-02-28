package asuna.scala_tuple.tuple_support
import asuna.Plus1
trait PlusToTuple_6_1 {
final def plusWithTypeParameter6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, Y1  ]:
Plus1[
(X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 )
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )
] = new Plus1[
(X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 )
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )): (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ) =
(z._2  , z._3  , z._4  , z._5  , z._6  , z._7 )
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )): Y1 = z._1
final override def plus1(x: (X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ) =
(y  , x._1  , x._2  , x._3  , x._4  , x._5  , x._6 )
}
}
