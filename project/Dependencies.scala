import sbt._
import sbt.Keys._

object Dependencies {

  val scalaTestVersion = "3.1.1"

  val circeDependencies: Def.Setting[Seq[ModuleID]] = libraryDependencies ++= {
    if (scalaVersion.value startsWith "2.11.") {
      ("io.circe" %% "circe-derivation" % "0.11.0-M3") :: List(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.11.2")
    } else {
      ("io.circe" %% "circe-derivation" % "0.13.0-M4") :: List(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.13.0")
    }
  }

  val slickVersion = "3.3.2"
  val slick = List(
    "com.typesafe.slick" %% "slick"         % slickVersion,
    "com.typesafe.slick" %% "slick-codegen" % slickVersion
  )

  val testDependencies = Seq("org.scalatest" %% "scalatest" % scalaTestVersion)

  val upickleDependencies = Seq("com.lihaoyi" %% "upickle" % "0.9.5")

  def scalaReflect = libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

  val slf4j = List("org.slf4j" % "slf4j-simple" % "1.7.25")

  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4"

  val commonsCodec = "commons-codec" % "commons-codec" % "1.14"

  val commonsIo = "commons-io" % "commons-io" % "2.6"

  val junit = List("com.novocode" % "junit-interface" % "0.11")

}
