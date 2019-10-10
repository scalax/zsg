scalaVersion := "2.12.7"
scalacOptions ++= Seq("-feature", "-deprecation", /*"-language:Scala2",*/ "-encoding", "utf-8" /*"-Ywarn-unused-import", "-Xlog-implicits"*/)
org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false
bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value