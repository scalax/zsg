val core = project in file("./modules/core")

lazy val scalaTuple1 = (project in file("./modules/scala-tuple-1")).dependsOn(core)
lazy val scalaTuple2 = (project in file("./modules/scala-tuple-2")).dependsOn(scalaTuple1)
lazy val scalaTuple  = (project in file("./modules/scala-tuple")).dependsOn(scalaTuple2)

val testkit    = (project in file("./modules/testkit")).dependsOn(core)
lazy val asuna = (project in file(".")).dependsOn(core, scalaTuple, testkit).aggregate(core, scalaTuple, scalaTuple1, scalaTuple2, testkit)

val examples  = (project in file("./examples")).dependsOn(testkit)
val benchmark = (project in file("./modules/benchmark")).dependsOn(testkit)
val codegen   = project in file("./modules/codegen")

AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

addCommandAlias(
  "sfmt",
  ";core/scalafmt" +
    ";core/test:scalafmt" +
    ";examples/scalafmt" +
    ";benchmark/scalafmt" +
    ";codegen/scalafmt" +
    ";scalaTuple/test:scalafmt" +
    ";scalafmtSbt" +
    ";examples/scalafmtSbt" +
    ";benchmark/scalafmtSbt" +
    ";codegen/scalafmtSbt"
)

addCommandAlias(
  "codegen",
  ";codegen/runMain asuna.codegen.AsunaCoreCodeGeneration" +
    ";codegen/runMain asuna.codegen.AsunaTestKitCodeGeneration" +
    ";codegen/runMain asuna.codegen.tuple.AsunaTupleCodeGeneration"
)

addCommandAlias("gen", ";codegen;sfmt;sfmt;sfmt;sfmt")

addCommandAlias("jmh1", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 .*AbcTest.*")
addCommandAlias("jmh2", "benchmark/jmh:run -i 3 -wi 3 -f 1 -t 1 .*DefTest.*")
