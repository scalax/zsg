package net.scalax.asuna.slick.filter

import net.scalax.asuna.core._

import scala.language.higherKinds

trait InputData[RepOut, Data] extends EncoderAbsWrapper[RepOut, Data] {
  def inputData(data: Data)(implicit profile: slick.jdbc.JdbcProfile): Option[slick.lifted.Rep[Option[Boolean]]]
}

object SlickFilterQuery extends EncoderAbsWrapperHelper[SlickFilterCol, InputData] {

  override def effect[E, U, R](rep: E)(implicit shape: EncoderShape[E, U, R, SlickFilterCol]): InputData[R, U] = {
    new InputData[R, U] {
      override def inputData(data: U)(implicit profile: slick.jdbc.JdbcProfile): Option[slick.lifted.Rep[Option[Boolean]]] = {
        val w = shape.wrapRep(rep)
        val reps = shape.toLawRep(shape.wrapRep(rep)).reps
        val dataList = shape.buildData(data, w)
        import profile.api._
        val list = reps.zip(dataList.items).map {
          case (eachRep, eachData) =>
            eachRep.toOptionCondition(eachData.asInstanceOf[eachRep.InputDataType])
        }
        list match {
          case Nil => Option.empty
          case head :: tail => Option(tail.foldLeft(head) { (left, right) => left && right })
        }
      }
    }

  }

}