import scala.util.Try

val core   = project in file("./modules/core")
val macros = (project in file("./modules/macros")).dependsOn(core)

val scalaTuple1 = (project in file("./modules/scala-tuple-1")).dependsOn(core)
val scalaTuple2 = (project in file("./modules/scala-tuple-2")).dependsOn(scalaTuple1)
val scalaTuple  = (project in file("./modules/scala-tuple")).dependsOn(scalaTuple2)

val codegen   = project in file("./modules/codegen")
val testkit   = (project in file("./modules/testkit")).dependsOn(macros)
val examples  = (project in file("./examples")).dependsOn(testkit)
val benchmark = (project in file("./modules/benchmark")).dependsOn(testkit)

val asuna = (project in file(".")).dependsOn(core, scalaTuple, testkit).aggregate(core, macros, scalaTuple, scalaTuple1, scalaTuple2, testkit)

AsunaSettings.setting1
AsunaSettings.commonSettings

val sfmt = taskKey[Unit]("sfmt")

sfmt := {
  (core / Test / scalafmt).value
  (core / Compile / scalafmtSbt).value

  (macros / Compile / scalafmt).value
  (macros / Compile / scalafmtSbt).value

  (scalaTuple / Test / scalafmt).value
  (scalaTuple / Compile / scalafmtSbt).value

  (scalaTuple1 / Test / scalafmt).value
  (scalaTuple1 / Compile / scalafmtSbt).value

  (scalaTuple2 / Test / scalafmt).value
  (scalaTuple2 / Compile / scalafmtSbt).value

  (testkit / Compile / scalafmt).value
  (testkit / Test / scalafmt).value
  (testkit / Compile / scalafmtSbt).value

  (examples / Compile / scalafmt).value
  (examples / Compile / scalafmtSbt).value

  (benchmark / Compile / scalafmt).value
  (benchmark / Compile / scalafmtSbt).value

  (codegen / Compile / scalafmt).value
  (codegen / Compile / scalafmtSbt).value

  (asuna / Compile / scalafmt).value
  (asuna / Test / scalafmtSbt).value
  (asuna / Compile / scalafmtSbt).value
}

val allUnpublish = taskKey[Unit]("allUnpublish")

allUnpublish := {
  Try { (core / bintrayUnpublish).value }
  Try { (macros / bintrayUnpublish).value }
  Try { (scalaTuple / bintrayUnpublish).value }
  Try { (scalaTuple1 / bintrayUnpublish).value }
  Try { (scalaTuple2 / bintrayUnpublish).value }
  Try { (testkit / bintrayUnpublish).value }
  Try { (asuna / bintrayUnpublish).value }
}

addCommandAlias(
  "codegen",
  ";codegen/runMain asuna.codegen.AsunaCoreCodeGeneration" +
    ";codegen/runMain asuna.codegen.AsunaTestKitCodeGeneration" +
    ";codegen/runMain asuna.codegen.tuple.AsunaTupleCodeGeneration"
)

addCommandAlias("deleteCodegen", ";codegen/runMain asuna.codegen.DeleteTemp")

addCommandAlias("jmh1", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 .*Test01.*")
addCommandAlias("jmh2", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 .*Test02.*")
