scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.11.12", "2.12.7")

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" % Test

libraryDependencies += "com.geirsson" %% "scalafmt-core" % "1.6.0-RC4"

lazy val core = (project in file("../core"))

dependsOn(core)

libraryDependencies ++= Seq(
"org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided"
)

scalafmtOnCompile := true
