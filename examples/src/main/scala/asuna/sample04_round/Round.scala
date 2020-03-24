package asuna.sample04_round

object Round {

  trait 金 {
    type T
    def tuple_1: 火[T]
    def tuple_2: 火星[T] = 火星(birthday = tuple_1.birthday)
  }

  type 水 = (Long, String, Int)

  trait 木 {
    def function[T](i: 火星[T]): 火[T]
  }

  case class 火[T](id: Long, name: String, age: Int, birthday: T)
  case class 火星[T](birthday: T)

  type 土[T] = (Long, String, Int, T) //一方水土养一方人，只有水和土是数据之源

  def 金生水(i: 金): 水 = (i.tuple_1.id, i.tuple_1.name, i.tuple_1.age)
  def 水生木(i: 水): 木 = new 木 {
    override def function[E](ii: 火星[E]): 火[E] = 火(id = i._1, name = i._2, age = i._3, birthday = ii.birthday)
  }
  def 木生火[E](i: 火星[E], ii: 木): 火[E] = ii.function(i) //火星将会汇入木生火的火中
  def 火生土[E](i: 火[E]): 土[E]         = (i.id, i.name, i.age, i.birthday)
  def 土生金[E](i: 土[E]): 金 = new 金 {
    override type T = E
    override def tuple_1: 火[T] = 火(id = i._1, name = i._2, age = i._3, birthday = i._4)
  }

}
