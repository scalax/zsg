package net.scalax.asuna.core

import net.scalax.asuna.shape.DataShapeValue
import play.api.libs.circe.Filterable
import slick.lifted.Query
import scala.language.higherKinds

trait SlickWriterQuery[U] {

  def shapeValue: DataShapeValue[U, Filterable]

}

object SlickWriterQuery {

  def tranQuery[E, U, R, C[_]](query: Query[E, U, C], cv: E => SlickWriterQuery[R], data: R)(implicit profile: slick.jdbc.JdbcProfile): Query[E, U, C] = {
    query.filter { table =>
      val w = cv(table)
      val impl = implicitly[DataShape[DataShapeValue[R, Filterable], R, DataShapeValue[R, Filterable], Filterable]]
      val reps = impl.toLawRep(impl.wrapRep(w.shapeValue))
      //val reps = w.shapeValue.shape.
      import profile.api._
      LiteralColumn(true)
    }
  }

}