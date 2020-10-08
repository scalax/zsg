package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_5 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, Tu4, Tu5, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta5[Tu1, Tu2, Tu3, Tu4, Tu5], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta5[Tu1, Tu2, Tu3, Tu4, Tu5], TTu] {
      override def function(i: zsg.rep.RepMeta5[Tu1, Tu2, Tu3, Tu4, Tu5]): Option[TTu] = Option.empty
    }
}
