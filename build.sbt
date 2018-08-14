scalaVersion := "2.12.6"

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import"/*, "-Xlog-implicits"*/)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

//addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)

lazy val core = (project in file("./core"))
lazy val helper = (project in file("./helper"))

lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).dependsOn(helper).aggregate(helper)