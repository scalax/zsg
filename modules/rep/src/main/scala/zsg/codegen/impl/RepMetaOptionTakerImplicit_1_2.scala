package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_2 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, TTu]: zsg.rep.OptionRepTaker[zsg.rep.RepMeta2[Tu1, Tu2], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta2[Tu1, Tu2], TTu] {
      override def function(i: zsg.rep.RepMeta2[Tu1, Tu2]): Option[TTu] = Option.empty
    }
}
