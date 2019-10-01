enablePlugins(SbtTwirl)
scalaVersion := "2.12.7"
scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false