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

  val githubWorkflowSettings = Seq(
    ThisBuild / githubWorkflowJavaVersions          := Seq("adopt@1.8"),
    ThisBuild / githubWorkflowScalaVersions         := Seq(scala212Version, scala211Version, currentScalaVersion),
    ThisBuild / githubWorkflowPublishTargetBranches := Nil,
    ThisBuild / githubWorkflowBuild := Seq(
      WorkflowStep.Sbt(List("clean", "coverage", "test"), id = None, name = Some("Test")),
      WorkflowStep.Sbt(List("coverageReport"), id = None, name = Some("Coverage")),
      WorkflowStep.Use(UseRef.Public("codecov", "codecov-action", "v1"))
    )
  )

  val scalaVersionSettings         = Seq(setting1, setting2)
  val scala_2_12_And_2_13_Settings = Seq(setting1, setting8)
  val dottyVersionSettings         = Seq(setting1, setting6)

}
