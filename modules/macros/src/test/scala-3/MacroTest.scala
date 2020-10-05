package n

import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object MacroTest extends DefaultRunnableSpec {

  def spec = suite("Confim macro tree")(
    testM("macro tree should equal the word provide") {
      for {
        _     <- console.putStr(zsg.macros.single.AsunaGeneric.defaultOf.getClass.getName)
        word1 <- TestConsole.output
        word2 <- ZIO.effect("zsg.macros.single.AsunaGeneric$GenericApply")
      } yield assert(word1)(equalTo(Vector(word2)))
    }
  )

  /*def main(u: Array[String]): Unit = {
    // TypeTree[TypeRef(TermRef(ThisType(TypeRef(NoPrefix,module class <root>)),module scala),Any)]
    println(zsg.macros.single.AsunaGeneric.defaultOf)
  }*/

}
