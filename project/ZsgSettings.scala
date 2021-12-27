import sbt._
import sbt.Keys._
import sbtghactions.GenerativeKeys._
import sbtghactions._

object ZsgSettings {

  object versions {
    val currentScala = "2.13.6"
    val scala212     = "2.12.14"
    val scala211     = "2.11.12"
    val dotty        = "3.1.0"
  }

  private val commonScalaVersionSetting = scalaVersion       := versions.dotty
  private val setting2                  = crossScalaVersions := Seq(versions.scala211, versions.scala212, versions.currentScala)
  private val setting3                  = scalaVersion       := versions.currentScala
  private val setting6 = crossScalaVersions := Seq(versions.dotty, versions.scala212, versions.scala211, versions.currentScala)
  private val setting8 = crossScalaVersions := Seq(versions.scala212, versions.currentScala)

  val githubWorkflowSettings = Seq(
    ThisBuild / githubWorkflowJavaVersions          := Seq("adopt@1.8"),
    ThisBuild / githubWorkflowScalaVersions         := Seq(versions.scala212, versions.scala211, versions.currentScala),
    ThisBuild / githubWorkflowPublishTargetBranches := Nil,
    ThisBuild / githubWorkflowBuild := Seq(
      WorkflowStep.Sbt(List("clean", "coverage", "test"), id = None, name = Some("Test")),
      WorkflowStep.Sbt(List("coverageReport"), id = None, name = Some("Coverage")),
      WorkflowStep.Use(UseRef.Public("codecov", "codecov-action", "v1"))
    )
  )

  object settings {
    val scalaVersion        = Seq(commonScalaVersionSetting, setting2)
    val scala_2_12_And_2_13 = Seq(setting3, setting8)
    val dottyVersion        = Seq(commonScalaVersionSetting, setting6)
  }

}
