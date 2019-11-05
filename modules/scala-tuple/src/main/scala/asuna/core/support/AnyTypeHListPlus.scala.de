package asuna.support

import asuna.{AnyHListTypeHList, AnyTypeHList, Plus}

final object AnyTypeHListPlus {

  final val plus: Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] = new Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] {
    self =>
    override final def plus(p: AnyHListTypeHList#H, item: AnyTypeHList#H): AnyHListTypeHList#H  = item :: p
    override final def takeHead(t: AnyHListTypeHList#H): AnyHListTypeHList#H                    = t.tail
    override final def takeTail(t: AnyHListTypeHList#H): AnyTypeHList#H                         = t.head
    override final lazy val sub: Plus[AnyHListTypeHList#T, AnyTypeHList#T, AnyHListTypeHList#T] = self
  }

}
