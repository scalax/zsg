package net.scalax.asuna.core

case class DataRepGroup[T](reps: List[T], subs: List[DataRepGroup[T]])