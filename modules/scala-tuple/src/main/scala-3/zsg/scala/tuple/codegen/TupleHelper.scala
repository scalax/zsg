package zsg.scala.tuple
import zsg._

object TupleHelper {

  given [T <: Context, Boot1, Target1 <: TypeHList, Boot2 <: Tuple, Target2 <: TypeHList](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2]
  ): Application[T, Boot1 *: Boot2, Tuple23TypeHList[Target1, Target2]] = context =>
    context.append(v1.application(context), v2.application(context))(Tuple23Plus.tupleXXLPlus)

}
