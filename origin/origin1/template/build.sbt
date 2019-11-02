scalaVersion := "2.12.7"

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")

enablePlugins(SbtTwirl)

scalafmtOnCompile := false