import scala.language.higherKinds

object ThirdTest extends App {

  class HListM[I <: HList, B <: Chaju](val hlist: I, val tran: B) {
    def add[Item](item: Item): HListM[B#M[I, Item], B#Next] = new HListM(tran.tran(hlist, item), tran.next)
    override def toString: String = hlist.toString
  }

  object HListMImpl extends HListM(HNil, Manyi.add.add.add.add)

  val item = HListMImpl.add(1).add("个").add("喵喵喵").add("满").add("自").add("溢").add("的").add("HList")
  println(item.toString)
  val b: String :: String :: String :: Int :: HNil = item.hlist //检查类型

}
