package asuna.sample04_round

object Round2 {

  trait I1 {
    type T
    def tuple_1: I4[T]
    def tuple_2: I4Bit[T] = I4Bit(birthday = tuple_1.birthday)
  }

  type I2 = (Long, String, Int)

  trait I3 {
    def function[T](i: I4Bit[T]): I4[T]
  }

  case class I4[T](id: Long, name: String, age: Int, birthday: T)
  case class I4Bit[T](birthday: T)

  type I5[T] = (Long, String, Int, T)

  /*def 金生水(i: 金): 水 = (混合(i.tuple_1.id, i.tuple_1.name), i.tuple_1.age)
  def 水生木(i: 水): 木 = new 木 {
    override def function[E](ii: 火星[E]): 火[E] = {
      val iii = propertyName
      火(id = iii.id, name = iii.name, age = i._2, birthday = ii.birthday)
    }
    override val propertyName: 混合 = i._1
  }
  def 木生火[E](i: 火星[E], ii: 木): 火[E] = ii.function(i) //火星将会汇入木生火的火中
  def 火生土[E](i: 火[E]): 土[E]         = (混合(i.id, i.name), i.age, i.birthday)
  def 土生金[E](i: 土[E]): 金 = new 金 {
    override type T = E
    override def tuple_1: 火[T] = 火(id = i._1.id, name = i._1.name, age = i._2, birthday = i._3)
  }*/

}
