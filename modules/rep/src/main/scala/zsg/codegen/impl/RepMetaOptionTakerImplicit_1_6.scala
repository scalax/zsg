package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_6 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta6[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta6[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6], TTu] {
      override def function(i: zsg.rep.RepMeta6[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6]): Option[TTu] = Option.empty
    }
}
