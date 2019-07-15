object Runner extends App {

  class Init[YY <: HListYuan](yueyuan: YY) extends YQImpl(yueyuan, `月缺`, 1, QueToYuan)

  type Yue = Init[`月圆`#Add[Int]#Add[Int]#Add[String]]
  val a0: Int    = (throw new Exception("ii")): Yue#Current
  val a1: `月缺`   = (throw new Exception("ii")): Yue#Next#Current
  val a2: Int    = (throw new Exception("ii")): Yue#Next#Next#Current
  val a3: String = (throw new Exception("ii")): Yue#Next#Next#Next#Current
  val aa: Yue#Next#Next = ""
  val a4: Int    = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Current
  val a5: Int    = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Current
  val a6: `月圆`   = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Current
  val a7: Int    = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Current
  val a8: Int    = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Next#Current
  val a9: String = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Next#Next#Current

  type Next10 = Yue#Next#Next#Next#Next#Next#Next#Next#Next#Next#Next
  val a10: Int    = (throw new Exception("ii")): Next10#Current
  val a11: `月缺`   = (throw new Exception("ii")): Next10#Next#Current
  val a12: `月缺`   = (throw new Exception("ii")): Next10#Next#Next#Current
  val a13: `月缺`   = (throw new Exception("ii")): Next10#Next#Next#Next#Current
  val a14: Int    = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Current
  val a15: String = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Next#Current
  val a16: Int    = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Next#Next#Current
  val a17: Int    = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Next#Next#Next#Current
  val a18: `月圆`   = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Next#Next#Next#Next#Current
  val a19: `月圆`   = (throw new Exception("ii")): Next10#Next#Next#Next#Next#Next#Next#Next#Next#Next#Current

  type Next20 = Next10#Next#Next#Next#Next#Next#Next#Next#Next#Next#Next
  val a20: `月圆`   = (throw new Exception("ii")): Next20#Current
  val a21: Int    = (throw new Exception("ii")): Next20#Next#Current
  val a22: Int    = (throw new Exception("ii")): Next20#Next#Next#Current
  val a23: String = (throw new Exception("ii")): Next20#Next#Next#Next#Current
  val a24: Int    = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Current
  val a25: `月缺`   = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Next#Current
  val a26: `月缺`   = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Next#Next#Current
  val a27: `月缺`   = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Next#Next#Next#Current
  val a28: `月缺`   = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Next#Next#Next#Next#Current
  val a29: `月缺`   = (throw new Exception("ii")): Next20#Next#Next#Next#Next#Next#Next#Next#Next#Next#Current

  type Next30 = Next20#Next#Next#Next#Next#Next#Next#Next#Next#Next#Next

  val a30: Int = (throw new Exception("ii")): Next30#Current

}
