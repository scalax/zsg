package zsg.testkit.rep1

import zsg.rep.RepFunction

class ReverseBoolean

object ReverseBoolean extends ReverseBooleanImplicit1 {
  val value: ReverseBoolean = new ReverseBoolean

  implicit def implicit2: RepFunction[BooleanModel, ReverseBoolean, BooleanModel] = RepFunction((i, r) => new BooleanModel(!i.isPrepared))
}

trait ReverseBooleanImplicit1 {
  implicit def implicit1[I]: RepFunction[I, ReverseBoolean, I] = RepFunction.identity
}
