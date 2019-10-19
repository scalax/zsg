package asuna

import scala.annotation.implicitNotFound
import scala.language.higherKinds

trait TypeHList {
  type H
  type T <: TypeHList
}

class AnyTypeHList extends TypeHList {
  override type H = Any
  override type T = AnyTypeHList
}

class NoData

object NoData {
  val value: NoData = new NoData
}

class TypeHNil extends TypeHList {
  override type H = NoData
  override type T = TypeHNil
}

trait KindContext {
  type M[P <: TypeHList]
}

trait Plus[X <: TypeHList, Y <: TypeHList, Z <: TypeHList] extends Any {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): X#H
  def takeTail(t: Z#H): Y#H
  def sub: Plus[X#T, Y#T, Z#T]
}

trait Context[K <: KindContext] extends Any {
  self =>

  def isReverse: Boolean
  def useHList    = false
  def useVariable = false
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[TupleTypeHList0]
  //def lift[T, I <: TypeParameter](i: AppendTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(self)

  def reverse: Context[K] = new Context[K] {
    override def isReverse                                                                                              = !self.isReverse
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[TupleTypeHList0]                                                                            = self.start
  }

}

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

class AppendTag[T] {
  def tag: T = throw new Exception("debuging...")
}

object AppendTag {
  def apply[T] = new AppendTag[T]
}
