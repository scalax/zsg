package asuna {

  import scala.language.higherKinds

  trait TupleTag

  trait Message

  package impl {
    case class :-<>-:[M1 <: Message, M2 <: Message](m1: M1, m2: M2) extends Message
  }
}
