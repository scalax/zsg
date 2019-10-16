import sbt._
import sbt.Keys._

object AsunaSettings {

  val currentScalaVersion = "2.13.0"
  val setting1            = scalaVersion := currentScalaVersion
  val setting2            = crossScalaVersions := Seq("2.12.10", currentScalaVersion)

  val scalaVersionSettings = Seq(setting1, setting2)

  val circeVersion = "0.12.2"

  val circeDependencies = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

}
