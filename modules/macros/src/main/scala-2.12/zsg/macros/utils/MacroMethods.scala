package zsg.macros.utils

trait MacroMethods {
  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  def namedParam(name: TermName, value: Tree): Tree                         = AssignOrNamedArg(Ident(name), value)
  def vectorAppendAll[T](vector1: Vector[T], vector2: Vector[T]): Vector[T] = vector1 ++: vector2
  def vectorAppend[T](vector1: Vector[T], item: T): Vector[T]               = vector1 ++: Vector(item)
}
