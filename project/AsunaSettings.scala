import sbt._
import sbt.Keys._
import bintray.BintrayKeys._

object AsunaSettings {

  val currentScalaVersion = "2.13.0"
  val scala_2_12_Version  = "2.12.10"
  val circeVersion        = "0.12.2"
  val scalaTestVersion    = "3.1.0-RC3"

  val setting1 = scalaVersion := currentScalaVersion
  val setting2 = crossScalaVersions := Seq(scala_2_12_Version, currentScalaVersion)
  val setting3 = scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8" /*"-language:Scala2", "-Ywarn-unused-import", "-Xlog-implicits"*/ )
  val setting4 = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

  val scalaVersionSettings = Seq(setting1, setting2)
  val commonSettings       = Seq(setting3, setting4)

  val circeDependencies = ("io.circe" %% "circe-derivation" % "0.12.0-M7") +: Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  val testDependencies = Seq("org.scalatest" %% "scalatest" % scalaTestVersion)

  val upickleDependencies = Seq("com.lihaoyi" %% "upickle" % "0.8.0")

  val vSetting1             = version := "0.0.2-SNAP20191113.1"
  val vSetting2             = organization := "org.scalax"
  val vSetting3             = bintrayOrganization := Some("scalax")
  val vSetting4             = bintrayRepository := "asuna"
  val vSetting5             = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
  val vSetting6             = bintrayVcsUrl := Some("https://github.com/scalax/asuna.git")
  val projectVersionSetting = Seq(vSetting1, vSetting2, vSetting3, vSetting4, vSetting5, vSetting6)

}
