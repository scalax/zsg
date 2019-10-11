import scala.language.higherKinds

object TwoTest extends App {

  trait Bit2 {

    type M[I <: Bit2] <: Bit2
    type Next <: Bit2

    def tranBit2[I <: Bit2](i: I): M[I]
    def next: Next

  }

  class Zero extends Bit2 {
    self =>

    override type M[I <: Bit2] = I
    override type Next         = Bit2Impl[Bit2Impl[Zero]]

    override def tranBit2[I <: Bit2](i: I): I   = i
    override def next: Bit2Impl[Bit2Impl[Zero]] = new Bit2Impl(new Bit2Impl(self))

    override def toString = ""

  }

  object Zero extends Zero

  class Bit2Impl[Per <: Bit2](val per: Per) extends Bit2 {
    self =>

    override type M[I <: Bit2] = Bit2Impl[Per#M[I]]
    override type Next         = M[Bit2Impl[Per]]

    override def tranBit2[I <: Bit2](i: I): Bit2Impl[Per#M[I]] = new Bit2Impl(per.tranBit2(i))
    override def next: M[Bit2Impl[Per]]                        = tranBit2(self)

    override def toString = "1" + per.toString

  }

  val a1: Bit2Impl[Bit2Impl[Zero]]                                                             = Zero.next
  val a2: Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Zero]]]]                                         = a1.next
  val a3: Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Bit2Impl[Zero]]]]]]]] = a2.next

  println(a1)
  println(a2)
  println(a3)

}
