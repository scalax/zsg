package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.core._
import net.scalax.asuna.shape.{ CaseClassShapleHelper, ShapeHelper }
import net.scalax.slick.async._
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrapAbs, SlickShapeValueWrapHelper, UmrHelper, UmrReaderQuery }
import slick.jdbc.H2Profile.api._
import shapeless._
import slick.jdbc.JdbcProfile
import tag._

import scala.annotation.implicitNotFound
import scala.reflect.ClassTag

case class InnerFriends2(id: Long, name: String, nick: String, age: Int, mark: List[InnerMark])
case class InnerMark(id: Long, name: String, mark: Int)
case class InnerFriendInput(mark: List[InnerMark])
case class InnerFriendOutput(id: Long)

case class Friends5(id: Long, name123: String, nick: String, age: Int)

class FriendTable3Model(friend: FriendTable2) extends UmrHelper with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(friend.id)
  val name123 = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  lazy val shape = CaseClassShapleHelper.shapeFromCase[FriendTable3Model, Friends5, SlickShapeValueWrapAbs]

  lazy val reader = toUmrReader(shape(this))

}

class FriendTable2Model(friend: FriendTable2) extends UmrHelper with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  val gen = Generic[InnerFriends2]

  lazy val shape = CaseClassShapleHelper.shapeFromDM[FriendTable2Model, InnerFriendInput, InnerFriends2, InnerFriendOutput, SlickShapeValueWrapAbs]

  lazy val reader = toUmrReader(shape(this))

}

class MarkTableModel(mark: MarkTable) extends UmrHelper with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(mark.id)
  val name = rep(mark.name)
  val markRep = rep(mark.mark)

  val gen = Generic[InnerMark]

  lazy val shape = (id :: name :: markRep :: HNil).map(gen.from)
  lazy val reader = toUmrReader(shape)

}

