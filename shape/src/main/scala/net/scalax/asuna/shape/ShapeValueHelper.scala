package net.scalax.asuna.shape

import net.scalax.asuna.core._

import scala.language.implicitConversions

trait ShapeValueHelper {

  implicit def liftToShapeValueExtendsionMethod[A, B, C, D](rep: A)(implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
    val rep1 = rep
    val shape1 = shape
    new DataShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

  implicit class shapeValueExt[A](rep: A) {
    def shaped[B, C, D](implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
      val rep1 = rep
      val shape1 = shape
      new DataShapeValue[B, D] {
        override type RepType = C
        override val rep = shape1.wrapRep(rep1)
        override val shape = shape1.packed
      }
    }
  }

}