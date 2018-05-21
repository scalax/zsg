scalaVersion := "2.12.5"

scalacOptions ++= Seq("-feature", "-deprecation")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)

lazy val core = (project in file("./core"))
lazy val shape = (project in file("./shape"))

lazy val main = (project in file(".")).dependsOn(core).dependsOn(shape).aggregate(core).aggregate(shape)