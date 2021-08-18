import org.scalafmt.sbt.ScalafmtPlugin
import sbt._
import sbt.Keys._
import sbtghactions.GenerativeKeys._
import sbtghactions._

object ZsgSettings {

  val currentScalaVersion = "2.13.6"
  val scala212Version     = "2.12.14"
  val scala211Version     = "2.11.12"
  val dottyVersion        = "3.0.1"

  val setting1 = scalaVersion       := currentScalaVersion
  val setting2 = crossScalaVersions := Seq(scala211Version, scala212Version, currentScalaVersion)

  val setting6 = crossScalaVersions := Seq(dottyVersion, scala212Version, scala211Version, currentScalaVersion)

  val setting8 = crossScalaVersions := Seq(scala212Version, currentScalaVersion)
  val setting9 = scalaVersion       := currentScalaVersion

  val githubWorkflowSettings = Seq(
    ThisBuild / githubWorkflowJavaVersions          := Seq("adopt@1.8"),
    ThisBuild / githubWorkflowScalaVersions         := (ThisBuild / crossScalaVersions).value.tail,
    ThisBuild / githubWorkflowPublishTargetBranches := Nil,
    ThisBuild / githubWorkflowBuild := Seq(
      WorkflowStep.Use(UseRef.Public("ruby", "setup-ruby", "v1"), params = Map("ruby-version" -> "2.7"), name = Some("Set up Ruby")),
      WorkflowStep.Run(
        List("gem install sass", "gem install jekyll -v 4.0.0"),
        name = Some("Install Jekyll")
      ),
      WorkflowStep.Sbt(
        List("clean", "coverage"),
        id = None,
        name = Some("Test")
      ),
      WorkflowStep.Sbt(
        List("coverageReport"),
        id = None,
        name = Some("Coverage")
      ),
      WorkflowStep.Use(
        UseRef.Public(
          "codecov",
          "codecov-action",
          "v1"
        )
      )
    )
  )

  val scalaVersionSettings         = Seq(setting1, setting2)
  val scala_2_12_And_2_13_Settings = Seq(setting1, setting8)
  val dottyVersionSettings         = Seq(setting1, setting6)

  val commonSettings = Seq(
    scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8"),
    ScalafmtPlugin.autoImport.scalafmtOnCompile := false,
    transitiveClassifiers                       := Seq("sources"),
    packageDoc / publishArtifact                := false,
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework"),
    Compile / unmanagedSourceDirectories ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, 11)) => Seq(sourceDirectory.value / "main" / "scala-2.11")
        case Some((2, 12)) => Seq(sourceDirectory.value / "main" / "scala-2.12")
        case Some((2, 13)) => Seq(sourceDirectory.value / "main" / "scala-2.13")
        case Some((2, _))  => Seq(sourceDirectory.value / "main" / "scala-2")
        case Some((3, _))  => Seq(sourceDirectory.value / "main" / "scala-3")
        case _             => Seq.empty
      }
    },
    Test / unmanagedSourceDirectories ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, 11)) => Seq(sourceDirectory.value / "test" / "scala-2.11")
        case Some((2, 12)) => Seq(sourceDirectory.value / "test" / "scala-2.12")
        case Some((2, 13)) => Seq(sourceDirectory.value / "test" / "scala-2.13")
        case Some((2, _))  => Seq(sourceDirectory.value / "test" / "scala-2")
        case Some((3, _))  => Seq(sourceDirectory.value / "test" / "scala-3")
        case _             => Seq.empty
      }
    }
  )

  val vSetting1             = version      := "0.0.5-SNAP2021080902"
  val vSetting2             = organization := "org.scalax.zsg"
  val vSetting5             = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
  val projectVersionSetting = Seq(vSetting1, vSetting2, vSetting5)

}
