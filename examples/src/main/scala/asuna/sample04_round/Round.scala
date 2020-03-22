package asuna.sample04_round

import java.util.Date

object Round {

  trait 金 {
    def tuple_1: 火
    def tuple_2: 火星 = 火星(birthday = tuple_1.birthday)
  }

  type 水 = (Long, String, Int)

  trait 木 {
    def function(i: 火星): 火
  }

  case class 火(id: Long, name: String, age: Int, birthday: Date)
  case class 火星(birthday: Date)

  type 土 = (Long, String, Int, Date) //一方水土养一方人，只有水和土是数据之源

  def 金生水(i: 金): 水 = (i.tuple_1.id, i.tuple_1.name, i.tuple_1.age)
  def 水生木(i: 水): 木 = new 木 {
    override def function(ii: 火星): 火 = 火(id = i._1, name = i._2, age = i._3, birthday = ii.birthday)
  }
  def 木生火(i: 火星, ii: 木): 火 = ii.function(i) //火星将会汇入木生火的火中
  def 火生土(i: 火): 土         = (i.id, i.name, i.age, i.birthday)
  def 土生金(i: 土): 金 = new 金 {
    override def tuple_1: 火 = 火(id = i._1, name = i._2, age = i._3, birthday = i._4)
  }

}
