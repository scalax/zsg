val dottyVersion = "0.19.0-RC1"

scalaVersion := dottyVersion

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

version := "0.0.2-SNAP20181211.1"

scalacOptions ++= Seq(
  "-feature",
  /*"-deprecation", "-language:Scala2",*/ "-encoding", "utf-8" /*, "-Ywarn-unused-import" , "-Xlog-implicits"*/ )

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"
