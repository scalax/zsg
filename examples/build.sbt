AsunaSettings.scalaVersionSettings

scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

libraryDependencies ++= AsunaSettings.circeDependencies
