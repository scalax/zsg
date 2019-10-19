val core       = project in file("./core")
val sample     = (project in file("./sample")).dependsOn(core)
val testkit    = (project in file("./testkit")).dependsOn(core)
lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).aggregate(testkit)

val codegen = project in file("./codegen")
AsunaSettings.scalaVersionSettings

addCommandAlias("sfmt", ";core/scalafmt" +
  ";core/test:scalafmt" +
  ";codegen/scalafmt" +
  ";testkit/scalafmt" +
  ";testkit/test:scalafmt" +
  ";sample/scalafmt")
