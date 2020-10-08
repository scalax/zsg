package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_4 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, Tu4, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta4[Tu1, Tu2, Tu3, Tu4], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta4[Tu1, Tu2, Tu3, Tu4], TTu] {
      override def function(i: zsg.rep.RepMeta4[Tu1, Tu2, Tu3, Tu4]): Option[TTu] = Option.empty
    }
}
