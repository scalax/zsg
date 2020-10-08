package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_1 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta1[Tu1], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta1[Tu1], TTu] {
      override def function(i: zsg.rep.RepMeta1[Tu1]): Option[TTu] = Option.empty
    }
}
