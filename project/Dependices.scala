import sbt._
import sbt.Keys._

object Dependices {

  val scalaTestVersion = "3.1.1"

  def circeDependencies: Def.Setting[Seq[ModuleID]] = libraryDependencies ++= {
    if (scalaVersion.value startsWith "2.11.") {
      ("io.circe" %% "circe-derivation" % "0.11.0-M3") +: Seq(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.11.2")
    } else {
      ("io.circe" %% "circe-derivation" % "0.13.0-M4") +: Seq(
        "io.circe" %% "circe-core",
        "io.circe" %% "circe-generic",
        "io.circe" %% "circe-parser"
      ).map(_ % "0.13.0")
    }
  }

  val testDependencies = Seq("org.scalatest" %% "scalatest" % scalaTestVersion)

  val upickleDependencies = Seq("com.lihaoyi" %% "upickle" % "0.9.5")

  def scalaReflect = libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

  val slf4j = Seq("org.slf4j" % "slf4j-simple" % "1.7.25")

  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4"

  val commonsCodec = "commons-codec" % "commons-codec" % "1.14"

  val commonsIo = "commons-io" % "commons-io" % "2.6"

  val junit = Seq("com.novocode" % "junit-interface" % "0.11")

}
