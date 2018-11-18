package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.macroImpl.UnusedDataMacro

import scala.language.implicitConversions

trait UnusedData[Input, Model, Unused] {
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

  def simple[D](data: D): UnusedData[EmptyLazyModel, D, EmptyLazyModel] = new UnusedData[EmptyLazyModel, D, EmptyLazyModel] {
    override val input  = EmptyLazyModel.value
    override val model  = data
    override def unused = EmptyLazyModel.value
  }

}
