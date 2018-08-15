scalaVersion := "2.12.6"

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")

libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" % Test

lazy val core = (project in file("../core"))

dependsOn(core)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

libraryDependencies ++= Seq(
  "org.typelevel" %% "export-hook" % "1.2.0",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided"
)