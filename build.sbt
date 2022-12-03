val rootDir    = file(".")
val modulesDir = rootDir / "modules"

val core       = project in modulesDir / "core"
val rep        = (project in modulesDir / "rep").dependsOn(core)
val macros     = (project in modulesDir / "macros").dependsOn(core)
val scalaTuple = (project in modulesDir / "scala-tuple").dependsOn(core)

val codegen   = project in modulesDir / "codegen"
val testkit   = (project in modulesDir / "testkit").dependsOn(macros)
val examples  = (project in rootDir / "examples").dependsOn(testkit)
val benchmark = (project in modulesDir / "benchmark").dependsOn(testkit)

val zsg = (project in rootDir).dependsOn(core, testkit).aggregate(core, rep, macros, scalaTuple, testkit)

ZsgSettings.settings.scalaVersion
CommonSettings.settings
ZsgSettings.settings.githubWorkflow

val eachFmt = taskKey[Unit]("fmt for each project")
eachFmt := {
  (IntegrationTest / scalafmtSbt).value
  (Compile / scalafmt).value
  (Test / scalafmt).value
}
addCommandAlias("fmt", "all eachFmt")
addCommandAlias("codegen", s"++${ZsgSettings.versions.currentScala}! codegenTask")

val codegenTask = inputKey[Unit]("codegen task")
codegenTask := {
  (codegen / Compile / runMain).inputTaskValue.partialInput(" zsg.codegen.ZsgTestKitCodeGeneration").evaluated
  (codegen / Compile / runMain).inputTaskValue.partialInput(" zsg.codegen.ZsgCoreCodeGeneration").evaluated
  (codegen / Compile / runMain).inputTaskValue.partialInput(" zsg.codegen.ZsgScalaTupleCodeGeneration").evaluated
}

val deleteCodegen = inputKey[Unit]("delete codegen task")
deleteCodegen := (codegen / Compile / runMain).inputTaskValue.partialInput(" zsg.codegen.DeleteTemp").evaluated

val jmh1 = inputKey[Unit]("jmh1 task")
val jmh2 = inputKey[Unit]("jmh2 task")

jmh1 := (benchmark / Jmh / run).inputTaskValue
  .partialInput(" -i")
  .partialInput(" 3")
  .partialInput(" -wi")
  .partialInput(" 3")
  .partialInput(" -f")
  .partialInput(" 1")
  .partialInput(" -t")
  .partialInput(" 1")
  .partialInput(" zsg.json.encoder.benchmark.JsonEncoderBenchmark.*")
  .evaluated
jmh2 := (benchmark / Jmh / run).inputTaskValue
  .partialInput(" -i")
  .partialInput(" 3")
  .partialInput(" -wi")
  .partialInput(" 3")
  .partialInput(" -f")
  .partialInput(" 1")
  .partialInput(" -t")
  .partialInput(" 1")
  .partialInput(" zsg.json.encoder.benchmark.JsonADTEncoderBenchmark.*")
  .evaluated
