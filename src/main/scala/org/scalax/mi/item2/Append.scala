package org.scalax.asuna.mapper.item

import scala.annotation.implicitNotFound
import scala.language.higherKinds

trait TypeParam {
  type H
  type T <: TypeParam
}

class EndParam extends TypeParam {
  override type H = EndParam
  override type T = EndParam
}

trait KindContext {
  type M[P <: TypeParam]
}

trait Plus[X <: TypeParam, Y <: TypeParam, Z <: TypeParam] {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): Y#H
  def takeTail(t: Z#H): X#H
  def sub: Plus[X#T, Y#T, Z#T]
}

trait Context[K <: KindContext] {
  self =>

  def isReverse: Boolean
  def useHList: Boolean
  def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[org.scalax.asuna.ii.item.EatXyyType0]
  //def lift[T, I <: TypeParam](i: ItemTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(context = self)

  def reverse: Context[K] = new Context[K] {
    override def isReverse                                                                                              = !self.isReverse
    override def useHList                                                                                               = self.useHList
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[org.scalax.asuna.ii.item.EatXyyType0]                                                       = self.start
  }

  def touseHList: Context[K] = new Context[K] {
    override def isReverse                                                                                              = self.isReverse
    override def useHList                                                                                               = true
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[org.scalax.asuna.ii.item.EatXyyType0]                                                       = self.start
  }

  def notTouseHList: Context[K] = new Context[K] {
    override def isReverse                                                                                              = self.isReverse
    override def useHList                                                                                               = false
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[org.scalax.asuna.ii.item.EatXyyType0]                                                       = self.start
  }

}

trait Application[K <: KindContext, T, I <: TypeParam] {
  def application(context: Context[K]): K#M[I]
}
@implicitNotFound(msg = "\nApplication not found.\nKindContext: ${K}\nMessage    :${Message}")
trait DebugApplication[K <: KindContext, T, I <: TypeParam, Message <: org.scalax.asuna.mapper.item.Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeParam, Message <: org.scalax.asuna.mapper.item.Message](
      implicit app: Application[K, T, I]
  ): DebugApplication[K, T, I, Message] = {
    new DebugApplication[K, T, I, Message] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}
@implicitNotFound(msg = "\nApplication not found.\nItemType: ${T}\nKindContext: ${K}\nMessage    :${Message}")
trait DebugItemApplication[K <: KindContext, T, I <: TypeParam, Message <: org.scalax.asuna.mapper.item.Message] extends Application[K, T, I] {
  override def application(context: Context[K]): K#M[I]
}

object DebugItemApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeParam, Message <: org.scalax.asuna.mapper.item.Message](
      implicit app: Application[K, T, I]
  ): DebugItemApplication[K, T, I, Message] = {
    new DebugItemApplication[K, T, I, Message] {
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

}

class AppendTag[T]
