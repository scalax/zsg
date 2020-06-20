package zsg.sample04_round

object Round3 {

  trait 金 {
    type T
    def tuple_1: 火[T]
    def tuple_2: 火星[T] = 火星(birthday = tuple_1.birthday)
    def propertyName: 混合
  }

  type 水 = (混合, Int, Short)

  trait 木 {
    def function[T](i: 火星[T]): 火[T]
    def propertyName: 混合
  }

  case class 火[T](id: Long, name: String, age: Int, birthday: T, height: Short)
  case class 火星[T](birthday: T)
  case class 混合(id: Long, name: String)

  type 土[T] = (混合, Int, T, Short) //一方水土养一方人，只有水和土是数据之源

  def 金生水(i: 金): 水 = (混合(id = i.tuple_1.id, name = i.tuple_1.name), i.tuple_1.age, i.tuple_1.height)
  def 水生木(i: 水): 木 =
    new 木 {
      override def function[E](ii: 火星[E]): 火[E] = 火(id = propertyName.id, name = propertyName.name, age = i._2, birthday = ii.birthday, height = i._3)
      override val propertyName: 混合             = i._1
    }
  def 木生火[E](i: 火星[E], ii: 木): 火[E] = ii.function(i) //火星将会汇入木生火的火中
  def 火生土[E](i: 火[E]): 土[E]         = (混合(id = i.id, name = i.name), i.age, i.birthday, i.height)
  def 土生金[E](i: 土[E]): 金 =
    new 金 {
      override type T = E
      override def tuple_1: 火[T]    = 火(id = propertyName.id, name = propertyName.name, age = i._2, birthday = i._3, height = i._4)
      override val propertyName: 混合 = i._1
    }

}
