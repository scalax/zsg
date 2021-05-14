package zsg.testkit.rep1

import zsg.RepMerge._
import zsg.OptionRepTaker

object Rep1 {
  def description(descript: String): Description = new Description(descript)
  def reverseBoolean: ReverseBoolean             = ReverseBoolean.value
  val meta                                       = StartRoute.value.merge(new BooleanModel(isPrepared = true))
  val routeMeta                                  = StartRoute.value

  class OptionTakerApply[Out] {
    def apply[In](i: In)(implicit taker: OptionRepTaker[In, Out]): Option[Out] = taker.take(i)
  }

  def takeOption[Out]: OptionTakerApply[Out] = new OptionTakerApply[Out]
}
