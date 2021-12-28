package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.{DefaultValue, ZsgDefaultValueGeneric}
import scala.collection.compat._

object ZsgDefaultValueGenericCodeGenSample {

  import sumOfCaseClass._

  def sameType[T](t1: T, t2: T): T = t1

  def genResult: ZsgDefaultValueGeneric[
    Sample10ModelWithDefaultValue,
    ZsgTuple2[ZsgTuple2[
      ZsgTuple2[ZsgTuple2[DefaultValue[String], DefaultValue[Int]], ZsgTuple2[DefaultValue[Int], DefaultValue[Long]]],
      ZsgTuple2[ZsgTuple2[DefaultValue[String], DefaultValue[List[SumII.Aux[Char]]]], ZsgTuple2[DefaultValue[Long], DefaultValue[
        Option[Long]
      ]]]
    ], ZsgTuple2[DefaultValue[List[Long]], DefaultValue[String]]]
  ] = {
    ZsgDefaultValueGeneric.value { i =>
      new ZsgTuple2(
        new ZsgTuple2(
          new ZsgTuple2(
            new ZsgTuple2(i.to(_.i1)(Option.empty), i.to(_.i2)(Option.empty)),
            new ZsgTuple2(i.to(_.i3)(Option.empty), i.to(_.i4)(Option.empty))
          ),
          new ZsgTuple2(
            new ZsgTuple2(
              i.to(_.i5)(Some(Sample10ModelWithDefaultValue.apply$default$5)),
              i.to(_.i6)(Some(Sample10ModelWithDefaultValue.apply$default$6))
            ),
            new ZsgTuple2(i.to(_.i7)(Option.empty), i.to(_.i8)(Some(Sample10ModelWithDefaultValue.apply$default$8)))
          )
        ),
        new ZsgTuple2(i.to(_.i9)(Option.empty), i.to(_.i10)(Option.empty))
      )
    }
  }

  val macroResult = implicitly[
    ZsgDefaultValueGeneric[
      Sample10ModelWithDefaultValue,
      ZsgTuple2[ZsgTuple2[
        ZsgTuple2[ZsgTuple2[DefaultValue[String], DefaultValue[Int]], ZsgTuple2[DefaultValue[Int], DefaultValue[Long]]],
        ZsgTuple2[ZsgTuple2[DefaultValue[String], DefaultValue[List[SumII.Aux[Char]]]], ZsgTuple2[DefaultValue[Long], DefaultValue[
          Option[Long]
        ]]]
      ], ZsgTuple2[DefaultValue[List[Long]], DefaultValue[String]]]
    ]
  ]

  sameType(
    macroResult,
    genResult
  )

  def main(arr: Array[String]): Unit = {
    val n: Option[List[SumII.Aux[Char]]] = macroResult.defaultValues.i1.i2.i1.i2.value
    val compare                          = Some(List.fill(5)("""interface zsg.sample03_macros_code_generation.SumII.Aux[char]"""))
    assert(n.map(_.map(_.toString)) == compare)
    println(n.to(List).flatten.mkString("\n"))
  }

}
