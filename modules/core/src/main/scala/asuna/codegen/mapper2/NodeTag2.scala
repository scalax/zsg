package asuna
import scala.language.higherKinds
import impl._
final class NodeTag2[T1 <: TupleTag, T2 <: TupleTag] extends TupleTag
final object NodeTag2                                extends support.NodeTag2ApplicationCompanion
