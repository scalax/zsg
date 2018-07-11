package net.scalax.asuna.slick.sortBy

import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }

object SlickSortBy {

  trait OrderByWrap {
    val key: String
    val column: OrderColumn
  }

  trait OrderColumn extends AtomicColumn[String, OrderColumn] {
    self =>
    override def common: OrderColumn = self
    type Rep
    val rep: Rep
    val orderByGen: Rep => slick.lifted.Ordered
  }

  val DESC = "desc"
  val ASC = "asc"
  val DEFAULT = "default"

  def extractOrder(orderWraps: List[OrderByWrap], names: List[(String, String)]): slick.lifted.Ordered = {
    val ords = names
      .map(name => (orderWraps.find(r => name._1 == r.key), name._2))
      .map {
        case (wrapOpt, orderWray) =>
          wrapOpt match {
            case Some(wrap) =>
              val orders = wrap.column.orderByGen(wrap.column.rep)
              orderWray match {
                case DESC => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.desc) }))
                case ASC => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.asc) }))
                case DEFAULT => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord) }))
              }
            case _ =>
              Option.empty
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

  trait InputParameter extends Function1[List[(String, String)], slick.lifted.Ordered] {
    def inputParam(param: List[(String, String)]): slick.lifted.Ordered
    override def apply(param: List[(String, String)]): slick.lifted.Ordered = inputParam(param)
  }

  trait InputOrderColumn[RepOut, Data] extends EncoderContent[RepOut, Data] {
    def inputData(data: Data): InputParameter
  }

  implicit def slickSortByEncoderShapeImplicit[T](implicit cv1: T => slick.lifted.Ordered): EncoderShape[T, String, T, SlickSortBy.OrderColumn] = {
    new EncoderShape[T, String, T, SlickSortBy.OrderColumn] {
      override def wrapRep(base: T): T = base
      override def toLawRep(base: T): DataRepGroup[SlickSortBy.OrderColumn] = DataRepGroup(List(new SlickSortBy.OrderColumn {
        override type Rep = T
        override val rep: T = base
        override val orderByGen = cv1
      }))
      override def buildData(data: String, rep: T): DataGroup = DataGroup(List(data))
    }
  }

  object sortBy extends EncoderHelper[SlickSortBy.OrderColumn] with EncoderWrapperHelper[SlickSortBy.OrderColumn, InputOrderColumn] {

    override def effect[E, U, R](rep: E)(implicit shape: EncoderShape[E, U, R, SlickSortBy.OrderColumn]): InputOrderColumn[R, U] = {
      new InputOrderColumn[R, U] {
        override def inputData(data: U): InputParameter = new InputParameter {
          override def inputParam(map: List[(String, String)]): slick.lifted.Ordered = {
            val w = shape.wrapRep(rep)
            val reps = shape.toLawRep(shape.wrapRep(rep)).reps
            val dataList = shape.buildData(data, w).items.map(_.asInstanceOf[String])
            val list = reps.zip(dataList).map {
              case (eachRep, eachKey) =>
                new SlickSortBy.OrderByWrap {
                  override val key = eachKey
                  override val column = eachRep
                }
            }
            SlickSortBy.extractOrder(list, map)
          }
        }
      }
    }

  }

}