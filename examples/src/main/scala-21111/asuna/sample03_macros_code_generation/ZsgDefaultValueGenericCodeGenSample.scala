package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.{DefaultValue, ZsgDefaultValueGeneric}

object ZsgDefaultValueGenericCodeGenSample extends App {

  import sumOfCaseClass._

  def sameType[T](t1: T, t2: T): T = t1

  /*def genResult: AsunaDefaultValueGeneric[
    Sample10ModelWithDefaultValue,
    AsunaTuple2[AsunaTuple2[
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[Int]], AsunaTuple2[DefaultValue[Int], DefaultValue[Long]]],
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[List[SumII.Aux[Char]]]], AsunaTuple2[DefaultValue[Long], DefaultValue[Option[Long]]]]
    ], AsunaTuple1[AsunaTuple1[AsunaTuple2[DefaultValue[List[Long]], DefaultValue[String]]]]]
  ] = {
    AsunaDefaultValueGeneric.value { i =>
      BuildContent.tuple2(
        BuildContent.tuple2(
          BuildContent.tuple2(
            BuildContent.tuple2(i.to(_.i1)(Option.empty), i.to(_.i2)(Option.empty)),
            BuildContent.tuple2(i.to(_.i3)(Option.empty), i.to(_.i4)(Option.empty))
          ),
          BuildContent.tuple2(
            BuildContent.tuple2(i.to(_.i5)(Some(Sample10ModelWithDefaultValue.apply$default$5)), i.to(_.i6)(Some(Sample10ModelWithDefaultValue.apply$default$6))),
            BuildContent.tuple2(i.to(_.i7)(Option.empty), i.to(_.i8)(Some(Sample10ModelWithDefaultValue.apply$default$8)))
          )
        ),
        BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple2(i.to(_.i9)(Option.empty), i.to(_.i10)(Option.empty))))
      )
    }
  }*/

  val macroResult = implicitly[
    ZsgDefaultValueGeneric[
      Sample10ModelWithDefaultValue,
      ZTuple10[DefaultValue[String], DefaultValue[Int], DefaultValue[Int], DefaultValue[Long], DefaultValue[String], DefaultValue[List[SumII.Aux[Char]]], DefaultValue[
        Long
      ], DefaultValue[Option[Long]], DefaultValue[List[Long]], DefaultValue[String]]
    ]
  ]

  /*sameType(
    macroResult,
    genResult
  )*/

  val n: Option[List[SumII.Aux[Char]]] = macroResult.defaultValues.i6.value

  println(n.toList.flatten.mkString("\n"))

}
