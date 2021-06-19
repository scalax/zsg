import sbt._
import sbt.Keys._

object ZsgSettings {

  val currentScalaVersion = "2.13.6"
  val scala212Version     = "2.12.14"
  val scala211Version     = "2.11.12"
  val dottyVersion        = "3.0.0"

  val setting1 = scalaVersion := currentScalaVersion
  val setting2 = crossScalaVersions := Seq(scala211Version, scala212Version, currentScalaVersion)
  val setting3 = scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-encoding",
    "utf-8" /*"-language:Scala2", "-Ywarn-unused-import", "-Xlog-implicits"*/
  )
  val setting4 = org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
  val setting5 = transitiveClassifiers := Seq("sources")
  val setting6 = crossScalaVersions := Seq(dottyVersion, scala212Version, scala211Version, currentScalaVersion)
  val setting7 = packageDoc / publishArtifact := false
  val setting8 = crossScalaVersions := Seq(scala212Version, currentScalaVersion)
  val setting9 = scalaVersion := currentScalaVersion
  val setting10 = Compile / unmanagedSourceDirectories ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 11)) => Seq(sourceDirectory.value / "main" / "scala-2.11")
      case Some((2, 12)) => Seq(sourceDirectory.value / "main" / "scala-2.12")
      case Some((2, 13)) => Seq(sourceDirectory.value / "main" / "scala-2.13")
      case Some((2, _))  => Seq(sourceDirectory.value / "main" / "scala-2")
      case Some((3, _))  => Seq(sourceDirectory.value / "main" / "scala-3")
      case _             => Seq.empty
    }
  }
  val setting11 = Test / unmanagedSourceDirectories ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 11)) => Seq(sourceDirectory.value / "test" / "scala-2.11")
      case Some((2, 12)) => Seq(sourceDirectory.value / "test" / "scala-2.12")
      case Some((2, 13)) => Seq(sourceDirectory.value / "main" / "scala-2.13")
      case Some((2, _))  => Seq(sourceDirectory.value / "test" / "scala-2")
      case Some((3, _))  => Seq(sourceDirectory.value / "test" / "scala-3")
      case _             => Seq.empty
    }
  }
  val setting12 = testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")

  val scalaVersionSettings         = Seq(setting1, setting2)
  val scala_2_12_And_2_13_Settings = Seq(setting1, setting8)
  val dottyVersionSettings         = Seq(setting1, setting6)

  val commonSettings = Seq(setting3, setting4, setting5, setting7, setting10, setting11, setting12)

  val vSetting1             = version := "0.0.4-SNAP2020101801"
  val vSetting2             = organization := "org.scalax"
  val vSetting5             = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
  val projectVersionSetting = Seq(vSetting1, vSetting2, vSetting5)

}
