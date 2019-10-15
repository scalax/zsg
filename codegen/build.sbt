enablePlugins(SbtTwirl)
scalaVersion := "2.13.0"
scalacOptions ++= Seq("-feature", "-deprecation")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false