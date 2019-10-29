val core       = project in file("./core")
val scalaTuple = (project in file("./scala-tuple")).dependsOn(core)
val sample     = (project in file("./sample")).dependsOn(core)
val asunaJmh     = (project in file("./asuna-jmh")).dependsOn(core)
val testkit    = (project in file("./testkit")).dependsOn(core, scalaTuple)
lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).aggregate(scalaTuple).aggregate(testkit)

val codegen = project in file("./codegen")
AsunaSettings.scalaVersionSettings

addCommandAlias(
  "sfmt",
  ";core/scalafmt" +
    ";core/test:scalafmt" +
    ";scalaTuple/scalafmt" +
    ";scalaTuple/test:scalafmt" +
    ";codegen/scalafmt" +
    ";testkit/scalafmt" +
    ";testkit/test:scalafmt" +
    ";sample/scalafmt" +
    ";scalafmtSbt" + ";asunaJmh/scalafmt"
)

addCommandAlias(
  "codegen",
  ";codegen/runMain asuna.codegen.AsunaCoreCodeGeneration" +
    ";codegen/runMain asuna.codegen.AsunaTestKitCodeGeneration" +
    ";codegen/runMain asuna.codegen.tuple.AsunaTupleCodeGeneration"
)

addCommandAlias("gen", ";codegen;sfmt;sfmt;sfmt;sfmt")

addCommandAlias("jmh1", "asunaJmh/jmh:run -i 3 -wi 3 -f 1 -t 1 .*AbcTest.*")
addCommandAlias("jmh2", "asunaJmh/jmh:run -i 3 -wi 3 -f 1 -t 1 .*DefTest.*")
