import sbt._
import sbt.Keys._

object Dependencies {

  object versions {
    val circe_2_11            = "0.11.2"
    val circe_2_13            = "0.15.0-M1"
    val zio                   = "2.0.0-M3"
    val slick                 = "2.0.0-M3"
    val slf4j                 = "1.7.32"
    val collectionCompat = "2.6.0"
    val commonsCodec          = "1.14"
    val commonsIO             = "2.6"
  }

  def circeDependencies(scalaVersion: String): Seq[ModuleID] = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, 11)) =>
      List(
        "io.circe" %% "circe-derivation" % "0.11.0-M3",
        "io.circe" %% "circe-core"       % versions.circe_2_11,
        "io.circe" %% "circe-generic"    % versions.circe_2_11,
        "io.circe" %% "circe-parser"     % versions.circe_2_11
      )
    case Some((2, x)) if x >= 12 =>
      List(
        "io.circe" %% "circe-derivation" % "0.13.0-M5",
        "io.circe" %% "circe-core"       % versions.circe_2_13,
        "io.circe" %% "circe-generic"    % versions.circe_2_13,
        "io.circe" %% "circe-parser"     % versions.circe_2_13
      )
    case _ =>
      List(
        "io.circe" %% "circe-core"    % versions.circe_2_13,
        "io.circe" %% "circe-generic" % versions.circe_2_13,
        "io.circe" %% "circe-parser"  % versions.circe_2_13
      )
  }

  val zioTest = List(
    "dev.zio" %% "zio-test"     % versions.zio % "test",
    "dev.zio" %% "zio-test-sbt" % versions.zio % "test"
  )

  val slick = List(
    "com.typesafe.slick" %% "slick"         % versions.slick,
    "com.typesafe.slick" %% "slick-codegen" % versions.slick
  )

  val upickleDependencies = List("com.lihaoyi" %% "upickle" % "1.4.1")

  def scalaReflect(scalaVersion: String) = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, _)) => List("org.scala-lang" % "scala-reflect" % scalaVersion)
    case _            => List.empty
  }

  val slf4j = "org.slf4j" % "slf4j-simple" % versions.slf4j

  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % versions.collectionCompat

  val commonsCodec = "commons-codec" % "commons-codec" % versions.commonsCodec

  val commonsIo = "commons-io" % "commons-io" % versions.commonsIO

}
