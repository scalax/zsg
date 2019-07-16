object Runner extends App {

  class 新月
  class 上弦
  class 渐盈
  class 满月

  class Init[YY <: HListYuan](yueyuan: YY) extends YQImpl[YY, YueyuanZero](yueyuan, YueyuanZero)

  type Yue = Init[YueyuanZero#Add[满月]#Add[渐盈]#Add[上弦]#Add[新月]]
  val a1: 新月 = (throw new Exception("ii")): Yue#Current
  val a2: 新月 = (throw new Exception("ii")): Yue#Next#Current
  val a3: 上弦 = (throw new Exception("ii")): Yue#Next#Next#Current
  val a4: 渐盈 = (throw new Exception("ii")): Yue#Next#Next#Next#Current

  val a5: 满月 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Current
  val a6: 满月 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Current
  val a7: 渐盈 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Current

  val a8: 上弦 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Current
  val a9: 新月 = (throw new Exception("ii")): Yue#Next#Next#Next#Next#Next#Next#Next#Next#Current

  type Yue10 = Yue#Next#Next#Next#Next#Next#Next#Next#Next#Next
  val a10: 新月 = (throw new Exception("ii")): Yue10#Current
  val a11: 上弦 = (throw new Exception("ii")): Yue10#Next#Current
  val a12: 渐盈 = (throw new Exception("ii")): Yue10#Next#Next#Current
  val a13: 满月 = (throw new Exception("ii")): Yue10#Next#Next#Next#Current
  val a14: 满月 = (throw new Exception("ii")): Yue10#Next#Next#Next#Next#Current
  val a15: 渐盈 = (throw new Exception("ii")): Yue10#Next#Next#Next#Next#Next#Current
  val a16: 上弦 = (throw new Exception("ii")): Yue10#Next#Next#Next#Next#Next#Next#Current

}