class SimpleFriend(friend: FriendTable2) extends UmrHelper with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  case class SFriendModel[A, B, C, D](id: A, name: B, nick: C, age: D)

  val repModel = SFriendModel(id = id, name = name, nick = nick, age = age)

  trait PropertyImplicit[ShapeData, ProData]

  trait PropertyFunAbs[Abs] {
    type Rep
    type Data
    type Out
    val rep: Rep
    val shape: DataShape[Rep, Data, Out, Abs]
    def fromList(dg: DataGroup): SplitData[Data] = {
      shape.takeData(dg, shape.wrapRep(rep))
    }
    def toAbs: DataRepGroup[Abs] = shape.toLawRep(shape.wrapRep(rep))
  }

  trait PropertyFun[R, D, O, Abs] extends PropertyFunAbs[Abs] {
    override type Rep = R
    override type Data = D
    override type Out = O
  }

  trait PropertyType[Pro]

  trait ModelGen[Model] {
    def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
  }

  val mg: ModelGen[Friends2] = new ModelGen[Friends2] {}

  def toExtModel(model: repModel.type) = {
    @implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
    trait idPl[ShapeData, ProData] extends PropertyImplicit[ShapeData, ProData]
    object idPl {
      implicit def plImplicit[S, T](implicit cv: S <:< T): idPl[S, T] = new idPl[S, T] {}
    }

    @implicitNotFound(msg = "属性 name 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
    trait namePl[ShapeData, ProData] extends PropertyImplicit[ShapeData, ProData]
    object namePl {
      implicit def plImplicit[S, T](implicit cv: S <:< T): namePl[S, T] = new namePl[S, T] {}
    }

    @implicitNotFound(msg = "属性 nick 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
    trait nickPl[ShapeData, ProData] extends PropertyImplicit[ShapeData, ProData]
    object nickPl {
      implicit def plImplicit[S, T](implicit cv: S <:< T): nickPl[S, T] = new nickPl[S, T] {}
    }

    @implicitNotFound(msg = "属性 age 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
    trait agePl[ShapeData, ProData] extends PropertyImplicit[ShapeData, ProData]
    object agePl {
      implicit def plImplicit[S, T](implicit cv: S <:< T): agePl[S, T] = new agePl[S, T] {}
    }

    trait ProGen[A, B, C, PL] {
      protected def innperPro: PropertyFun[A, B, C, SlickShapeValueWrapAbs]
      def unwrap(implicit pl: PL) = innperPro
    }

    def idGen[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: DataShape[A, B, C, SlickShapeValueWrapAbs]): ProGen[A, B, C, idPl[B, D]] = {
      new ProGen[A, B, C, idPl[B, D]] {
        override protected def innperPro: PropertyFun[A, B, C, SlickShapeValueWrapAbs] = {
          val rep1 = rep
          val shape1 = shape
          new PropertyFun[A, B, C, SlickShapeValueWrapAbs] {
            override val rep: A = rep1
            override val shape: DataShape[A, B, C, SlickShapeValueWrapAbs] = shape1
          }
        }
      }
    }

    def nameGen[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: DataShape[A, B, C, SlickShapeValueWrapAbs]): ProGen[A, B, C, namePl[B, D]] = {
      new ProGen[A, B, C, namePl[B, D]] {
        override protected def innperPro: PropertyFun[A, B, C, SlickShapeValueWrapAbs] = {
          val rep1 = rep
          val shape1 = shape
          new PropertyFun[A, B, C, SlickShapeValueWrapAbs] {
            override val rep: A = rep1
            override val shape: DataShape[A, B, C, SlickShapeValueWrapAbs] = shape1
          }
        }
      }
    }

    def nickGen[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: DataShape[A, B, C, SlickShapeValueWrapAbs]): ProGen[A, B, C, nickPl[B, D]] = {
      new ProGen[A, B, C, nickPl[B, D]] {
        override protected def innperPro: PropertyFun[A, B, C, SlickShapeValueWrapAbs] = {
          val rep1 = rep
          val shape1 = shape
          new PropertyFun[A, B, C, SlickShapeValueWrapAbs] {
            override val rep: A = rep1
            override val shape: DataShape[A, B, C, SlickShapeValueWrapAbs] = shape1
          }
        }
      }
    }

    def ageGen[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: DataShape[A, B, C, SlickShapeValueWrapAbs]): ProGen[A, B, C, agePl[B, D]] = {
      new ProGen[A, B, C, agePl[B, D]] {
        override protected def innperPro: PropertyFun[A, B, C, SlickShapeValueWrapAbs] = {
          val rep1 = rep
          val shape1 = shape
          new PropertyFun[A, B, C, SlickShapeValueWrapAbs] {
            override val rep: A = rep1
            override val shape: DataShape[A, B, C, SlickShapeValueWrapAbs] = shape1
          }
        }
      }
    }

    SFriendModel(
      id = idGen(repModel.id, mg(_.id)).unwrap,
      name = nameGen(repModel.name, mg(_.name)).unwrap,
      nick = nickGen(repModel.nick, mg(_.nick)).unwrap,
      age = ageGen(repModel.age, mg(_.age)).unwrap)
  }

  implicit object classShape extends DataShape[repModel.type, Friends3, repModel.type, SlickShapeValueWrapAbs] {
    override def wrapRep(base: repModel.type): repModel.type = base
    override def toLawRep(base: repModel.type): DataRepGroup[SlickShapeValueWrapAbs] = {
      val m = toExtModel(base)
      DataRepGroup(reps = List(m.id.toAbs, m.name.toAbs, m.nick.toAbs, m.age.toAbs).map(_.reps).flatten)
    }
    override def takeData(oldData: DataGroup, rep: repModel.type): SplitData[Friends3] = {
      val m = toExtModel(rep)
      val id = m.id.fromList(oldData)
      val name = m.name.fromList(id.left)
      val nick = m.nick.fromList(name.left)
      val age = m.age.fromList(nick.left)
      SplitData(Friends3(id1111 = id.current, name1111 = name.current, nick1111 = nick.current, age1111 = age.current), age.left)
    }
  }

  val sv = new DataShapeValue[Friends3, SlickShapeValueWrapAbs] {
    override type RepType = repModel.type
    override val rep: repModel.type = repModel
    override val shape = classShape
  }

  lazy val reader1111 = toUmrReader(sv)

}