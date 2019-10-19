package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.{AsunaDefaultValueGeneric, DefaultValue}

object AsunaDefaultValueGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    val defaultValue = DefaultValue.model[Sample10]

    AsunaDefaultValueGeneric
      .init[Sample10]
      .defaultValue(
        BuildContent.nodeTuple2(
          BuildContent.tuple8(
            defaultValue.to(_.i1)(Option.empty),
            defaultValue.to(_.i2)(Option.empty),
            defaultValue.to(_.i3)(Option.empty),
            defaultValue.to(_.i4)(Option.empty),
            defaultValue.to(_.i5)(Some(Sample10.apply$default$5: String)),
            defaultValue.to(_.i6)(Some(Sample10.apply$default$6: List[String])),
            defaultValue.to(_.i7)(Option.empty),
            defaultValue.to(_.i8)(Option.empty)
          ),
          BuildContent.tuple2(defaultValue.to(_.i9)(Option.empty), defaultValue.to(_.i10)(Option.empty))
        )
      )
  }

  sameType(
    implicitly[
      AsunaDefaultValueGeneric[
        Sample10,
        AsunaTuple2[AsunaTuple8[DefaultValue[String], DefaultValue[Int], DefaultValue[Int], DefaultValue[Long], DefaultValue[String], DefaultValue[
          List[String]
        ], DefaultValue[Long], DefaultValue[Option[Long]]], AsunaTuple2[DefaultValue[List[Long]], DefaultValue[String]]]
      ]
    ],
    genResult
  )

}
