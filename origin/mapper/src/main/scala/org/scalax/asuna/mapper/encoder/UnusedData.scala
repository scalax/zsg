package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.mapper.decoder.EmptyLazyModel
import org.scalax.asuna.mapper.encoder.macroImpl.UnusedDataMacro

import scala.language.implicitConversions

trait UnusedData[Input, Model, Unused] extends Any {
  def input: Input
  def model: Model
  def unused: Unused
}

object UnusedData {

  implicit def tupe2DataToUnusedData[Input, Model, Unused](
      tupleData: (Input, Model)
  )(implicit cv: UnusedDataMacro.UnusedDataTran[Model, Unused]): UnusedData[Input, Model, Unused] = {
    new UnusedData[Input, Model, Unused] {
      override val input  = tupleData._1
      override val model  = tupleData._2
      override def unused = cv(tupleData._2)
    }
  }

  class SimpleUnusedData[Model](override val model: Model) extends AnyVal with UnusedData[EmptyLazyModel, Model, EmptyLazyModel] {
    def input: EmptyLazyModel  = EmptyLazyModel.value
    def unused: EmptyLazyModel = EmptyLazyModel.value
  }

  def simple[D](data: D): UnusedData[EmptyLazyModel, D, EmptyLazyModel] = new SimpleUnusedData[D](data)

}
