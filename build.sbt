scalaVersion := "2.12.5"

scalacOptions ++= Seq("-feature", "-deprecation")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)

lazy val core = (project in file("./core"))
lazy val shapeless = (project in file("./shapeless"))

lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).dependsOn(shapeless).aggregate(shapeless)