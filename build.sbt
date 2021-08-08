val rootDir    = file(".")
val modulesDir = rootDir / "modules"

val core   = project in modulesDir / "core"
val rep    = (project in modulesDir / "rep").dependsOn(core)
val macros = (project in modulesDir / "macros").dependsOn(core)

// val scalaTuple = (project in modulesDir / "scala-tuple").dependsOn(macros)

val codegen   = project in modulesDir / "codegen"
val testkit   = (project in modulesDir / "testkit").dependsOn(macros)
val examples  = (project in rootDir / "examples").dependsOn(testkit)
val benchmark = (project in modulesDir / "benchmark").dependsOn(testkit)

val zsg = (project in rootDir).dependsOn(core, testkit).aggregate(core, rep, macros, testkit)

ZsgSettings.scalaVersionSettings
ZsgSettings.commonSettings

addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt")

addCommandAlias("codegen", ";codegen/runMain zsg.codegen.ZsgTestKitCodeGeneration" + ";codegen/runMain zsg.codegen.ZsgCoreCodeGeneration")

addCommandAlias("deleteCodegen", ";codegen/runMain zsg.codegen.DeleteTemp")

addCommandAlias("jmh1", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 zsg.json.encoder.benchmark.JsonEncoderBenchmark.*")
addCommandAlias("jmh2", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 zsg.json.encoder.benchmark.JsonADTEncoderBenchmark.*")
