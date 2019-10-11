package org.scalax.asuna.mapper

import scala.annotation.implicitNotFound
import scala.language.higherKinds

trait TypeParameter {
  type H
  type T <: TypeParameter
}

class AnyTypeParameter extends TypeParameter {
  override type H = Any
  override type T = AnyTypeParameter
}

class NoData

object NoData {
  val value: NoData = new NoData
}

class EndParameter extends TypeParameter {
  override type H = NoData
  override type T = EndParameter
}

trait KindContext {
  type M[P <: TypeParameter]
}

trait Plus[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter] {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): X#H
  def takeTail(t: Z#H): Y#H
  def sub: Plus[X#T, Y#T, Z#T]
}

trait Context[K <: KindContext] {
  self =>

  def isReverse: Boolean
  def useHList: Boolean
  def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[ItemTypeParameter0]
  def lift[T, I <: TypeParameter](i: AppendTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(self)

  def reverse: Context[K] = new Context[K] {
    override def isReverse                                                                                                          = !self.isReverse
    override def useHList                                                                                                           = self.useHList
    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[ItemTypeParameter0]                                                                                     = self.start
  }

  def touseHList: Context[K] = new Context[K] {
    override def isReverse                                                                                                          = self.isReverse
    override def useHList                                                                                                           = true
    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[ItemTypeParameter0]                                                                                     = self.start
  }

  def notTouseHList: Context[K] = new Context[K] {
    override def isReverse                                                                                                          = self.isReverse
    override def useHList                                                                                                           = false
    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[ItemTypeParameter0]                                                                                     = self.start
  }

}

trait Application[K <: KindContext, T, I <: TypeParameter] {
  def application(context: Context[K]): K#M[I]
}
@implicitNotFound(msg = "\nApplication not found.\nKindContext: ${K}\nMessage    : ${Message}")
trait DebugApplication[K <: KindContext, T, I <: TypeParameter, Message <: org.scalax.asuna.mapper.Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeParameter, Message <: org.scalax.asuna.mapper.Message](
    implicit app: Application[K, T, I]
  ): DebugApplication[K, T, I, Message] = {
    new DebugApplication[K, T, I, Message] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}
@implicitNotFound(
  msg =
    "\nApplication not found.\nItemType    : ${T}\nKindContext : ${K}\nColumn Index: ${Message}\n\nNumber: 3 :-<>-: Number: 2 Means index = 3 * 8 + 2 = 26(1 based)\n\n"
)
trait DebugItemApplication[K <: KindContext, T, I <: TypeParameter, Message <: org.scalax.asuna.mapper.Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugItemApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeParameter, Message <: org.scalax.asuna.mapper.Message](
    implicit app: Application[K, T, I]
  ): DebugItemApplication[K, T, I, Message] = {
    new DebugItemApplication[K, T, I, Message] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}

class AppendTag[T] {
  def tag: T = throw new Exception("debuging...")
}
