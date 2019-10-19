package asuna

import scala.annotation.implicitNotFound
import scala.language.higherKinds

trait Application[K <: KindContext, T, I <: TypeHList] extends Any {
  def application(context: Context[K]): K#M[I]
}
@implicitNotFound(msg = "\nApplication not found.\nKindContext: ${K}\nMessage    : ${M}")
trait DebugApplication[K <: KindContext, T, I <: TypeHList, M <: Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeHList, M <: Message](
    implicit app: Application[K, T, I]
  ): DebugApplication[K, T, I, M] = {
    new DebugApplication[K, T, I, M] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}
@implicitNotFound(
  msg = "\nApplication not found.\nItemType    : ${T}\nKindContext : ${K}\nColumn Index: ${M}\n\nNumber: 3 :-<>-: Number: 2 Means index = 3 * 8 + 2 = 26(1 based)\n\n"
)
trait DebugItemApplication[K <: KindContext, T, I <: TypeHList, M <: Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugItemApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeHList, M <: Message](
    implicit app: Application[K, T, I]
  ): DebugItemApplication[K, T, I, M] = {
    new DebugItemApplication[K, T, I, M] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}
