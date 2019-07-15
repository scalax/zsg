class YuanToQue extends Convert {
  override type M[I <: HListYQ] = YQImpl[I#Yueyuan#Tail, I#Yueque#Add[I#Current], I#Yueyuan#Head, I#Yueyuan#C]
  override def convert[I <: HListYQ](i: I): YQImpl[I#Yueyuan#Tail, I#Yueque#Add[I#Current], I#Yueyuan#Head, I#Yueyuan#C] = {
    new YQImpl(i.yueyuan.tail, i.yueque.add(i.current), i.yueyuan.head, i.yueyuan.c)
  }
}

object YuanToQue extends YuanToQue

class QueToYuan extends Convert {
  override type M[I <: HListYQ] = YQImpl[I#Yueyuan#Add[I#Current], I#Yueque#Tail, I#Yueque#Head, I#Yueque#C]
  override def convert[I <: HListYQ](i: I): YQImpl[I#Yueyuan#Add[I#Current], I#Yueque#Tail, I#Yueque#Head, I#Yueque#C] = {
    new YQImpl(i.yueyuan.add(i.current), i.yueque.tail, i.yueque.head, i.yueque.c)
  }
}

object QueToYuan extends QueToYuan
