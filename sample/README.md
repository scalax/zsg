asuna
============================================
第一个 Generic  [例程](https://github.com/scalax/asuna/blob/master/sample/src/main/scala/MacroTest1.scala)  
现在我们用 asuna 设计一个 Generic 的过程, 这和 shapeless 有不少的差别

1. 添加 [asuna.jar](https://github.com/djx314/asuna/blob/master/sample/lib/asuna_2.12-0.0.2-SNAP20181211.1.jar)
到你的 classpath.
1. 添加 circe 到你的 classpath, 这次我们设计一个 JsonObject 的 Generic.

我们要先设计中间数据类型, 一般而言习惯屏蔽该列是单一列或者复数列, 只关注列对 Generic 对象整体的影响.
```scala
trait JsonEncoder1[T] {
    def p(obj: T, m: List[(String, Json)]): List[(String, Json)]
    def toJsonObject: ObjectEncoder[T] = ObjectEncoder.instance(s => JsonObject.fromIterable(p(s, List.empty)))
}
```
但我们还需要列名 name.
```scala
trait JsonEncoder2[T, II] {
    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
    def toJsonObject(name: II): ObjectEncoder[T] =
        ObjectEncoder.instance(s => JsonObject.fromIterable(p(s, name, List.empty)))
}
```
注意这里的 II 不能为 String, 因为这是列的集合.

我们先看看原始的 Generic 过程.

此时, 我们已经可以建立一个 KindContext
```scala
class KContext extends KindContext {
    type M[I <: TypeParam] = JsonEncoder2[I#H, I#T#H]
}
```
目标对象会在 I#H 和 I#T#H 两个地方开始成长.
当然我们还需要一个 Context 来声明叠加规则, 但使用 IDEA 的自动填充功能已经可以帮你完成大部分操作.
```scala
val ii = new Context[KContext] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = true
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonEncoder2[X#H, X#T#H],
                                                                    y: JsonEncoder2[Y#H, Y#T#H],
                                                                    pp: Plus[X, Y, Z]): JsonEncoder2[Z#H, Z#T#H] = new JsonEncoder2[Z#H, Z#T#H] {
    override def p(obj: Z#H, name: Z#T#H, m: List[(String, Json)]): List[(String, Json)] = {
            x.p(pp.takeTail(obj), pp.sub.takeTail(name), y.p(pp.takeHead(obj), pp.sub.takeHead(name), m))
        }
    }

    override def start: JsonEncoder2[XyyItem0, XyyItem0] = {
        new JsonEncoder2[XyyItem0, XyyItem0] {
            override def p(obj: XyyItem0, name: XyyItem0, m: List[(String, Json)]): List[(String, Json)] = m
        }
    }
}
```
isReverse 属性可以让你在不改变任何内容签名的前提下逆转遍历顺序.  
然后加上对应属性的 implicit
```scala
implicit def circeEncoderImplicit[T](implicit t: Encoder[T]): Application[KContext, T, TypeParam2[T, String]] =
    new Application[KContext, T, TypeParam2[T, String]] {
      override def application(context: Context[KContext]): JsonEncoder2[T, String] = {
        new JsonEncoder2[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.apply(tt))) :: m
          }
        }
      }
    }
```

此时我们可以加一些实验性函数:
```scala
def appendTag[T, I <: TypeParam](tag: AppendTag[T])(implicit p: Application[KContext, T, I]): KContext#M[I] = p.application(ii)

val jsonPro1 = appendTag(new AppendTag[ItemTag3[String, Int, Long]])
val jsonPro2 = appendTag(new AppendTag[ItemTag3[Float, Float, Int]])
val jsonPro1Type: JsonEncoder2[XyyItem3[String, Int, Long], XyyItem3[String, String, String]] = jsonPro1
val jsonPro2Type: JsonEncoder2[XyyItem3[Float, Float, Int], XyyItem3[String, String, String]] = jsonPro2
```
可以看到类型系统均如期运作  
事实上, 类型系统以 Tag Type 为引导做了 `Item3[Encoder[S1, T1], Encoder[S2, T2], Encoder[S3, T3]]` 到 `Encoder[Item3[S1, S2, S3], Item3[T1, T2, T3]]` 的转换.

如今加入 Generic 来完成最后一步:
```scala
object JsonSetter {
    def encoder[H, R <: org.scalax.asuna.mapper.append.macroImpl.WrapTag, I <: TypeParam](
        implicit ll: AsunaGeneric.Aux[H, R]
        , app: Application[KContext, R#Tag, I]
        , cv1: AsunaNameGeneric.Aux[H, I#T#H]
        , cv2: AsunaGetterGeneric.Aux[H, I#H]
    ): ObjectEncoder[H] = {
        app.application(ii).toJsonObject(cv1.names).contramapObject(mm => cv2.getter(mm))
    }
}
```
输出结果
```scala
case class Foo(bar: String, age: Int)
implicit def fooImplicit: ObjectEncoder[Foo] = JsonSetter.encoder
import io.circe.syntax._
println(Foo("bar name", 2222).asJson.noSpaces) //{"bar":"bar name","age":2222}
```

这样设计的好处是各个 Generic 耦合程度十分低, 例如 from, 例如 to, 例如 names,
他们都可以分开设计直到使用时再进行拼接.

调试
========================
在 Context 已经建立和必要 Application 已经导入的前提下, 以
```scala
case class Test03(bar: String, date: java.util.Date)
```
为例
```scala
AsunaGeneric.init[Test03].generic.debugInstance.debug(ii)
```
将输出
```scala
[error] E:\pro\workspace\asuna\sample\src\main\scala\MacroTest1.scala:93:46:
[error] Application not found.
[error] ItemType    : java.util.Date
[error] KindContext : Test01.KContext
[error] Column Index: Asuna.Number: 2
[error]
[error] Number: 3 :-<>-: Number: 2 Means index = 3 * 22 + 2 = 68(1 based)
[error]
[error]   AsunaGeneric.init[Test03].generic.tag.debug(ii)
[error]                                              ^
[error] one error found
[error] (sample / Compile / compileIncremental) Compilation failed
[error] Total time: 1 s, completed 2019-6-7 14:18:29
```
的友好错误信息  
无 22 列限制, 不过 22 列以上需要根据编译器提示操作.
