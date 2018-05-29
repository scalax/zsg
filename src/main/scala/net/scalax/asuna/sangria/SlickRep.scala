package net.scalax.asuna.sangria

import net.scalax.asuna.core._
import net.scalax.asuna.slick.umr.{ SlickShapeValueListWrap, SlickShapeValueWrap }
import slick.lifted.{ FlatShapeLevel, Shape }

import scala.concurrent.{ ExecutionContext, Future }
import scala.reflect.ClassTag
import scala.language.higherKinds

sealed abstract trait SlickRepAbs[Rep, DataType] {
  def slickCv(rep: Rep): SlickShapeValueWrap[DataType]
}

trait SlickRepWrap[Rep, DataType] extends SlickRepAbs[Rep, DataType] {
  self =>

  def map[R](cv: DataType => R): SlickRepWrap[Rep, R] = {
    new SlickRepWrap[Rep, R] {
      override def slickCv(rep: Rep): SlickShapeValueWrap[R] = {
        self.slickCv(rep).map(cv)
      }
    }
  }

}

trait SlickSangriaRepWrap[Rep, DataType] extends SlickRepAbs[Rep, (String, DataType)] {
  val sangraiKey: String
  val objectKey: String
}

trait SlickValueGen[Rep] {
  def getData[DataType](r: SlickSangriaRepWrap[Rep, DataType]): DataType
}

trait SlickSangria[E, Data] {

  val sangriaUnwrap: DataShapeValueInitWrap[SlickRepWrap[E, Any]] = DataShapeValue.toShapeValue[SlickRepWrap[E, Any]]

  def rep[R, D, T](baseRep: E => R)(implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): SlickRepWrap[E, D] = {
    new SlickRepWrap[E, D] {
      override def slickCv(rep: E): SlickShapeValueWrap[D] = {
        val rep1 = rep
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val dataFromList = { (data: D) =>
            Option(data)
          }
          override val rep = baseRep(rep1)
        }
      }
    }
  }

  def repWithKey[R, D, T](baseRep: E => R, key: String)(implicit shape: Shape[_ <: FlatShapeLevel, R, D, T], completedId: CompletedId[String]): SlickSangriaRepWrap[E, D] = {
    new SlickSangriaRepWrap[E, D] {
      override val sangraiKey = key
      override val objectKey = completedId.id
      override def slickCv(rep: E): SlickShapeValueWrap[(String, D)] = {
        val rep1 = rep
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val dataFromList = { (data: D) =>
            Option(data)
          }
          override val rep = baseRep(rep1)
        }.map(s => (completedId.id, s))
      }
    }
  }

  def seqRep[E](w: SlickSangriaRepWrap[E, _]*): List[String] => SlickRepWrap[E, SlickValueGen[E]] = { (keys: List[String]) =>
    new SlickRepWrap[E, SlickValueGen[E]] {
      override def slickCv(rep: E): SlickShapeValueWrap[SlickValueGen[E]] = {
        val listCv: List[(String, Any)] => SlickValueGen[E] = { s =>
          val map = s.toMap
          new SlickValueGen[E] {
            override def getData[DataType](r: SlickSangriaRepWrap[E, DataType]): DataType = {
              map.getOrElse(r.objectKey, throw new Exception("没有该列匹配的项")).asInstanceOf[DataType]
            }
          }
        }
        val shapeValue = SlickShapeValueListWrap.apply(convert = listCv, reConvert = { (t: SlickValueGen[E]) => Option.empty[List[(String, Any)]] }, ct = implicitly[ClassTag[SlickValueGen[E]]], w.filter(item => keys.contains(item.sangraiKey)).map(s => s.slickCv(rep).map(s => s: (String, Any))): _*)

        new SlickShapeValueWrap[SlickValueGen[E]] {
          override type TargetRep = Any
          override type Data = SlickValueGen[E]
          override type Rep = Any
          override val shape = shapeValue.shape.asInstanceOf[Shape[FlatShapeLevel, Any, SlickValueGen[E], Any]]
          override val dataToList = { (data: SlickValueGen[E]) =>
            data
          }
          override val dataFromList = { (data: SlickValueGen[E]) =>
            Option(data)
          }
          override val rep = shapeValue.value
        }
      }
    }
  }

  implicit def slickRepWrapShapeImplicit[T]: DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepWrap[E, Any]] = {
    new DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepWrap[E, Any]] {
      self =>
      override def wrapRep(base: SlickRepWrap[E, T]): SlickRepWrap[E, T] = base

      override def toLawRep(base: SlickRepWrap[E, T]): DataRepGroup[SlickRepWrap[E, Any]] = {
        DataRepGroup(reps = List(base.map(s => s: Any)), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: SlickRepWrap[E, T]): Either[NotConvert, SplitData[T]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[T], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: T, rep: SlickRepWrap[E, T]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

  def sangriaSv: List[String] => DataShapeValue[Data, SlickRepWrap[E, Any]]

  import slick.jdbc.H2Profile.api._
  def bindQuery[U](query: Query[E, U, Seq], db: Database, keys: List[String])(implicit ec: ExecutionContext): Future[Seq[Data]] = {
    val sv = sangriaSv(keys)
    val bindQ = query.map { r =>
      val reps = sv.shape.toLawRep(sv.rep).reps.map(t => t.slickCv(r))
      SlickShapeValueListWrap.apply(convert = { (t: List[Any]) => t }, reConvert = { (t: List[Any]) => Option(t) }, ct = implicitly[ClassTag[List[Any]]], reps: _*)
    }
    val action = bindQ.result
    println("33" * 10)
    println(action.statements)
    val result = db.run(action)
    result.map { seq =>
      seq.map { each =>
        sv.shape.takeData(DataGroup(items = each, subs = List.empty), sv.rep).right.get.current
      }
    }
  }

  def bindOneLineQuery[U](query: Query[E, U, Seq], db: Database, keys: List[String])(implicit ec: ExecutionContext): Future[Data] = {
    val sv = sangriaSv(keys)
    val bindQ = query.map { r =>
      val reps = sv.shape.toLawRep(sv.rep).reps.map(t => t.slickCv(r))
      SlickShapeValueListWrap.apply(convert = { (t: List[Any]) => t }, reConvert = { (t: List[Any]) => Option(t) }, ct = implicitly[ClassTag[List[Any]]], reps: _*)
    }
    val action = bindQ.result.head
    println("33" * 10)
    println(action.statements)
    val result = db.run(action)
    result.map { seq =>
      sv.shape.takeData(DataGroup(items = seq, subs = List.empty), sv.rep).right.get.current
    }
  }

  def bindOptionLineQuery[U](query: Query[E, U, Seq], db: Database, keys: List[String])(implicit ec: ExecutionContext): Future[Option[Data]] = {
    val sv = sangriaSv(keys)
    val bindQ = query.map { r =>
      val reps = sv.shape.toLawRep(sv.rep).reps.map(t => t.slickCv(r))
      SlickShapeValueListWrap.apply(convert = { (t: List[Any]) => t }, reConvert = { (t: List[Any]) => Option(t) }, ct = implicitly[ClassTag[List[Any]]], reps: _*)
    }
    val action = bindQ.result.headOption
    println("33" * 10)
    println(action.statements)
    val result = db.run(action)
    result.map { seq =>
      seq.map { each =>
        sv.shape.takeData(DataGroup(items = each, subs = List.empty), sv.rep).right.get.current
      }
    }
  }

}