package net.scalax.asuna.slick.filter

import net.scalax.asuna.core.{ DataShape, DataShapeValue }
import slick.lifted.Query

import scala.language.higherKinds

trait SlickFilterQuery[U] {

  def slickFilterSv: DataShapeValue[U, SlickFilterCol]

}

object SlickFilterQuery {

  trait InputData[E, U, C[_], R] {
    def inputData(data: R): Query[E, U, C]
  }

  def apply[E, U, R, C[_]](query: Query[E, U, C])(cv: E => SlickFilterQuery[R])(implicit profile: slick.jdbc.JdbcProfile): InputData[E, U, C, R] = {
    new InputData[E, U, C, R] {
      override def inputData(data: R): Query[E, U, C] = {
        query.filter { table =>
          val w = cv(table)
          val impl = implicitly[DataShape[DataShapeValue[R, SlickFilterCol], R, DataShapeValue[R, SlickFilterCol], SlickFilterCol]]
          val reps = impl.toLawRep(impl.wrapRep(w.slickFilterSv)).reps
          val dataList = impl.buildData(data, w.slickFilterSv).right.get.items
          import profile.api._
          val list = reps.zip(dataList).map {
            case (eachRep, eachData) =>
              eachRep.toOptionCondition(eachData.asInstanceOf[eachRep.InputDataType])
          }
          list match {
            case Nil => LiteralColumn(Option(true))
            case head :: tail => tail.foldLeft(head) { (left, right) =>
              left && right
            }
          }
        }
      }
    }

  }

}