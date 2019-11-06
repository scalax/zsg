import sbt._
import sbt.Keys._

object AsunaSettings {

  val currentScalaVersion = "2.13.0"
  val setting1            = scalaVersion := currentScalaVersion
  val setting2            = crossScalaVersions := Seq("2.12.10", currentScalaVersion)
  val setting3            = scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8" /*"-language:Scala2", "-Ywarn-unused-import", "-Xlog-implicits"*/ )
  val setting4            = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

  val scalaVersionSettings = Seq(setting1, setting2)
  val commonSettings       = Seq(setting3, setting4)

  val circeVersion = "0.12.2"

  val circeDependencies = ("io.circe" %% "circe-derivation" % "0.12.0-M7") +: Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  val upickleDependencies = Seq("com.lihaoyi" %% "upickle" % "0.8.0")

  val projectVersionSetting = version := "0.0.2-SNAP20191030.1"

}
