package zsg.rep.impl
trait RepMetaOptionTakerImplicit_1_7 {
  implicit def repMetaOptionTakerImplicitDefault[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7, TTu]
    : zsg.rep.OptionRepTaker[zsg.rep.RepMeta7[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7], TTu] =
    new zsg.rep.OptionRepTaker[zsg.rep.RepMeta7[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7], TTu] {
      override def function(i: zsg.rep.RepMeta7[Tu1, Tu2, Tu3, Tu4, Tu5, Tu6, Tu7]): Option[TTu] = Option.empty
    }
}
