import scala.util.Try

val rootDir    = file(".")
val modulesDir = rootDir / "modules"

val core   = project in modulesDir / "core"
val rep    = (project in modulesDir / "rep").dependsOn(core)
val debug  = (project in modulesDir / "debug").dependsOn(core)
val macros = (project in modulesDir / "macros").dependsOn(core)

val scalaTuple1 = (project in modulesDir / "scala-tuple-1").dependsOn(core)
val scalaTuple2 = (project in modulesDir / "scala-tuple-2").dependsOn(scalaTuple1)
val scalaTuple  = (project in modulesDir / "scala-tuple").dependsOn(scalaTuple2)

val codegen   = project in modulesDir / "codegen"
val testkit   = (project in modulesDir / "testkit").dependsOn(macros, debug)
val examples  = (project in rootDir / "examples").dependsOn(testkit)
val benchmark = (project in modulesDir / "benchmark").dependsOn(testkit)

val asuna = (project in rootDir).dependsOn(core, scalaTuple, testkit).aggregate(core, rep, macros, debug, scalaTuple, scalaTuple1, scalaTuple2, testkit)

ZsgSettings.scalaVersionSettings
ZsgSettings.commonSettings

addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt")

val allUnpublish = taskKey[Unit]("allUnpublish")

allUnpublish := {
  Try { (core / bintrayUnpublish).value }
  Try { (rep / bintrayUnpublish).value }
  Try { (macros / bintrayUnpublish).value }
  Try { (scalaTuple / bintrayUnpublish).value }
  Try { (scalaTuple1 / bintrayUnpublish).value }
  Try { (scalaTuple2 / bintrayUnpublish).value }
  Try { (testkit / bintrayUnpublish).value }
  Try { (asuna / bintrayUnpublish).value }
}

addCommandAlias(
  "codegen",
  ";codegen/runMain zsg.codegen.ZsgCoreCodeGeneration" +
    ";codegen/runMain zsg.codegen.ZsgDebugCodeGeneration" +
    ";codegen/runMain zsg.codegen.ZsgNewTupleCodeGeneration" +
    ";codegen/runMain zsg.codegen.ZsgTestKitCodeGeneration" +
    ";codegen/runMain zsg.codegen.ZsgRepCodeGeneration" +
    ";codegen/runMain zsg.codegen.tuple.ZsgTupleCodeGeneration"
)

addCommandAlias("deleteCodegen", ";codegen/runMain zsg.codegen.DeleteTemp")

addCommandAlias("jmh1", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 zsg.json.encoder.benchmark.JsonEncoderBenchmark.*")
addCommandAlias("jmh2", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 zsg.json.encoder.benchmark.JsonADTEncoderBenchmark.*")
