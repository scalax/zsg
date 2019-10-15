val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings

scalacOptions ++= Seq("-feature", "-deprecation", /*"-language:Scala2",*/ "-encoding", "utf-8" /*"-Ywarn-unused-import", "-Xlog-implicits"*/)
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

val circeVersion = "0.12.2"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion % Test)

libraryDependencies += "com.lihaoyi" %% "upickle" % "0.8.0" % Test

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % Test

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value