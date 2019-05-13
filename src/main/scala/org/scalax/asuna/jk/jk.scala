package jk

import scala.language.higherKinds

trait 白1 {

  type SelfType <: 白1
  def selfType: SelfType
  type I1 <: 白1
  def i1: 白1

  type E[TT] = Append[元素[TT]]
  def e[TT](i: TT): Append[元素[TT]] = append(new 元素(i))

  type Append[TT <: 白1] <: 白11
  def append[TT <: 白1](i: TT): Append[TT]

}

class 元素[T](val i: T) extends 白1 {
  self =>
  override type SelfType = 元素[T]
  override def selfType: 元素[T] = self
  override type I1 = 元素[T]
  override val i1 = self

  override type Append[TT <: 白1] = 黑11实现[TT, 元素[T]]
  override def append[TT <: 白1](i: TT): 黑11实现[TT, 元素[T]] = new 黑11实现[TT, 元素[T]](i, self)

  override def toString: String = s"元素: ${i}"
}

trait 白11 extends 白1 {

  override type SelfType <: 白11
  override def selfType: SelfType
  override type I1 <: 白1
  override def i1: I1

  type I2 <: 白1
  def i2: I2

  def ii = s"""i1:
${i1.toString.split("\n").filterNot(_.isEmpty).map(s => s"  ${s}").mkString("\n")}
i2:
${i2.toString.split("\n").filterNot(_.isEmpty).map(s => s"  ${s}").mkString("\n")}"""

  override def toString: String = {
    s"""白11:
       |${ii}""".stripMargin
  }

}

class 白11实现[II1 <: 白1, II2 <: 白1](override val i1: II1, override val i2: II2) extends 白11 {
  self =>
  override type SelfType = 白11实现[II1, II2]
  override def selfType: 白11实现[II1, II2] = self
  override type I1 = II1
  override type I2 = II2

  override type Append[TT <: 白1] = 白12实现[TT, SelfType]
  override def append[TT <: 白1](i: TT): 白12实现[TT, SelfType] = new 白12实现[TT, SelfType](i, selfType)
}

trait 白12 extends 白11 {

  override type SelfType <: 白12
  override type I1 <: 白1
  override def i1: I1

  override type I2 <: 白11
  override def i2: I2

  override def toString: String = {
    s"""白12:
       |${ii}""".stripMargin
  }

}

class 白12实现[II1 <: 白1, II2 <: 白11](override val i1: II1, override val i2: II2) extends 白12 {
  self =>
  override type SelfType = 白12实现[II1, II2]
  override def selfType = self
  override type I1 = II1
  override type I2 = II2

  override type Append[TT <: 白1] = 黑22实现[I1#Append[TT], SelfType]
  override def append[TT <: 白1](i: TT): 黑22实现[I1#Append[TT], SelfType] = new 黑22实现[I1#Append[TT], SelfType](self.i1.append(i), selfType)
}

trait 白22 extends 白12 {

  override type SelfType <: 白22
  override type I1 <: 白11
  override def i1: I1

  override type I2 <: 白11
  override def i2: I2

  override def toString: String = {
    s"""白22:
       |${ii}""".stripMargin
  }

}

class 白22实现[II1 <: 白1, II2 <: 白11](override val i1: II1, override val i2: II2) extends 白12 {
  self =>
  override type SelfType = 白22实现[II1, II2]
  override def selfType = self
  override type I1 = II1
  override type I2 = II2

  override type Append[TT <: 白1] = 白22实现[I1#Append[TT], SelfType]
  override def append[TT <: 白1](i: TT): 白22实现[I1#Append[TT], SelfType] = new 白22实现[I1#Append[TT], SelfType](self.i1.append(i), selfType)
}

trait 黑22 extends 白12 {
  self =>

  override type I1 <: 白11
  override def i1: I1

  override type I2 <: 白11
  override def i2: I2

  override type Append[TT <: 白1] = 白11实现[TT, 白11实现[白11实现[I1#I1, I1#I2], 白11实现[I2#I1, I2#I2]]]
  override def append[TT <: 白1](i: TT): 白11实现[TT, 白11实现[白11实现[I1#I1, I1#I2], 白11实现[I2#I1, I2#I2]]] =
    new 白11实现[TT, 白11实现[白11实现[I1#I1, I1#I2], 白11实现[I2#I1, I2#I2]]](
        i
      , new 白11实现[白11实现[I1#I1, I1#I2], 白11实现[I2#I1, I2#I2]](new 白11实现[I1#I1, I1#I2](self.i1.i1, self.i1.i2), new 白11实现[I2#I1, I2#I2](self.i2.i1, self.i2.i2))
    )

  override def toString: String = {
    s"""黑22:
       |${ii}""".stripMargin
  }

}

class 黑22实现[II1 <: 白11, II2 <: 白11](override val i1: II1, override val i2: II2) extends 黑22 {
  self =>
  override type SelfType = 黑22实现[II1, II2]
  override def selfType = self
  override type I1 = II1
  override type I2 = II2
}

trait 黑11 extends 白11 {
  self =>

  override type SelfType <: 黑11
  override type I1 <: 白1
  override def i1: I1

  override type I2 <: 白1
  override def i2: I2

  override type Append[TT <: 白1] = 黑12实现[TT, 白11实现[I1, I2]]
  override def append[TT <: 白1](i: TT): 黑12实现[TT, 白11实现[I1, I2]] = new 黑12实现[TT, 白11实现[I1, I2]](i, new 白11实现[I1, I2](self.i1, self.i2))

  override def toString: String = {
    s"""黑11:
       |${ii}""".stripMargin
  }

}

class 黑11实现[II1 <: 白1, II2 <: 白1](override val i1: II1, override val i2: II2) extends 黑11 {
  self =>
  override type SelfType = 黑11实现[II1, II2]
  override def selfType = self
  override type I1 = II1
  override type I2 = II2
}

trait 黑12 extends 白12 {
  self =>

  override type SelfType <: 黑12
  override type I1 <: 白1
  override def i1: I1

  override type I2 <: 白11
  override def i2: I2

  override type Append[TT <: 白1] = 黑22实现[I1#Append[TT], 白11实现[I2#I1, I2#I2]]
  override def append[TT <: 白1](i: TT): 黑22实现[I1#Append[TT], 白11实现[I2#I1, I2#I2]] =
    new 黑22实现[I1#Append[TT], 白11实现[I2#I1, I2#I2]](self.i1.append(i), new 白11实现[I2#I1, I2#I2](self.i2.i1, self.i2.i2))

  override def toString: String = {
    s"""黑12:
       |${ii}""".stripMargin
  }

}

class 黑12实现[II1 <: 白1, II2 <: 白11](override val i1: II1, override val i2: II2) extends 黑12 {
  self =>
  override type SelfType = 黑12实现[II1, II2]
  override def selfType = self
  override type I1 = II1
  override type I2 = II2
}
