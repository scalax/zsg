scalaVersion := "2.12.5"

scalacOptions ++= Seq("-feature", "-deprecation")

val slickVersion = "3.2.3"

libraryDependencies += "com.typesafe.slick" %% "slick" % slickVersion

libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % slickVersion exclude("com.zaxxer", "HikariCP-java6")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "com.h2database" % "h2" % "1.4.197" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" % Test

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)

libraryDependencies ++= {
  val playV = "2.6.13"
  Seq(
    "com.typesafe.play" %% "play" % playV,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    "com.typesafe.play" %% "play-ws" % playV % Test
  )
}

lazy val core = (project in file("./core"))

lazy val main = (project in file(".")).dependsOn(core).aggregate(core)