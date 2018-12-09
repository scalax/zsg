import sbt._
import Keys._
import bintray.BintrayKeys._

object Common {

  val versionSetting = version := "0.0.2-SNAP20181103.1"
  val scalaSettings = Seq(
      scalaVersion := "2.12.7"
    , crossScalaVersions := Seq("2.11.12", "2.12.7")
    , scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import" /*, "-Xlog-implicits"*/ )
    , org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
    , bintrayOrganization := Some("scalax")
    , bintrayRepository := "asuna"
  )

}
