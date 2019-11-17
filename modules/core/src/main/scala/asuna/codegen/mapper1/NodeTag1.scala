package asuna
import scala.language.higherKinds
import impl._
final class NodeTag1[T1 <: TupleTag] extends TupleTag
final object NodeTag1                extends support.NodeTag1ApplicationCompanion
