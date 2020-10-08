package zsg.testkit.rep1

import zsg.rep.{OptionRepTaker, RepMeta, RepMeta1, RepMeta2, RepTaker}

object Rep1 {
  def description(descript: String): Description = new Description(descript)
  def reverseBoolean: ReverseBoolean             = ReverseBoolean.value
  val meta: RepMeta2[StartRoute, BooleanModel]   = RepMeta(StartRoute.value, new BooleanModel(isPrepared = true))

  val routeMeta: RepMeta1[StartRoute] = RepMeta(StartRoute.value)

  class TakerApply[Out] {
    def apply[In](i: In)(implicit taker: RepTaker[In, Out]): Out = taker.function(i)
  }

  class OptionTakerApply[Out] {
    def apply[In](i: In)(implicit taker: OptionRepTaker[In, Out]): Option[Out] = taker.function(i)
  }

  def take[Out]: TakerApply[Out]             = new TakerApply[Out]
  def takeOption[Out]: OptionTakerApply[Out] = new OptionTakerApply[Out]
}
