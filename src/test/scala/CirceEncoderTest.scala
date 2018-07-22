package net.scalax.asuna.circe.test

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.{ CirceAsunaEncoder, CirceAsunaEncoderHelper, CirceTableEmptyObject }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.{ MacoColumnInfo, MacoColumnInfoImpl }
import net.scalax.asuna.helper.decoder.macroImpl.PropertyType
import net.scalax.asuna.helper.encoder.ForTableInput
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.{ EncoderProGen, PropertyEncoderFun }
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures

class CirceEncoderTest extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter
  with CirceAsunaEncoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  case class TestModel1(
    name: String,
    olim: Long)

  case class TestModel2(
    bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb: String,
    aaaaaaaaaaaaaaaaaaaaaa: Int)

  case class TestModel(
    /*name: String,
    key: String,
    TagTagTag: Int,
    olim: Long,
    test1: TestModel1,*/
    test2: TestModel2)

  object Abc

  "circe encoder" should "auto mapping case class with empty table" in {
    val test1 = TestModel1(faker.weather.description, 234L)
    val test2 = TestModel2(faker.weather.description, 967)
    val model = TestModel( /*faker.name.name, faker.address.cityName, 123, 456L, test1,*/ test2)

    final class $anon11 extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.CirceTableEmptyObject, CirceEncoderTest.this.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] {

      override def input(fresh$macro$1: net.scalax.asuna.circe.CirceTableEmptyObject): net.scalax.asuna.core.encoder.EncoderShapeValue[CirceEncoderTest.this.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] = {
        object CaseClassGenImpl extends net.scalax.asuna.shape.ShapeHelper {

          lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel] = {
            final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel] {

            };
            new $anon()
          };
          val test2 = {
            @scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
            abstract trait test2ProShape$macro$2[ShapeData, ProData] extends scala.AnyRef;
            object test2ProShape$macro$2 extends scala.AnyRef {

              implicit def propertyImplicit1[S, T](implicit cv: $less$colon$less[T, S]): test2ProShape$macro$2[S, T] = {
                final class $anon extends test2ProShape$macro$2[S, T] {
                };
                new $anon()
              }
            };
            implicit def fresh$macro$4: net.scalax.asuna.helper.MacoColumnInfo = MacoColumnInfoImpl(tableColumnName = "test2", modelColumnName = "test2",
              tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.CirceTableEmptyObject]],
              modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[CirceEncoderTest.this.TestModel]],
              tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]]);
            def test2Gen$macro$3[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: EncoderShape[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder]): EncoderProGen[A, B, C, test2ProShape$macro$2[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] = {
              final class $anon extends EncoderProGen[A, B, C, test2ProShape$macro$2[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] {

                override protected def innperPro: PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                  val rep1 = rep;
                  val shape1 = shape;
                  {
                    final class $anon extends PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] {

                      override val rep: A = rep1;
                      override val shape = shape1
                    };
                    new $anon()
                  }
                }
              };
              new $anon()
            };
            test2Gen$macro$3(mg(((x$2) => x$2.test2)).toPlaceholder, mg(((x$1) =>
              x$1.test2)))(columnEncoderWithPropertyName[TestModel2, ForTableInput[CirceTableEmptyObject, TestModel2, CirceAsunaEncoder]](implicitly[MacoColumnInfo], EncoderWrap.asunaTarget[TestModel2], {
              final class $anon22 extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.CirceTableEmptyObject, CirceEncoderTest.this.TestModel2, net.scalax.asuna.circe.CirceAsunaEncoder] {

                override def input(fresh$macro$9: net.scalax.asuna.circe.CirceTableEmptyObject): net.scalax.asuna.core.encoder.EncoderShapeValue[CirceEncoderTest.this.TestModel2, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                  object CaseClassGenImpl extends net.scalax.asuna.shape.ShapeHelper {

                    lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel2] = {
                      final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel2] {

                      };
                      new $anon()
                    };
                    val aaaaaaaaaaaaaaaaaaaaaa = {
                      @scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
                      abstract trait aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[ShapeData, ProData] extends scala.AnyRef;
                      object aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10 extends scala.AnyRef {

                        implicit def propertyImplicit1[S, T](implicit cv: $less$colon$less[T, S]): aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[S, T] = {
                          final class $anon extends aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[S, T] {

                          };
                          new $anon()
                        }
                      };

                      def aaaaaaaaaaaaaaaaaaaaaaGen$macro$11[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: EncoderShape[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder]): EncoderProGen[A, B, C, aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] = {
                        final class $anon extends EncoderProGen[A, B, C, aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] {

                          override protected def innperPro: PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                            val rep1 = rep;
                            val shape1 = shape;
                            {
                              final class $anon extends PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] {

                                override val rep: A = rep1;
                                override val shape = shape1
                              };
                              new $anon()
                            }
                          }
                        };
                        new $anon()
                      };
                      trait aa {
                        val xx = {
                          implicit def fresh$macro$12: net.scalax.asuna.helper.MacoColumnInfo =
                            MacoColumnInfoImpl(tableColumnName = "aaaaaaaaaaaaaaaaaaaaaa", modelColumnName = "aaaaaaaaaaaaaaaaaaaaaa",
                              tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.CirceTableEmptyObject]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[CirceEncoderTest.this.TestModel2]],
                              tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]]);
                          implicitly[MacoColumnInfo]
                          aaaaaaaaaaaaaaaaaaaaaaGen$macro$11(mg(((x$13) => x$13.aaaaaaaaaaaaaaaaaaaaaa)).toPlaceholder, mg(((x$12) => x$12.aaaaaaaaaaaaaaaaaaaaaa))).unwrap.sv
                        }
                      }
                      object bb extends aa
                      bb.xx
                    };
                    val bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb = {
                      @scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
                      abstract trait bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[ShapeData, ProData] extends scala.AnyRef;
                      object bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13 extends scala.AnyRef {

                        implicit def propertyImplicit1[S, T](implicit cv: $less$colon$less[T, S]): bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[S, T] = {
                          final class $anon extends bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[S, T] {

                          };
                          new $anon()
                        }
                      };
                      implicit val fresh$macro$15: net.scalax.asuna.helper.MacoColumnInfo =
                        MacoColumnInfoImpl(
                          tableColumnName = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
                          modelColumnName = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
                          tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.CirceTableEmptyObject]],
                          modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[CirceEncoderTest.this.TestModel2]],
                          tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]]);
                      def bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbGen$macro$14[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: EncoderShape[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder]): EncoderProGen[A, B, C, bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] = {
                        final class $anon extends EncoderProGen[A, B, C, bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] {

                          override protected def innperPro: PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                            val rep1 = rep;
                            val shape1 = shape;
                            {
                              final class $anon extends PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] {

                                override val rep: A = rep1;
                                override val shape = shape1
                              };
                              new $anon()
                            }
                          }
                        };
                        new $anon()
                      };
                      bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbGen$macro$14(mg(((x$15) => x$15.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)).toPlaceholder, mg(((x$14) => x$14.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb))).unwrap.sv
                    };
                    val dataShapeValue = {
                      final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

                      };
                      new $anon()
                    }.shaped(List(aaaaaaaaaaaaaaaaaaaaaa.emap(((s: Any) => mg(((x$16) => x$16.aaaaaaaaaaaaaaaaaaaaaa)).convertData(s))), bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.emap(((s: Any) => mg(((x$17) => x$17.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)).convertData(s))))).emap(((fresh$macro$16: CirceEncoderTest.this.TestModel2) => List(fresh$macro$16.aaaaaaaaaaaaaaaaaaaaaa, fresh$macro$16.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)))
                  };
                  CaseClassGenImpl.dataShapeValue
                }
              };
              new $anon22()
            })).unwrap.sv
          };
          val dataShapeValue = {
            final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

            };
            new $anon()
          }.shaped(List(test2.emap(((s: Any) => mg((x$3) => x$3.test2).convertData(s)))))
            .emap((fresh$macro$5: TestModel) => List(fresh$macro$5.test2))
        };
        CaseClassGenImpl.dataShapeValue
      }
    };
    new $anon11()

    /*val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[CirceTableEmptyObject, TestModel].input(CirceTableEmptyObject.value))
    val jsonObject = circeEncoder.write(model)
    val circeEncodeResult = {
      import io.circe.syntax._
      import io.circe.generic.auto._
      model.asJsonObject
    }

    println(circeEncodeResult)
    println("11" * 100 + jsonObject)

    jsonObject should be(circeEncodeResult)*/

    final class $anon22 extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.CirceTableEmptyObject, CirceEncoderTest.this.TestModel2, net.scalax.asuna.circe.CirceAsunaEncoder] {

      override def input(fresh$macro$9: net.scalax.asuna.circe.CirceTableEmptyObject): net.scalax.asuna.core.encoder.EncoderShapeValue[CirceEncoderTest.this.TestModel2, net.scalax.asuna.circe.CirceAsunaEncoder] = {
        object CaseClassGenImpl extends net.scalax.asuna.shape.ShapeHelper {

          lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel2] = {
            final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[CirceEncoderTest.this.TestModel2] {

            };
            new $anon()
          };
          val aaaaaaaaaaaaaaaaaaaaaa = {
            @scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
            abstract trait aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[ShapeData, ProData] extends scala.AnyRef;
            object aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10 extends scala.AnyRef {

              implicit def propertyImplicit1[S, T](implicit cv: $less$colon$less[T, S]): aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[S, T] = {
                final class $anon extends aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[S, T] {

                };
                new $anon()
              }
            };
            implicit val fresh$macro$12: net.scalax.asuna.helper.MacoColumnInfo =
              MacoColumnInfoImpl(tableColumnName = "aaaaaaaaaaaaaaaaaaaaaa", modelColumnName = "aaaaaaaaaaaaaaaaaaaaaa",
                tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.CirceTableEmptyObject]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[CirceEncoderTest.this.TestModel2]],
                tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]]);
            def aaaaaaaaaaaaaaaaaaaaaaGen$macro$11[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: EncoderShape[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder]): EncoderProGen[A, B, C, aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] = {
              final class $anon extends EncoderProGen[A, B, C, aaaaaaaaaaaaaaaaaaaaaaProShape$macro$10[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] {

                override protected def innperPro: PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                  val rep1 = rep;
                  val shape1 = shape;
                  {
                    final class $anon extends PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] {

                      override val rep: A = rep1;
                      override val shape = shape1
                    };
                    new $anon()
                  }
                }
              };
              new $anon()
            };
            aaaaaaaaaaaaaaaaaaaaaaGen$macro$11(mg(((x$13) => x$13.aaaaaaaaaaaaaaaaaaaaaa)).toPlaceholder, mg(((x$12) => x$12.aaaaaaaaaaaaaaaaaaaaaa))).unwrap.sv
          };
          val bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb = {
            @scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 ${ShapeData} 和实体类的数据类型 ${ProData} 不对应")
            abstract trait bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[ShapeData, ProData] extends scala.AnyRef;
            object bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13 extends scala.AnyRef {

              implicit def propertyImplicit1[S, T](implicit cv: $less$colon$less[T, S]): bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[S, T] = {
                final class $anon extends bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[S, T] {

                };
                new $anon()
              }
            };
            implicit val fresh$macro$15: net.scalax.asuna.helper.MacoColumnInfo =
              MacoColumnInfoImpl(
                tableColumnName = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
                modelColumnName = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
                tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.CirceTableEmptyObject]],
                modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[CirceEncoderTest.this.TestModel2]],
                tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]]);
            def bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbGen$macro$14[A, B, C, D](rep: A, pro: PropertyType[D])(implicit shape: EncoderShape[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder]): EncoderProGen[A, B, C, bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] = {
              final class $anon extends EncoderProGen[A, B, C, bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbProShape$macro$13[B, D], net.scalax.asuna.circe.CirceAsunaEncoder] {

                override protected def innperPro: PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                  val rep1 = rep;
                  val shape1 = shape;
                  {
                    final class $anon extends PropertyEncoderFun[A, B, C, net.scalax.asuna.circe.CirceAsunaEncoder] {

                      override val rep: A = rep1;
                      override val shape = shape1
                    };
                    new $anon()
                  }
                }
              };
              new $anon()
            };
            bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbGen$macro$14(mg(((x$15) => x$15.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)).toPlaceholder, mg(((x$14) => x$14.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb))).unwrap.sv
          };
          val dataShapeValue = {
            final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

            };
            new $anon()
          }.shaped(List(aaaaaaaaaaaaaaaaaaaaaa.emap(((s: Any) => mg(((x$16) => x$16.aaaaaaaaaaaaaaaaaaaaaa)).convertData(s))), bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.emap(((s: Any) => mg(((x$17) => x$17.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)).convertData(s))))).emap(((fresh$macro$16: CirceEncoderTest.this.TestModel2) => List(fresh$macro$16.aaaaaaaaaaaaaaaaaaaaaa, fresh$macro$16.bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)))
        };
        CaseClassGenImpl.dataShapeValue
      }
    };
    new $anon22()

  }

  //CirceEncoderTest.this.EncoderWrap[net.scalax.asuna.core.common.Placeholder[CirceEncoderTest.this.TestModel2]]{type TargetType = net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.CirceTableEmptyObject,net.scalax.asuna.core.common.Placeholder[CirceEncoderTest.this.TestModel2],net.scalax.asuna.circe.CirceAsunaEncoder]}
  //CirceEncoderTest.this.EncoderWrap[net.scalax.asuna.core.common.Placeholder[CirceEncoderTest.this.TestModel2]]{type TargetType = net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.CirceTableEmptyObject,CirceEncoderTest.this.TestModel2,net.scalax.asuna.circe.CirceAsunaEncoder]}

}