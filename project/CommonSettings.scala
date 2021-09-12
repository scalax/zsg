import org.scalafmt.sbt.ScalafmtPlugin
import sbt._
import sbt.Keys._

object CommonSettings {

  private val scalaOptionSettings = scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8")
  private val scalafmtSettings    = ScalafmtPlugin.autoImport.scalafmtOnCompile := true
  private val packageSettings     = Seq(transitiveClassifiers := Seq("sources"), packageDoc / publishArtifact := false)
  private val testSettings        = testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  private val dirSettings = Seq(
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

  val settings = Seq(scalaOptionSettings, scalafmtSettings, testSettings) ++: packageSettings ++: dirSettings

  private val versionSetting      = version      := "0.0.5-SNAP2021080902"
  private val organizationSetting = organization := "org.scalax.zsg"
  private val licensesSetting     = licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

  val projectVersionSetting = Seq(versionSetting, organizationSetting, licensesSetting)

}
