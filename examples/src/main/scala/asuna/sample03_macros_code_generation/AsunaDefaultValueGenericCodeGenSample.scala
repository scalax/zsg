package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.{AsunaDefaultValueGeneric, DefaultValue}

object AsunaDefaultValueGenericCodeGenSample {

  import ii._

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaDefaultValueGeneric[
    Sample11,
    AsunaTuple2[AsunaTuple2[
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[Int]], AsunaTuple2[DefaultValue[Int], DefaultValue[Long]]],
      AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[List[String]]], AsunaTuple2[DefaultValue[Long], DefaultValue[Option[Long]]]]
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
            BuildContent.tuple2(i.to(_.i5)(Some(Sample11.apply$default$5: String)), i.to(_.i6)(Some(Sample11.apply$default$6: List[String]))),
            BuildContent.tuple2(i.to(_.i7)(Option.empty), i.to(_.i8)(Option.empty))
          )
        ),
        BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple2(i.to(_.i9)(Option.empty), i.to(_.i10)(Option.empty))))
      )
    }
  }

  sameType(
    implicitly[
      AsunaDefaultValueGeneric[
        Sample11,
        AsunaTuple2[AsunaTuple2[
          AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[Int]], AsunaTuple2[DefaultValue[Int], DefaultValue[Long]]],
          AsunaTuple2[AsunaTuple2[DefaultValue[String], DefaultValue[List[String]]], AsunaTuple2[DefaultValue[Long], DefaultValue[Option[Long]]]]
        ], AsunaTuple1[AsunaTuple1[AsunaTuple2[DefaultValue[List[Long]], DefaultValue[String]]]]]
      ]
    ],
    genResult
  )

}
