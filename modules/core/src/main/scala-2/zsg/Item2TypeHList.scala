package zsg

class Item2TypeHList[I1 <: TypeHList, I2 <: TypeHList] extends TypeHList {
  override type Head = ZsgTuple2[I1#Head, I2#Head]
  override type Tail = Item2TypeHList[I1#Tail, I2#Tail]
}
