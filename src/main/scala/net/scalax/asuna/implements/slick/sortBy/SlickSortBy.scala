package net.scalax.asuna.slick.sortBy

import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.mapper.common.{MacroColumnInfo, RepColumnContent}
import net.scalax.asuna.mapper.encoder.{EncoderContent, EncoderWrapperHelper}

object SlickSortBy {

  trait OrderColumn {
    self =>
    type Rep
    val rep: Rep
    val orderByGen: Rep => slick.lifted.Ordered
    val columnInfo: MacroColumnInfo
  }

  val DESC    = "desc"
  val ASC     = "asc"
  val DEFAULT = "default"

  def extractOrder(orderWraps: List[OrderColumn], names: List[(String, String)]): slick.lifted.Ordered = {
    val ords = names
      .map(name => (orderWraps.find(r => name._1 == r.columnInfo.modelColumnName), name._2))
      .map {
        case (wrapOpt, orderWray) =>
          wrapOpt.flatMap { wrap =>
            val orders = wrap.orderByGen(wrap.rep)
            orderWray match {
              case DESC    => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.desc) }))
              case ASC     => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord.asc) }))
              case DEFAULT => Option(new slick.lifted.Ordered(orders.columns.map { case (node, ord) => (node, ord) }))
              case _       => Option.empty
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

  trait InputParameter[RepOut, Data] extends EncoderContent[RepOut, Data] {
    def inputParam(param: List[(String, String)]): slick.lifted.Ordered
  }

  implicit def sortByImplicitWithColumnInfo[T, M](
      implicit cv1: T => slick.lifted.Ordered
  ): EncoderShape.Aux[RepColumnContent[T, M], M, SlickSortBy.OrderColumn, List[SlickSortBy.OrderColumn], List[Any]] = {
    new EncoderShape[RepColumnContent[T, M], List[SlickSortBy.OrderColumn], List[Any]] {
      override type Target = SlickSortBy.OrderColumn
      override type Data   = M
      override def wrapRep(base: RepColumnContent[T, M]): SlickSortBy.OrderColumn = new SlickSortBy.OrderColumn {
        override type Rep = T
        override val rep        = base.rep
        override val orderByGen = cv1
        override val columnInfo = base.columnInfo
      }
      override def toLawRep(base: SlickSortBy.OrderColumn, oldRep: List[SlickSortBy.OrderColumn]): List[SlickSortBy.OrderColumn] = base :: oldRep
      override def buildData(data: M, rep: SlickSortBy.OrderColumn, oldData: List[Any]): List[Any]                               = data :: oldData
    }
  }

  object sortBy extends EncoderWrapperHelper[List[SlickSortBy.OrderColumn], List[Any], InputParameter] {

    override def effect[E, U, R](rep: E)(implicit shape: EncoderShape.Aux[E, U, R, List[SlickSortBy.OrderColumn], List[Any]]): InputParameter[R, U] = {
      new InputParameter[R, U] {
        override def inputParam(map: List[(String, String)]): slick.lifted.Ordered = {
          val reps = shape.toLawRep(shape.wrapRep(rep), List.empty)
          SlickSortBy.extractOrder(reps, map)
        }
      }
    }

  }

}
