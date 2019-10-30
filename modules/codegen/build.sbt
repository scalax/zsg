enablePlugins(SbtTwirl)
AsunaSettings.scalaVersionSettings
scalacOptions ++= Seq("-feature", "-deprecation")
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false