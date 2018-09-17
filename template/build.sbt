scalaVersion := "2.12.6"

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import")

enablePlugins(SbtTwirl)

scalafmtOnCompile := true