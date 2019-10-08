val dottyVersion = "2.13.1"

scalaVersion := dottyVersion

version := "0.0.2-SNAP20181211.1"

scalacOptions ++= Seq("-feature", "-deprecation", /*"-language:Scala2",*/ "-encoding", "utf-8", "-Ywarn-unused-import" /*, "-Xlog-implicits"*/ )

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"
