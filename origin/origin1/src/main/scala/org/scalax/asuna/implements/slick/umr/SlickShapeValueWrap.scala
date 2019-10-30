package org.scalax.asuna.slick.umr

import slick.lifted.{FlatShapeLevel, Shape, ShapedValue}

trait SlickShapeValueWrap[F] {
  self =>

  type Data
  type Rep
  type TargetRep
  type OutPut = F
  type Level <: FlatShapeLevel
  val rep: Rep
  val shape: Shape[Level, Rep, Data, TargetRep]
  val dataToList: Data => OutPut

  def map[H](t: F => H): SlickShapeValueWrap[H] = {
    new SlickShapeValueWrap[H] {
      override type Data      = self.Data
      override type Rep       = self.Rep
      override type TargetRep = self.TargetRep
      override type Level     = self.Level
      override val rep        = self.rep
      override val shape      = self.shape
      override val dataToList = (s: Data) => t(self.dataToList(s))
    }
  }

  def shapeValue: ShapeFunc[F] = {
    new ShapeFunc[F] {
      override type RepType  = TargetRep
      override type DataType = self.Data
      override protected val baseSV: ShapedValue[TargetRep, self.Data] = ShapedValue(shape.pack(rep), shape.packedShape)
      override val output                                              = self.dataToList
    }
  }

}

trait ShapeFunc[F] {
  self =>

  type RepType
  type DataType
  def shapedValue: ShapedValue[Any, DataType] = baseSV.asInstanceOf[ShapedValue[Any, DataType]]
  protected def baseSV: ShapedValue[RepType, DataType]
  val output: DataType => F

  def map[T](t: F => T): ShapeFunc[T] = {
    new ShapeFunc[T] {
      override type RepType  = self.RepType
      override type DataType = self.DataType
      override protected def baseSV = self.baseSV
      override val output = { (data: DataType) =>
        t(self.output(data))
      }
    }
  }

}
