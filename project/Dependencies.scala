import sbt._
import sbt.Keys._

object Dependencies {

  val circe_2_11_version  = "0.11.2"
  val circe_2_13_version  = "0.13.0"
  val circe_dotty_version = "0.14.0-M1"
  def circeDependencies(scalaVersion: String): Seq[ModuleID] = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, 11)) =>
      List(
        "io.circe" %% "circe-derivation" % "0.11.0-M3",
        "io.circe" %% "circe-core"       % circe_2_11_version,
        "io.circe" %% "circe-generic"    % circe_2_11_version,
        "io.circe" %% "circe-parser"     % circe_2_11_version
      )
    case Some((2, x)) if x >= 12 =>
      List(
        "io.circe" %% "circe-derivation" % "0.13.0-M4",
        "io.circe" %% "circe-core"       % circe_2_13_version,
        "io.circe" %% "circe-generic"    % circe_2_13_version,
        "io.circe" %% "circe-parser"     % circe_2_13_version
      )
    case _ =>
      List(
        "io.circe" %% "circe-core"    % circe_dotty_version,
        "io.circe" %% "circe-generic" % circe_dotty_version,
        "io.circe" %% "circe-parser"  % circe_dotty_version
      )
  }

  val zioVersion = "1.0.1"
  val zioTest = List(
    "dev.zio" %% "zio-test"     % zioVersion % "test",
    "dev.zio" %% "zio-test-sbt" % zioVersion % "test" // ,
    // "dev.zio" %% "zio-test-magnolia" % zioVersion % "test" // optional
  )

  val slickVersion = "3.3.3"
  val slick = List(
    "com.typesafe.slick" %% "slick"         % slickVersion,
    "com.typesafe.slick" %% "slick-codegen" % slickVersion
  )

  // def testDependencies(scalaVersion: String) = if (scalaVersion startsWith "0.") junit else List("org.scalatest" %% "scalatest" % "3.1.1") ::: junit

  def upickleDependencies(scalaVersion: String) = if (scalaVersion startsWith "0.") List.empty else List("com.lihaoyi" %% "upickle" % "0.9.5")

  def scalaReflect(scalaVersion: String) = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, _)) => List("org.scala-lang" % "scala-reflect" % scalaVersion)
    case _            => List.empty
  }

  val slf4j = List("org.slf4j" % "slf4j-simple" % "1.7.25")

  def scalaCollectionCompat(scalaVersion: String) = CrossVersion.partialVersion(scalaVersion) match {
    case Some((2, _)) => List("org.scala-lang.modules" %% "scala-collection-compat" % "2.2.0")
    case _            => List.empty
  }

  val commonsCodec = "commons-codec" % "commons-codec" % "1.14"

  val commonsIo = "commons-io" % "commons-io" % "2.6"

  val junit = List("com.novocode" % "junit-interface" % "0.11")

}
