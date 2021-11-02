package n

import zio._
import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object MacroTest extends DefaultRunnableSpec {

  override def spec = suite("Confim macro tree")(
    test("macro tree should equal the word provide") {
      for {
        _     <- print(zsg.macros.single.AsunaGeneric.defaultOf.getClass.getName)
        word1 <- TestConsole.output
        word2 <- ZIO.attempt("zsg.macros.single.AsunaGeneric$GenericApply")
      } yield assert(word1)(equalTo(Vector(word2)))
    }
  )

  /*def main(u: Array[String]): Unit = {
    // TypeTree[TypeRef(TermRef(ThisType(TypeRef(NoPrefix,module class <root>)),module scala),Any)]
    println(zsg.macros.single.AsunaGeneric.defaultOf)
  }*/

}
