package zsg

abstract class OptionRepTaker[T, R] {
  def take(t: T): Option[R]
}

object OptionRepTaker extends OptionRepTakerImplicitImpl {
  implicit def zsgTuple2OptionRepTakerTuple2[T1, T2, R](implicit
    i1: OptionRepTaker[T1, R],
    i2: OptionRepTaker[T2, R]
  ): OptionRepTaker[ZsgTuple2[T1, T2], R] =
    new OptionRepTaker[ZsgTuple2[T1, T2], R] {
      override def take(v1: ZsgTuple2[T1, T2]): Option[R] = (i1.take(v1.i1), i2.take(v1.i2)) match {
        case (Some(x1), Some(_)) => Option(x1)
        case (Some(x1), None)    => Option(x1)
        case (None, Some(x2))    => Option(x2)
        case (None, None)        => Option.empty
      }
    }
  implicit def zsgTuple2OptionRepTakerIdentity[R]: OptionRepTaker[R, R] = new OptionRepTaker[R, R] {
    override def take(v1: R): Option[R] = Option(v1)
  }
}

trait OptionRepTakerImplicitImpl {
  implicit def zsgTuple2OptionRepTakerNone[R, T]: OptionRepTaker[T, R] = new OptionRepTaker[T, R] {
    override def take(v1: T): Option[R] = Option.empty
  }
}

trait RepMerge {
  implicit class mergeExtensionMethod[T](t: T) {
    def merge[N](n: N): ZsgTuple2[T, N] = new ZsgTuple2(t, n)
  }
}

object RepMerge extends RepMerge
