package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_20_1 {
final def plusWithTypeParameter20[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  z._8 ::  z._9 ::  z._10 ::  z._11 ::  z._12 ::  z._13 ::  z._14 ::  z._15 ::  z._16 ::  z._17 ::  z._18 ::  z._19 ::  z._20 ::  z._21 ::  HNil
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head )
}
}
