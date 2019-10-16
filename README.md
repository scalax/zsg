asuna
============================================
[![codecov](https://codecov.io/gh/scalax/asuna/branch/master/graph/badge.svg)](https://codecov.io/gh/scalax/asuna)
[![Build Status](https://travis-ci.org/scalax/asuna.svg?branch=master)](https://travis-ci.org/scalax/asuna)

An abstraction of data transformation  
一个数据转换的抽象

-----------------

This document will be written in English for a period of Chinese
 since my poor English. Welcome to create any typo pull request
 to asuna.  
因为我的英语水平比较不堪，这份文档会以一段英文一段中文的形式撰写。欢迎大家提交任何文档更改到
asuna。

### What's asuna?

Asuna is an abstraction of data transformation. Now it's a subset
of [shapeless](https://github.com/milessabin/shapeless "shapeless"). Which
only handle case class generic and sealed trait generic problems.  
Asuna 是一个数据转换的抽象。目前而言它是
[shapeless](https://github.com/milessabin/shapeless "shapeless")
的子集，只针对 case class 和 sealed trait 的 generic 问题作出一个解决方案。

### Why Type Projection?

Asuna is a project that deeply dependent on Type Projection.
Type Projection will be removed in Scala3, but why we still used Type Projection?  
Ausna 是一个深度依赖于 Type Projection 的项目. Type Projection
将会在 Scala3 被移除，但我们为什么仍然使用了 Type Projectoin？

- Compile very fast. A natural number structure based on iterations is
discarded, and a finite tuple structure is used instead. Then the
compilation speed is improved qualitatively. In my test case,
compiling two mutually dependent 100-field case classes into a
circe encoder takes only 2 seconds. Which circe use 20s.  
编译速度十分快。抛弃了基于逐个迭代的自然数结构，转而使用基于有限的元组结构，
编译速度得到了质的提升。在一个测试用例中，把两个互相有依赖的 100 字段 case class
编译成 circe encoder 仅需 2 秒，而 circe 则需要 20 秒。

- Code writing is simpler. Most of the code can be generated by
IntelliJ IDEA and then populated based on type hints.  
代码编写更简单。大部分代码可以通过 IntelliJ IDEA 生成，然后根据类型提示进行填充。

- No dependent type(Just a bit in when generic booting).  
没有 Dependent Type（只有一点 Dependent Type 存在于 Generic 引导的时候）。

- No similar type style is found in [dotty](https://github.com/lampepfl/dotty "dotty").  
在 dotty 中找不到类似的类型风格。

### Tutorial

#### 1.Type Projection Model

Look at such a Trait.  
观察这样一个 Trait。

```scala
trait TypeParameter {
  type H
  type T <: TypeParameter
}
```

We give it an end type.  
我们给它一个结束类型。

```scala
class NoData

class EndParameter extends TypeParameter {
  override type H = NoData
  override type T = EndParameter
}
```

In theory it can store unlimited types of parameters.  
理论上它可以存储无限个类型参数。

```scala
class TypeInstance1 extends TypeParameter {
  override type H = String
  override type T = EndParameter
}

class TypeInstance2 extends TypeParameter {
  override type H = Int
  override type T = TypeInstance1
}

val a1: Int = (throw new Exception()): TypeInstance2#H
val a2: String = (throw new Exception()): TypeInstance2#T#H
val a3: NoData = (throw new Exception()): TypeInstance2#T#T#H
val a4: NoData = (throw new Exception()): TypeInstance2#T#T#T#H
```

Of course we can use code generation to simplify some operations,
since this project is based on code generation.  
当然我们可以用代码生成来简化一些操作，毕竟这个仓库本身就是基于代码生成的。

```scala
//code generation start
class TypeParameter1[T1] extends TypeParameter {
  override type H = T1
  override type T = EndParameter
}
class TypeParameter2[T1, T2] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter1[T2]
}
//code generation ended

type TypeInstance3 = TypeParameter2[Int, String]

val a1: Int = (throw new Exception()): TypeInstance3#H
val a2: String = (throw new Exception()): TypeInstance3#T#H
val a3: NoData = (throw new Exception()): TypeInstance3#T#T#H
val a4: NoData = (throw new Exception()): TypeInstance3#T#T#T#H
```

Although the upper limit of code generation is TypeParameter8,
simply because the amount of other code generation's number
is 8 in asuna, you can still write a TypeParameter greater than 8 type
parameters according to your own preferences.  
虽然代码生成的上限是 TypeParameter8，但这仅仅是因为其他代码生成数量是
8，你依然可以根据自己的喜好自己构造类型参数超过 8 的 TypeParameter。

So we can introduce the first knowledge point of asuna.
Abstracting high order types of any number of arguments.  
于是我们可以介绍 asuna 的第一个知识点，对任意参数个数的高阶函数进行抽象：

```scala
trait KindContext {
  type M[P <: TypeParameter]
}
```

Let's try to explain the entire generic process with circe's
Json Object Encoder.  
我们尝试以 circe 的 Json Object Encoder 来说明一下整个 Generic 的过程。

First create a trait to make the type simpler.  
我们构造一个类来简化类型表达：

```scala
trait JsonEncoder[T, II] {
  def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
}
```

Then we can implement the KindContext.  
然后我们可以实例化 KindContext。

```scala
class KContext extends KindContext {
  override type M[P <: TypeParameter] = JsonEncoder[P#T#H, P#H]
}
```

Then we can get:  
于是有：

```scala
val a1: JsonEncoder[Int, String] = (throw new Exception()): KContext#M[TypeParameter2[Int, String]]
val a2: JsonEncoder[Long, String] = (throw new Exception()): KContext#M[TypeParameter2[Long, String]]
val a3: JsonEncoder[Item2[Int, Long], Item2[String, String]] = (throw new Exception()): KContext#M[TypeParameter2[Item2[Int, Long], Item2[String, String]]]
```

#### 2.Orthogonal between Type Projection and ItemX

Now we introduce a scene. We have a 4-field case class to be encode.  
现在我们引入一个场景，我们有一个 4 个字段的 case class 需要 encode。

```scala
case class Test04(i1: String, i2: Int, i3: Long, i4: Long)
```

我们要制作这样一个 Circe Encoder，需要准备一个

```scala
trait JsonEncoder[Item[String, Int, Long, Long], Item[String, String, String, String]] {
  def p(obj: Item[String, Int, Long, Long], name: Item[String, String, String, String], m: List[(String, Json)]): List[(String, Json)]
}
```

的实例，假设它被命名为为 en1。我们可以轻易根据现有信息得出`Encoder.AsObject[Test04]`。

```scala
val getter = { test04: Test04 => new Item4(test04.i1, test04.i2, test04.i3, test04.i4) }
val names = new Item4("i1", "i2", "i3", "i4")
implicit val encoderTest04: Encoder.AsObject[Test04] =
Encoder.AsObject.instance { o: Test04 =>
  JsonObject.fromIterable(en1.p(getter(o), names, List.empty))
}
```

getter 和 names 的获取方式我们会在后面解释，这里只讨论 en1 的获取方法。我们先拟定
可提供的资源。假定每个字段都能根据 circe 的 implicit
提供一个 JsonEncoder，则我们能获得

```scala
val a1: JsonEncoder[String, String] = new JsonEncoder[String, String] {
  override def p(obj: String, name: String, m: List[(String, Json)]): List[(String, Json)] = {
    (name, Json.fromString(obj)) :: m
  }
}
val a2: JsonEncoder[Int, String] = new JsonEncoder[Int, String] {
  override def p(obj: Int, name: String, m: List[(String, Json)]): List[(String, Json)] = {
    (name, Json.fromInt(obj)) :: m
  }
}
val a3: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
  override def p(obj: Long, name: String, m: List[(String, Json)]): List[(String, Json)] = {
    (name, Json.fromLong(obj)) :: m
  }
}
val a4: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
  override def p(obj: Long, name: String, m: List[(String, Json)]): List[(String, Json)] = {
    (name, Json.fromLong(obj)) :: m
  }
}
```

于是我们需要做一个转换，也就是 asuna 最重要的转换：

```scala
Item4[
  JsonEncoder[String, String],
  JsonEncoder[Int, String],
  JsonEncoder[Long, String],
  JsonEncoder[Long, String]
] =>
JsonEncoder[
  Item4[String, Int, Long, Long],
  Item4[String, String, String, String]
]
```

这是一个很对称的转换，也是 asuna 的美丽所在。

现在我们把这个转换转化成抽象，使得这个抽象能应对任何类似的情况。

```scala
class ItemTypeParameter3[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter] extends TypeParameter {
  override type H = Item3[E1#H, E2#H, E3#H]
  override type T = ItemTypeParameter3[E1#T, E2#T, E3#T]
}
```

在 asuna 内部，提供了这样一些帮助你完成转置操作的函数。于是便有了以下叠加过程

Property to be superposition  
被叠加元素

|Input Type|Final Result Type|
:-:|:-:
|KContext#M[TypeParameter2[String, String]]|JsonEncoder[String, String]|
|KContext#M[TypeParameter2[Int, String]]|JsonEncoder[Int, String]|
|KContext#M[TypeParameter2[Long, String]]|JsonEncoder[Long, String]|
|KContext#M[TypeParameter2[Long, String]]|JsonEncoder[Long, String]|

Line by line merger  
逐行合并

|Output Type|Final Result Type|
:-:|:-:
|KContext#M[ItemTypeParameter1[TypeParameter2[String, String]]]|JsonEncoder[Item1[String], Item1[String]]|
|KContext#M[ItemTypeParameter2[TypeParameter2[String, String], TypeParameter2[Int, String]]]|JsonEncoder[Item2[Int, String], Item2[String, String]]|
|KContext#M[ItemTypeParameter3[TypeParameter2[String, String], TypeParameter2[Int, String], TypeParameter2[Long, String]]]|JsonEncoder[Item3[String, Int, Long], Item3[String, String, String]]|
|KContext#M[ItemTypeParameter4[TypeParameter2[String, String], TypeParameter2[Int, String], TypeParameter2[Long, String], TypeParameter2[Long, String]]]|JsonEncoder[Item4[String, Int, Long, Long], Item4[String, String, String, String]]|

所以只要我们提供一个

```scala
def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: KContext#M[X], y: KContext#M[Y]): KContext#M[Z]
```

即可完成上面所有操作。

但这个函数式无法实现的，我们还需要一个 Plus 来协助这个填充的过程。Plus 的抽象如下：

```scala
trait Plus[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter] {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): X#H
  def takeTail(t: Z#H): Y#H
  def sub: Plus[X#T, Y#T, Z#T]
}
```

所以完整版本的 append 是

```scala
def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: KContext#M[X], y: KContext#M[Y], p: Plus[X, Y, Z]): KContext#M[Z]
```

而 Item0 - Item7 的 Plus 已经在 asuna 的内部准备好了，所以叠加过程得以顺利完成。完整的 Context 实现如下：

```scala
object ii extends Context[KContext] {
  override def isReverse: Boolean = false

  override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](
    x: JsonEncoder[X#T#H, X#H],
    y: JsonEncoder[Y#T#H, Y#H],
    plus: Plus[X, Y, Z]
  ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
    override def p(obj: Z#T#H, name: Z#H, m: List[(String, Json)]): List[(String, Json)] =
      x.p(plus.sub.takeHead(obj), plus.takeHead(name), y.p(plus.sub.takeTail(obj), plus.takeTail(name), m))
  }

  override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
    override def p(name: Item0, obj: Item0, m: List[(String, Json)]): List[(String, Json)] = m
  }
}
```

可以留意到 Context 的实现只是对叠加过程的体现，并没有太多的技巧，类型建模一旦被确定，就只是简单的填充工作。
完整地例子在[这里](sfsfksfjslgjlegj)