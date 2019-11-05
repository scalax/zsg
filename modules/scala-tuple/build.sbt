val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings
scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "utf-8")

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % Test
