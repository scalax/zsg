package zsg.testkit.rep1

import zsg.rep.{RepMeta, RepMeta1, RepMeta2}

object Rep1 {
  def description(descript: String): Description = new Description(descript)
  def reverseBoolean: ReverseBoolean             = ReverseBoolean.value
  val meta: RepMeta2[StartRoute, BooleanModel]   = RepMeta(StartRoute.value, new BooleanModel(isPrepared = true))

  val routeMeta: RepMeta1[StartRoute] = RepMeta(StartRoute.value)
}
