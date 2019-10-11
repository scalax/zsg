scalaVersion := "2.12.7"

scalacOptions ++= Seq("-feature", "-deprecation", /*"-language:Scala2",*/ "-encoding", "utf-8" /*"-Ywarn-unused-import", "-Xlog-implicits"*/)
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

val circeVersion = "0.12.2"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value