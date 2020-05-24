package zsg.debug
import scala.language.implicitConversions
object DebugInstance {
    implicit def fromTuple[T, C](i: T)(using t: ZsgTupleToDebugCaseClass[T, C]): C = t.tupleToCaseClass(i)
}
