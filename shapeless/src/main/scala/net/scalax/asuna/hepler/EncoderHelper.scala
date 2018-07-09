package net.scalax.asuna.core

import net.scalax.asuna.core.encoder.EncoderShape

import scala.language.higherKinds

trait EncoderAbsWrapper[RepOut, DataType]

trait EncoderAbsWrapperHelper[Abs, Wrapper[_, _] <: EncoderAbsWrapper[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, Abs]): Wrapper[Out, D]
}

trait EncoderHelper[Abs]