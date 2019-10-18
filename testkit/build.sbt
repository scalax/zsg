val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings

scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

libraryDependencies ++= AsunaSettings.circeDependencies.map(_ % Test)

libraryDependencies += "com.lihaoyi" %% "upickle" % "0.8.0" % Test

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % Test

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
