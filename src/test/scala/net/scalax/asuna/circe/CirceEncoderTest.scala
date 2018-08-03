package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.{ CirceAsunaEncoderHelper, EmptyCirceTable }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.helper.MacroColumnInfoImpl
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

case class TestModel1(
  name: String,
  olim: Long, test3: TestModel3)

case class TestModel2(
  name: String,
  accdef: Int)

case class TestModel3(
  nickName: String,
  maxAge: Int, test1: TestModel1)

case class TestModel(
  name: String,
  key: String,
  TagTagTag: Int,
  olim: Long,
  test1: TestModel1,
  test2: TestModel2)

class CirceEncoderTest extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter
  with CirceAsunaEncoderHelper {

  /*
  testModel
  -> shapeEncoderImplicit[TestModel]
  test1
  -> shapeEncoderImplicit[TestModel1]
  test3
  -> shapeEncoderImplicit[TestModel3]
  test1
  -> shapeEncoderImplicit[TestModel1]
   */

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  //"circe encoder" should "auto mapping case class with empty table" in {
  /*val test3 = TestModel3(faker.address.fullAddress, 461, ???)
    val test1 = TestModel1(faker.weather.description, 793, test3)

    val test2 = TestModel2(faker.book.title, 967)
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, test2)*/

  /*implicit val implicit1 = {
      import io.circe.generic.auto._
      implicitly[Encoder[TestModel3]]
    }

    import io.circe.syntax._

    implicitly[CirceEncoderConfirmOrder[TestModel1]]


    val jsonObject = circeEncoder.write(test1)

    val circeEncodeResult = {
      import io.circe.generic.auto._
      model.asJsonObject
    }

    println("11" * 100)
    println(jsonObject.asJson.spaces2)
    jsonObject should be(circeEncodeResult)*/
  //}

  val circeEncoder1111 = asunaCirce.effect(asunaCirce.caseOnly[EmptyCirceTable, TestModel1].input(EmptyCirceTable.value))

  trait kfike[Poly] {
    type Out
    val out: Out
  }

  object kfike {
    type Aux[P, T] = kfike[P] { type Out = T }
    type Aux2[P] = kfike[P]
  }

  object sdfjsofjweifj extends sdfjsejfweohjrfjihjwerhwerh {
    implicit def sfejrwewurhw: kfike.Aux[sdfjsofjweifj.type, String] = new kfike[sdfjsofjweifj.type] {
      override type Out = String
      override val out = "sdfrertert"
    }
  }

  trait sdfjsejfweohjrfjihjwerhwerh {
    implicit def sdfwsegsrtrstr: kfike.Aux[sdfjsofjweifj.type, Int] = new kfike[sdfjsofjweifj.type] {
      override type Out = Int
      override val out = 33453
    }
  }

  "circe encoder" should "auto mapping case class with empty table" in {
    def sfsfsfsf[A](implicit sfserr: kfike.Aux2[A]): sfserr.Out = sfserr.out

    println("aaaa" * 100)
    //println(sfsfsfsf[sdfjsofjweifj.type])

    def sokfjawoerhjawr[T, D](dfas: T)(implicit sfjfwshtfwe: efabc[T, D]): D = sfjfwshtfwe.out

    println(sokfjawoerhjawr("sdfsdrerse"))

  }

  trait efabc[In, Out] {
    val out: Out
  }

  object efabc extends sdfjsdofhefghseruighteurisgtgbreui {
    implicit def lewrhguilerhguiergbhtgrbsetiges(implicit sdfwserf: TestModel1): efabc[String, Int] = new efabc[String, Int] {
      override val out: Int = 2333
    }
  }

  trait sdfjsdofhefghseruighteurisgtgbreui extends asgerstyreydrtyhrtdhurtyujht {
    implicit def vargfdsgsdfgbvsertsrtg(implicit sdfwserf: TestModel1): efabc[String, String] = new efabc[String, String] {
      override val out: String = "sdfdstgrestsert"
    }
  }

  trait asgerstyreydrtyhrtdhurtyujht {
    implicit def awrtfsertgsertgsedrtesrtfaer: efabc[String, TestModel2] = new efabc[String, TestModel2] {
      override val out: TestModel2 = TestModel2("dfsdfgsertert", 4564)
    }
  }

  /*val kenfgjiejr = {
    final class $anon extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] { tableSelf =>

      override def input(netScalaxAsunaEncoderTable6e08f317a90c1a4230a8b25aaa407813bb21$macro$45: net.scalax.asuna.circe.EmptyCirceTable): net.scalax.asuna.core.encoder.EncoderShapeValue[aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] = {
        final class $anon extends net.scalax.asuna.shape.ShapeHelper {

          implicit def netScalaxAsunaEncoderSelfInputTableInplicitffce7e68afdeea420cab820abce5a8862df0$macro$46: net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] = tableSelf;
          def netScalaxAsunaEncoderoutPutDef1b47d401ac55ca4583a9992a54b223e45f8b$macro$47 = {
            lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel] = {
              final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel] {

              };
              new $anon()
            };
            val netScalaxAsunaEncodertest190a91e83a5fe1a4f0da810ea2c6cd34f5cd5$macro$1 = {
              abstract trait netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 extends net.scalax.asuna.helper.MacroColumnInfoContent {

                def output = _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[net.scalax.asuna.circe.CirceAsunaEncoder](mg(((x$2) => x$2.test1)).toPlaceholder, mg(((x$1) => x$1.test1)))(columnEncoderWithPropertyNamedfdsrgrhgdrthdrthtdfhfdtyht(implicitly[MacroColumnInfo], CirceEncoderConfirmOrder.needInputTable {

                  final class $anon extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel1, net.scalax.asuna.circe.CirceAsunaEncoder] { tableSelf =>

                    override def input(netScalaxAsunaEncoderTabled2c96a28a8041a4da6a98b4aa04a5beeadfb$macro$94: net.scalax.asuna.circe.EmptyCirceTable): net.scalax.asuna.core.encoder.EncoderShapeValue[aa.bb.cc.TestModel1, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                      final class $anon extends net.scalax.asuna.shape.ShapeHelper {

                        implicit def netScalaxAsunaEncoderSelfInputTableInplicit50d29064ace26a47d8aab91a51a7b7cdd61f$macro$95: net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel1, net.scalax.asuna.circe.CirceAsunaEncoder] = tableSelf;
                        def netScalaxAsunaEncoderoutPutDefa817a444a7270a4cf5a884da17cef4d3e366$macro$96 = {
                          lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel1] = {
                            final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel1] {

                            };
                            new $anon()
                          };
                          val netScalaxAsunaEncodertest371e96e62a3b8fa4f56abed1aee8c7f1d9e12$macro$50 = {
                            abstract trait netScalaxAsunaEncodertest306beec92a0510a4841a8405a8e5ab44ae524$macro$97 extends net.scalax.asuna.helper.MacroColumnInfoContent {

                              def output = _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[net.scalax.asuna.circe.CirceAsunaEncoder](mg(((x$5) => x$5.test3)).toPlaceholder, mg(((x$4) => x$4.test3)))(columnEncoderWithPropertyNamedfdsrgrhgdrthdrthtdfhfdtyht(implicitly[MacroColumnInfo], CirceEncoderConfirmOrder.needInputTable {

                                final class $anon extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel3, net.scalax.asuna.circe.CirceAsunaEncoder] { tableSelf =>

                                  override def input(netScalaxAsunaEncoderTable238849b1a7012a468da8db6a43553a784277$macro$143: net.scalax.asuna.circe.EmptyCirceTable): net.scalax.asuna.core.encoder.EncoderShapeValue[aa.bb.cc.TestModel3, net.scalax.asuna.circe.CirceAsunaEncoder] = {
                                    final class $anon extends net.scalax.asuna.shape.ShapeHelper {

                                      implicit def netScalaxAsunaEncoderSelfInputTableInplicit95581793a01f9a4dacabd60aab6c35d3a769$macro$144: net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel3, net.scalax.asuna.circe.CirceAsunaEncoder] = tableSelf;
                                      def netScalaxAsunaEncoderoutPutDef58d89544a8f50a495da8681a7362cdd4e0e9$macro$145 = {
                                        lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel3] = {
                                          final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel3] {

                                          };
                                          new $anon()
                                        };
                                        val netScalaxAsunaEncodertest11a5de4f8a570ba4e61a860fa8a6d7cf256ee$macro$99 = {
                                          abstract trait netScalaxAsunaEncodertest13d240edda4b9aa4120a8c1fa0b5c9694e302$macro$146 extends net.scalax.asuna.helper.MacroColumnInfoContent {

                                            def output = _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[net.scalax.asuna.circe.CirceAsunaEncoder](mg(((x$8) => x$8.test1)).toPlaceholder, mg(((x$7) => x$7.test1)))
                                          };
                                          object netScalaxAsunaEncodertest13d240edda4b9aa4120a8c1fa0b5c9694e302$macro$146 extends netScalaxAsunaEncodertest13d240edda4b9aa4120a8c1fa0b5c9694e302$macro$146 {

                                            override implicit def columnInfo = MacroColumnInfoImpl(tableColumnName = "test1", modelColumnName = "test1", tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.EmptyCirceTable]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[aa.bb.cc.TestModel3]], tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]])
                                          };
                                          netScalaxAsunaEncodertest13d240edda4b9aa4120a8c1fa0b5c9694e302$macro$146.output
                                        };
                                        {
                                          final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

                                          };
                                          new $anon()
                                        }.shaped(List(netScalaxAsunaEncodertest11a5de4f8a570ba4e61a860fa8a6d7cf256ee$macro$99.emap(((s: Any) => mg(((x$9) => x$9.test1)).convertData(s))))).emap(((netScalaxAsunaEncoderExporta6ad63b1a3cb0a4513aa216accf205c3b80b$macro$147: aa.bb.cc.TestModel3) => List(netScalaxAsunaEncoderExporta6ad63b1a3cb0a4513aa216accf205c3b80b$macro$147.test1)))
                                      }
                                    };
                                    new $anon()
                                  }.netScalaxAsunaEncoderoutPutDef58d89544a8f50a495da8681a7362cdd4e0e9$macro$145
                                };
                                new $anon()

                              }))
                            };
                            object netScalaxAsunaEncodertest306beec92a0510a4841a8405a8e5ab44ae524$macro$97 extends netScalaxAsunaEncodertest306beec92a0510a4841a8405a8e5ab44ae524$macro$97 {

                              override implicit def columnInfo = MacroColumnInfoImpl(tableColumnName = "test3", modelColumnName = "test3", tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.EmptyCirceTable]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[aa.bb.cc.TestModel1]], tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]])
                            };
                            netScalaxAsunaEncodertest306beec92a0510a4841a8405a8e5ab44ae524$macro$97.output
                          };
                          {
                            final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

                            };
                            new $anon()
                          }.shaped(List(netScalaxAsunaEncodertest371e96e62a3b8fa4f56abed1aee8c7f1d9e12$macro$50.emap(((s: Any) => mg(((x$6) => x$6.test3)).convertData(s))))).emap(((netScalaxAsunaEncoderExport65bac377ab18fa414da9a4ea46869148d9ff$macro$98: aa.bb.cc.TestModel1) => List(netScalaxAsunaEncoderExport65bac377ab18fa414da9a4ea46869148d9ff$macro$98.test3)))
                        }
                      };
                      new $anon()
                    }.netScalaxAsunaEncoderoutPutDefa817a444a7270a4cf5a884da17cef4d3e366$macro$96
                  };
                  new $anon()

                }))
              };
              object netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 extends netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 {

                override implicit def columnInfo = MacroColumnInfoImpl(tableColumnName = "test1", modelColumnName = "test1", tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.EmptyCirceTable]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[aa.bb.cc.TestModel]], tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]])
              };
              netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48.output
            };
            {
              final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

              };
              new $anon()
            }.shaped(List(netScalaxAsunaEncodertest190a91e83a5fe1a4f0da810ea2c6cd34f5cd5$macro$1.emap(((s: Any) => mg(((x$3) => x$3.test1)).convertData(s))))).emap(((netScalaxAsunaEncoderExport323db411ab2f4a4e4aaa6d9a2d5c811ee6d5$macro$49: aa.bb.cc.TestModel) => List(netScalaxAsunaEncoderExport323db411ab2f4a4e4aaa6d9a2d5c811ee6d5$macro$49.test1)))
          }
        };
        new $anon()
      }.netScalaxAsunaEncoderoutPutDef1b47d401ac55ca4583a9992a54b223e45f8b$macro$47
    };
    new $anon()
  }*/

  /*val kenfgjiejr11 = {
    final class $anon extends net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] { tableSelf =>

      override def input(netScalaxAsunaEncoderTable6e08f317a90c1a4230a8b25aaa407813bb21$macro$45: net.scalax.asuna.circe.EmptyCirceTable): net.scalax.asuna.core.encoder.EncoderShapeValue[aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] = {
        final class $anon extends net.scalax.asuna.shape.ShapeHelper {

          //implicit def netScalaxAsunaEncoderSelfInputTableInplicitffce7e68afdeea420cab820abce5a8862df0$macro$46: net.scalax.asuna.helper.encoder.ForTableInput[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel, net.scalax.asuna.circe.CirceAsunaEncoder] = tableSelf;
          def netScalaxAsunaEncoderoutPutDef1b47d401ac55ca4583a9992a54b223e45f8b$macro$47 = {
            lazy val mg: net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel] = {
              final class $anon extends net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel] {

              };
              new $anon()
            };
            val netScalaxAsunaEncodertest190a91e83a5fe1a4f0da810ea2c6cd34f5cd5$macro$1 = {
              abstract trait netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 extends net.scalax.asuna.helper.MacroColumnInfoContent {

                def output = _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[net.scalax.asuna.circe.CirceAsunaEncoder].withEncoderShape[Placeholder[TestModel1], TestModel1, CirceAsunaEncoderImpl[TestModel1]](mg(((x$2) => x$2.test1)).toPlaceholder, mg(((x$1) => x$1.test1)))
              };
              object netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 extends netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48 {

                override implicit def columnInfo = MacroColumnInfoImpl(tableColumnName = "test1", modelColumnName = "test1", tableWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[net.scalax.asuna.circe.EmptyCirceTable]], modelTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[aa.bb.cc.TestModel]], tableRepWeakTypeTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]], modelRepTag = _root_.scala.Predef.implicitly[reflect.runtime.universe.WeakTypeTag[() => String]])
              };
              netScalaxAsunaEncodertest1e3f98053af3b8a476aa9d55a579cea88a4f1$macro$48.output
            };
            {
              final class $anon extends net.scalax.asuna.helper.encoder.EncoderHelper[net.scalax.asuna.circe.CirceAsunaEncoder] {

              };
              new $anon()
            }.shaped(List(netScalaxAsunaEncodertest190a91e83a5fe1a4f0da810ea2c6cd34f5cd5$macro$1.emap(((s: Any) => mg(((x$3) => x$3.test1)).convertData(s))))).emap(((netScalaxAsunaEncoderExport323db411ab2f4a4e4aaa6d9a2d5c811ee6d5$macro$49: aa.bb.cc.TestModel) => List(netScalaxAsunaEncoderExport323db411ab2f4a4e4aaa6d9a2d5c811ee6d5$macro$49.test1)))
          }
        };
        new $anon()
      }.netScalaxAsunaEncoderoutPutDef1b47d401ac55ca4583a9992a54b223e45f8b$macro$47
    };
    new $anon()
  }*/

}