package net.scalax.asuna.slick.sortBy

import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }

object SlickSortBy {

  /*trait OrderByWrap {
    val key: String
    val column: OrderColumn
  }*/

  trait OrderColumn extends AtomicColumn[Any, OrderColumn] {
    self =>
    override def common: OrderColumn = self
    type Rep
    val rep: Rep
    val orderByGen: Rep => slick.lifted.Ordered
    val columnInfo: MacroColumnInfo
  }

  val DESC = "desc"
  val ASC = "asc"
  val DEFAULT = "default"

  def extractOrder(orderWraps: List[OrderColumn], names: List[(String, String)]): slick.lifted.Ordered = {
    val ords = names
      .map(name => (orderWraps.find(r => name._1 == r.columnInfo.modelColumnName), name._2))
      .map {
        case (wrapOpt, orderWray) =>
          wrapOpt.flatMap { wrap =>
            val orders = wrap.orderByGen(wrap.rep)
            orderWray match {
              case DESC => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.desc) }))
              case ASC => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.asc) }))
              case DEFAULT => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord) }))
              case _ => Option.empty
            }
          }

      }
      .collect { case Some(wrap) => wrap }

    ords match {
      case Nil =>
        new slick.lifted.Ordered(Vector.empty)
      case list @ (_ :: _) =>
        list.reduce((s, t) => new slick.lifted.Ordered(t.columns ++: s.columns))
    }
  }

}

trait SlickSortByHelper {

  trait InputParameter[RepOut, Data] extends Function1[List[(String, String)], slick.lifted.Ordered] with EncoderContent[RepOut, Data] {
    def inputParam(param: List[(String, String)]): slick.lifted.Ordered
    override def apply(param: List[(String, String)]): slick.lifted.Ordered = inputParam(param)
  }

  implicit def sortByImplicitWithColumnInfo[T, R](implicit cv1: T => slick.lifted.Ordered, columnInfo: MacroColumnInfo): EncoderShape[T, Any, T, SlickSortBy.OrderColumn, Any] = {
    val columnInfo1 = columnInfo
    new EncoderShape[T, Any, T, SlickSortBy.OrderColumn, Any] {
      override def wrapRep(base: T): T = base
      override def toLawRep(base: T, oldRep: List[SlickSortBy.OrderColumn]): List[SlickSortBy.OrderColumn] = {
        new SlickSortBy.OrderColumn {
          override type Rep = T
          override val rep: T = base
          override val orderByGen = cv1
          override val columnInfo = columnInfo1
        } :: oldRep
      }
      override def buildData(data: Any, rep: T, oldData: List[Any]): List[Any] = data :: oldData
    }
  }

  object sortBy extends EncoderHelper[SlickSortBy.OrderColumn, Any] with EncoderWrapperHelper[SlickSortBy.OrderColumn, Any, InputParameter] {

    override def effect[E, U, R](rep: E)(implicit shape: EncoderShape[E, U, R, SlickSortBy.OrderColumn, Any]): InputParameter[R, U] = {
      new InputParameter[R, U] {
        override def inputParam(map: List[(String, String)]): slick.lifted.Ordered = {
          val reps = shape.toLawRep(shape.wrapRep(rep), List.empty)
          SlickSortBy.extractOrder(reps, map)
        }
      }
    }

  }

}