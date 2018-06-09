package net.scalax.asuna.slick.umr

import slick.lifted.{ FlatShapeLevel, Shape }
import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core._

import shapeless._
import tag._

trait SlickShapeValueWrapAbs {
  self =>

  type Data
  type Rep
  type TargetRep
  type OutPut
  type Level <: FlatShapeLevel
  val rep: Rep
  val shape: Shape[Level, Rep, Data, TargetRep]
  val dataToList: Data => OutPut
  val dataFromList: OutPut => Option[Data]

}

trait SlickShapeValueWrap[F] extends SlickShapeValueWrapAbs with AtomicColumn[F, SlickShapeValueWrapAbs] {
  self =>

  override type OutPut = F

  override def common: SlickShapeValueWrapAbs = self

  def map[H](
    t: F => H,
    r: H => Option[F] = (s: H) => Option.empty): SlickShapeValueWrap[H] = {
    new SlickShapeValueWrap[H] {
      override type Data = self.Data
      override type Rep = self.Rep
      override type TargetRep = self.TargetRep
      override type Level = self.Level
      override val rep = self.rep
      override val shape = self.shape
      override val dataToList = { (s: Data) =>
        t(self.dataToList(s))
      }
      override val dataFromList = { (s: H) =>
        r(s).flatMap(t => self.dataFromList(t))
      }
    }
  }
}

trait SlickShapeValueWrapHelper {

  val umrUnwrap: DataShapeValueInitWrap[SlickShapeValueWrapAbs] = DataShapeValue.toShapeValue[SlickShapeValueWrapAbs]

  def jsonKey[A, B, C](baseRep: A, key: String)(implicit shape: Shape[_ <: FlatShapeLevel, A, B, C], encoder: Encoder[B]): SlickShapeValueWrap[(String, Json)] @@ OutputTag = {
    val w = rep(baseRep).map[(String, Json)] { (s: B) =>
      (key, s.asJson(encoder))
    }
    AtomicColumn.tagOutput(w)
  }

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: R)(implicit shape: Shape[L, R, D, T]): SlickShapeValueWrap[D] @@ OutputTag = {
    val shape1 = shape
    val w = new SlickShapeValueWrap[D] {
      override type TargetRep = T
      override type Data = D
      override type Rep = R
      override type Level = L
      override val shape = shape1
      override val dataToList = { (data: D) =>
        data
      }
      override val dataFromList = { (data: D) =>
        Option(data)
      }
      override val rep = baseRep
    }
    AtomicColumn.tagOutput(w)
  }

}