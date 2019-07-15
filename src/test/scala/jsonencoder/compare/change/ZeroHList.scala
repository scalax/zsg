object Runner extends App {

  class 新月
  class 上弦
  class 渐盈
  class 满月

  class Init[YY <: HListYuan](yueyuan: YY) extends YQImpl[YY, YuequeZero, 新月, YuanToQue](yueyuan, YuequeZero, new 新月, YuanToQue)

  type Yue = Init[YueyuanZero#Add[满月]#Add[渐盈]#Add[上弦]]
  val a1: 新月 = (throw new Exception("ii")): Yue#Current
  val a2: 上弦 = (throw new Exception("ii")): Yue#Next#Current
  val a3: 渐盈 = (throw new Exception("ii")): Yue#Next#Next#Current
  val a4: 满月 = (throw new Exception("ii")): Yue#Next#Next#Next#Current

  val a5: 渐盈 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Current
  val a6: 上弦 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Current
  val a7: 新月 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Current

  val a8: 上弦  = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Current
  val a9: 渐盈  = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Next#Current
  val a10: 满月 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Next#Next#Current

}
