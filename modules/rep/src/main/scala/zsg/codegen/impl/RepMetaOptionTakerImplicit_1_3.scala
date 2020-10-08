package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_3 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta3[Tu1, Tu2, Tu3], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta3[Tu1, Tu2, Tu3], TTu] {
      override def function(i: zsg.rep.RepMeta3[Tu1, Tu2, Tu3]): Option[TTu] = Option.empty
    }
}
