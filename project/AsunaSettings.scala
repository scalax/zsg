import sbt._
import sbt.Keys._
import bintray.BintrayKeys._

object AsunaSettings {

  val currentScalaVersion = "2.13.1"
  val scala212Version     = "2.12.11"
  val scala211Version     = "2.11.12"
  val dottyVersion        = "0.22.0-RC1"

  val setting1 = scalaVersion := currentScalaVersion
  val setting2 = crossScalaVersions := Seq(scala211Version, scala212Version, currentScalaVersion)
  val setting3 = scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8" /*"-language:Scala2", "-Ywarn-unused-import", "-Xlog-implicits"*/ )
  val setting4 = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
  val setting5 = transitiveClassifiers := Seq("sources")
  val setting6 = crossScalaVersions := Seq(dottyVersion, scala212Version, scala211Version, currentScalaVersion)
  val setting7 = publishArtifact in packageDoc := false
  val setting8 = crossScalaVersions := Seq(scala212Version, currentScalaVersion)

  val scalaVersionSettings         = Seq(setting1, setting2)
  val scala_2_12_And_2_13_Settings = Seq(setting1, setting8)

  val commonSettings = Seq(setting3, setting4, setting5, setting7)

  val dottyVersionSettings = Seq(setting1, setting6)

  val vSetting1             = version := "0.0.3-20200325SNAP1"
  val vSetting2             = organization := "org.scalax"
  val vSetting3             = bintrayOrganization := Some("scalax")
  val vSetting4             = bintrayRepository := "asuna"
  val vSetting5             = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
  val vSetting6             = bintrayVcsUrl := Some("https://github.com/scalax/asuna.git")
  val projectVersionSetting = Seq(vSetting1, vSetting2, vSetting3, vSetting4, vSetting5, vSetting6)

}
