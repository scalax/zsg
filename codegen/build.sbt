enablePlugins(SbtTwirl)
scalaVersion := "2.12.7"
scalacOptions ++= Seq("-feature", "-deprecation")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false