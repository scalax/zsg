package org.scalax.asuna.mapper.append.slick

import org.scalax.asuna.ii.item.{AppendTuple, XyyItem0}
import org.scalax.asuna.mapper.item._
import slick.ast.{BaseTypedType, Library, LiteralNode, ProductNode}
import slick.util.ConstArray
import slick.lifted.OptionMapper

object TupleTest3 {

  val option: OptionMapper[Option[Boolean], Option[Boolean]] = new OptionMapper[Option[Boolean], Option[Boolean]] {
    override def apply(n: slick.lifted.Rep[Option[Boolean]]): slick.lifted.Rep[Option[Boolean]] = n
    override def lift                                                                           = false
    override def toString                                                                       = "OptionTupleMapper.option"
  }

  trait P[RawDataType] {
    def inSet(dataType: Traversable[RawDataType]): slick.lifted.Rep[Option[Boolean]]
    def inSetBind(dataType: Traversable[RawDataType]): slick.lifted.Rep[Option[Boolean]]
  }

  trait TupleEncoder[RepType, RawDataType] {

    def rep(rep: RepType, r: List[slick.ast.Node]): List[slick.ast.Node]
    def dataNode(dataType: RawDataType, node: List[slick.ast.Node]): List[slick.ast.Node]
    def bindDataNode(dataType: RawDataType, node: List[slick.ast.Node]): List[slick.ast.Node]

    def iii(rep1: RepType, pp: slick.ast.TypedType[Option[Boolean]]): P[RawDataType] = new P[RawDataType] {
      def inSet(dataType: Traversable[RawDataType]): slick.lifted.Rep[Option[Boolean]] = {
        if (dataType.isEmpty) option(slick.lifted.LiteralColumn(Option(false))(pp))
        else
          option.column(
              Library.In
            , ProductNode(ConstArray.from(rep(rep1, List.empty)))
            , ProductNode(ConstArray.from(dataType.map { v =>
              ProductNode(ConstArray.from(dataNode(v, List.empty)))
            }))
          )(pp)
      }

      override def inSetBind(dataType: Traversable[RawDataType]): slick.lifted.Rep[Option[Boolean]] = {
        if (dataType.isEmpty) option(slick.lifted.LiteralColumn(Option(false))(pp))
        else
          option.column(
              Library.In
            , ProductNode(ConstArray.from(rep(rep1, List.empty)))
            , ProductNode(ConstArray.from(dataType.map { v =>
              ProductNode(ConstArray.from(bindDataNode(v, List.empty)))
            }))
          )(pp)
      }
    }

  }

  class TupleContext[Companion] extends KindContext {
    override type M[I <: TypeParam] = TupleEncoder[I#H, I#T#H]
  }

  class TEncoderContext[Companion] extends Context[TupleContext[Companion]] {

    override def useHList: Boolean  = true
    override def isReverse: Boolean = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
        x: TupleEncoder[X#H, X#T#H]
      , y: TupleEncoder[Y#H, Y#T#H]
      , p: Plus[X, Y, Z]
    ): TupleEncoder[Z#H, Z#T#H] = {
      new TupleEncoder[Z#H, Z#T#H] {
        override def rep(rep: Z#H, r: List[slick.ast.Node]): List[slick.ast.Node] = {
          y.rep(p.takeHead(rep), x.rep(p.takeTail(rep), r))
        }
        override def dataNode(dataType: Z#T#H, node: List[slick.ast.Node]): List[slick.ast.Node] = {
          y.dataNode(p.sub.takeHead(dataType), x.dataNode(p.sub.takeTail(dataType), node))
        }
        override def bindDataNode(dataType: Z#T#H, node: List[slick.ast.Node]): List[slick.ast.Node] = {
          y.bindDataNode(p.sub.takeHead(dataType), x.bindDataNode(p.sub.takeTail(dataType), node))
        }
      }
    }

    override def start: TupleEncoder[XyyItem0, XyyItem0] = new TupleEncoder[XyyItem0, XyyItem0] {
      override def rep(rep: XyyItem0, r: List[slick.ast.Node]): List[slick.ast.Node]                  = r
      override def dataNode(dataType: XyyItem0, node: List[slick.ast.Node]): List[slick.ast.Node]     = node
      override def bindDataNode(dataType: XyyItem0, node: List[slick.ast.Node]): List[slick.ast.Node] = node
    }

  }

  /*class PP[K] {
    private val c: Context[TupleContext[K]] = new TEncoderContext[K]
    def encodeTuple[T, I <: TypeParam](x: T)(implicit ii: Application[TupleContext[K], T, I], iii: T <:< I#H, pp: slick.ast.TypedType[Option[Boolean]]): P[I#T#H] = {
      ii.application(c).iii(x, pp)
    }
  }*/

  class PU[P] extends TypeParam {
    override type H = P
    override type T = EndParam
  }

  class Type2[N, NN] extends TypeParam {
    override type H = N
    override type T = PU[NN]
  }

}

object SlickUtil {

  import TupleTest3._

  trait TupleTestImplicit {
    implicit def ii[T](
        implicit b: BaseTypedType[T]
      , profile: slick.jdbc.JdbcProfile
    ): Application[TupleContext[(AppendTuple, TupleTestImplicit)], slick.lifted.Rep[T], Type2[slick.lifted.Rep[T], T]] = {
      import profile.api._
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], Rep[T], Type2[Rep[T], T]] {
        override def application(cotext: Context[TupleContext[(AppendTuple, TupleTestImplicit)]]): TupleEncoder[Rep[T], T] =
          new TupleEncoder[Rep[T], T] {
            override def rep(rep: Rep[T], r: List[slick.ast.Node]): List[slick.ast.Node]             = rep.?.toNode :: r
            override def dataNode(dataType: T, node: List[slick.ast.Node]): List[slick.ast.Node]     = LiteralNode(b.optionType, Option(dataType)) :: node
            override def bindDataNode(dataType: T, node: List[slick.ast.Node]): List[slick.ast.Node] = LiteralNode(b.optionType, Option(dataType), vol = true) :: node
          }
      }
    }

    implicit def ii2[T](
        implicit b: BaseTypedType[T]
      , profile: slick.jdbc.JdbcProfile
    ): Application[TupleContext[(AppendTuple, TupleTestImplicit)], slick.lifted.Rep[Option[T]], Type2[slick.lifted.Rep[Option[T]], Option[T]]] = {
      import profile.api._
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], Rep[Option[T]], Type2[Rep[Option[T]], Option[T]]] {
        override def application(cotext: Context[TupleContext[(AppendTuple, TupleTestImplicit)]]): TupleEncoder[Rep[Option[T]], Option[T]] =
          new TupleEncoder[Rep[Option[T]], Option[T]] {
            override def rep(rep: Rep[Option[T]], r: List[slick.ast.Node]): List[slick.ast.Node]             = rep.toNode :: r
            override def dataNode(dataType: Option[T], node: List[slick.ast.Node]): List[slick.ast.Node]     = LiteralNode(b.optionType, dataType) :: node
            override def bindDataNode(dataType: Option[T], node: List[slick.ast.Node]): List[slick.ast.Node] = LiteralNode(b.optionType, dataType, vol = true) :: node
          }
      }
    }
  }

  object TupleTestImplicit extends TupleTestImplicit

}
