val core = project in file("./modules/core")

lazy val scalaTuple1 = (project in file("./modules/scala-tuple-1")).dependsOn(core)
lazy val scalaTuple2 = (project in file("./modules/scala-tuple-2")).dependsOn(scalaTuple1)
lazy val scalaTuple  = (project in file("./modules/scala-tuple")).dependsOn(scalaTuple2)

val codegen   = project in file("./modules/codegen")
val testkit   = (project in file("./modules/testkit")).dependsOn(core)
val examples  = (project in file("./examples")).dependsOn(testkit)
val benchmark = (project in file("./modules/benchmark")).dependsOn(testkit)

val asuna = (project in file(".")).dependsOn(core, scalaTuple, testkit).aggregate(core, scalaTuple, scalaTuple1, scalaTuple2, testkit)

AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

def sfmtProject(id: String) = {
  s";${id}/scalafmt;${id}/test:scalafmt;${id}/scalafmtSbt"
}

addCommandAlias(
  "sfmt",
  sfmtProject(core.id) +
    sfmtProject(scalaTuple.id) +
    sfmtProject(scalaTuple1.id) +
    sfmtProject(scalaTuple2.id) +
    sfmtProject(testkit.id) +
    sfmtProject(examples.id) +
    sfmtProject(benchmark.id) +
    sfmtProject(codegen.id) +
    sfmtProject(asuna.id)
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
