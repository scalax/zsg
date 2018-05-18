package play.api.libs.circe

import net.scalax.asuna.core._

trait Filterable {
  import slick.lifted.Rep

  type DataType

  def toOptionCondition(data: DataType): Rep[Option[Boolean]]

}

trait FilterableImpl[D] extends Filterable {
  import slick.lifted.Rep

  override type DataType = D

  override def toOptionCondition(data: D): Rep[Option[Boolean]]

}

trait SlickFilterHelper {

  implicit class columExtensionMethod[D, E](rep: D)(implicit cv: D <:< slick.lifted.Rep[E], profile: slick.jdbc.JdbcProfile) {
    import profile.api._
    def filter(implicit f: SlickFilterImpl[E]): FilterableImpl[E] = {
      new FilterableImpl[E] {
        override def toOptionCondition(data: E): Rep[Option[Boolean]] = {
          implicit val b = f.basedTypedType
          f.covertToBoolean(cv(rep)) === f.covertData(data)
        }
      }
    }
  }

  implicit def readerShape[R]: DataShape[FilterableImpl[R], R, FilterableImpl[R], Filterable] = {
    new DataShape[FilterableImpl[R], R, FilterableImpl[R], Filterable] { self =>
      override def packed: DataShape[FilterableImpl[R], R, FilterableImpl[R], Filterable] = self
      override def wrapRep(base: FilterableImpl[R]): FilterableImpl[R] = base
      override def toLawRep(base: FilterableImpl[R]): DataRepGroup[Filterable] = DataRepGroup(reps = List(base), subs = List.empty)
      override def takeData(oldData: DataGroup, rep: FilterableImpl[R]): Either[NotConvert, SplitData[R]] = {
        oldData.items match {
          case head :: tail =>
            Right(SplitData(current = head.asInstanceOf[R], left = DataGroup(items = tail, subs = oldData.subs)))
        }
      }
      override def buildData(splitData: R, rep: FilterableImpl[R]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

}