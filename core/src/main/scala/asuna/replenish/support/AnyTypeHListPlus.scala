package asuna.support

import asuna.{AnyHListTypeHList, AnyTypeHList, Plus}

trait AnyTypeHListPlus {
  self =>

  val plus: Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] = new Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: AnyHListTypeHList#H, item: AnyTypeHList#H): AnyHListTypeHList#H  = item :: p
    override def takeHead(t: AnyHListTypeHList#H): AnyHListTypeHList#H                    = t.tail
    override def takeTail(t: AnyHListTypeHList#H): AnyTypeHList#H                         = t.head
    override lazy val sub: Plus[AnyHListTypeHList#T, AnyTypeHList#T, AnyHListTypeHList#T] = self.plus
  }

}

object AnyTypeHListPlus extends AnyTypeHListPlus
