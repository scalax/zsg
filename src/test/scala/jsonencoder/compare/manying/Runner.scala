import java.util.Date

object ThirdTest extends App {

  class HListM[I <: HList, B <: Chaju](val hlist: I, val tran: B) {
    type Add[Item] = HListM[B#M[I, Item], B#Next]
    def add[Item](item: Item): HListM[B#M[I, Item], B#Next] = new HListM(tran.tran(hlist, item), tran.next)
    override def toString: String                           = hlist.toString
  }

  class ZeroHListM  extends HListM(HNil, Manyi.add.add.add.add)
  object ZeroHListM extends ZeroHListM

  val item = ZeroHListM.add(1).add("个").add("喵喵喵").add("满").add("自").add("溢").add("的").add("HList")
  println(item.toString) //HNil, 1, 个, 喵喵喵, 满
  val b: HNil#Add[Int]#Add[String]#Add[String]#Add[String] = item.hlist //检查类型

  //脱离实体的运算
  val ii: ZeroHListM#Add[Int]#Add[Date]#Add[String]#Add[String]#Add[String]#Add[String]#Add[String]#Add[String] = throw new Exception("abc")
  val iiii: ZeroHListM#Add[Int]#Add[Date]#Add[String]#Add[String]#Add[String]                                   = ii
  val iiiiii: ZeroHListM#Add[Int]#Add[Date]#Add[String]#Add[String]                                             = ii
  val iiiiiiii: HNil#Add[Int]#Add[Date]#Add[String]#Add[String]                                                 = ii.hlist

}
