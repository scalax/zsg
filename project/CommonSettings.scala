import org.scalafmt.sbt.ScalafmtPlugin
import org.scalafmt.sbt.ScalafmtPlugin.autoImport._
import sbt._
import sbt.Keys._

object CommonSettings {

  private val scalaOptionSettings = scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8")
  private val scalafmtSettings    = ScalafmtPlugin.autoImport.scalafmtOnCompile := true
  private val scalafmtCheckSettings = scalafmtCheckAll := {
    (Compile / scalafmtSbtCheck).value
    (Compile / scalafmtCheck).value
    (Test / scalafmtCheck).value
  }
  private val scalafmtSettings2 = scalafmtAll := {
    (Compile / scalafmtSbt).value
    (Compile / scalafmt).value
    (Test / scalafmt).value
  }
  private val packageSettings = Seq(transitiveClassifiers := Seq("sources"), packageDoc / publishArtifact := false)
  private val testSettings    = testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")

  def addDirectory(sourceFile: File, c: String, parVersion: Option[(Long, Long)]): Seq[File] = parVersion match {
    case Some((2, 11)) =>
      Seq(sourceFile / c / "scala-2", sourceFile / c / "scala-2.11", sourceFile / c / "scala-2.11-2.12")
    case Some((2, 12)) =>
      Seq(sourceFile / c / "scala-2", sourceFile / c / "scala-2.11-2.12", sourceFile / c / "scala-2.12", sourceFile / c / "scala-2.12-2.13")
    case Some((2, 13)) =>
      Seq(sourceFile / c / "scala-2", sourceFile / c / "scala-2.12-2.13", sourceFile / c / "scala-2.13")
    case Some((2, _)) => Seq(sourceFile / c / "scala-2")
    case Some((3, _)) => Seq(sourceFile / c / "scala-3")
    case _            => Seq.empty
  }

  private val mainDirSetting = Compile / unmanagedSourceDirectories ++= {
    addDirectory(sourceDirectory.value, "main", CrossVersion.partialVersion(scalaVersion.value)) ++: addDirectory(
      sourceDirectory.value,
      "codegen",
      CrossVersion.partialVersion(scalaVersion.value)
    )
  }
  private val testDirSetting = Test / unmanagedSourceDirectories ++= {
    addDirectory(sourceDirectory.value, "test", CrossVersion.partialVersion(scalaVersion.value))
  }

  val settings =
    scalafmtSettings +:
      scalafmtCheckSettings +:
      scalafmtSettings2 +:
      mainDirSetting +:
      testDirSetting +:
      scalaOptionSettings +:
      testSettings +:
      packageSettings

  object project {
    val version      = "0.0.5-SNAP2021091203"
    val organization = "org.scalax.zsg"
    val license      = "MIT"
    val licenseUrl   = "http://opensource.org/licenses/MIT"
  }

  private val versionSetting      = version      := project.version
  private val organizationSetting = organization := project.organization
  private val licensesSetting     = licenses += (project.license, url(project.licenseUrl))

  val projectVersionSetting = Seq(versionSetting, organizationSetting, licensesSetting)

}
