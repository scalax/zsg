package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.{AsunaDefaultValueGeneric, DefaultValue}

object AsunaDefaultValueGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaDefaultValueGeneric[
    Sample10,
    AsunaTuple2[AsunaTuple2[
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[Int]], AsunaTuple2[DefaultValue[Int], DefaultValue[Long]]],
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[List[String]]], AsunaTuple2[DefaultValue[Long], DefaultValue[Option[Long]]]]
    ], AsunaTuple1[AsunaTuple1[AsunaTuple2[DefaultValue[List[Long]], DefaultValue[String]]]]]
  ] = {
    val defaultValue = DefaultValue.model[Sample10]

    AsunaDefaultValueGeneric.value {
      BuildContent.tuple2(
        BuildContent.tuple2(
          BuildContent.tuple2(
            BuildContent.tuple2(defaultValue.to(_.i1)(Option.empty), defaultValue.to(_.i2)(Option.empty)),
            BuildContent.tuple2(defaultValue.to(_.i3)(Option.empty), defaultValue.to(_.i4)(Option.empty))
          ),
          BuildContent.tuple2(
            BuildContent.tuple2(defaultValue.to(_.i5)(Some(Sample10.apply$default$5: String)), defaultValue.to(_.i6)(Some(Sample10.apply$default$6: List[String]))),
            BuildContent.tuple2(defaultValue.to(_.i7)(Option.empty), defaultValue.to(_.i8)(Option.empty))
          )
        ),
        BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple2(defaultValue.to(_.i9)(Option.empty), defaultValue.to(_.i10)(Option.empty))))
      )
    }
  }

  sameType(
    implicitly[
      AsunaDefaultValueGeneric[
        Sample10,
        AsunaTuple2[AsunaTuple2[
          AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[Int]], AsunaTuple2[DefaultValue[Int], DefaultValue[Long]]],
          AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[List[String]]], AsunaTuple2[DefaultValue[Long], DefaultValue[Option[Long]]]]
        ], AsunaTuple1[AsunaTuple1[AsunaTuple2[DefaultValue[List[Long]], DefaultValue[String]]]]]
      ]
    ],
    genResult
  )

}
