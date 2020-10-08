package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_8 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8, TTu]
    : zsg.rep.OptionRepTaker[zsg.rep.RepMeta8[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta8[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8], TTu] {
      override def function(i: zsg.rep.RepMeta8[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, Tu8]): Option[TTu] = Option.empty
    }
}
