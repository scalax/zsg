package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape

import scala.language.higherKinds

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[Abs, Wrapper[_, _] <: EncoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, Abs]): Wrapper[Out, D]
}

trait EncoderHelper[Abs]