val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings

scalacOptions ++= Seq("-feature", "-deprecation", /*"-language:Scala2",*/ "-encoding", "utf-8" /*"-Ywarn-unused-import", "-Xlog-implicits"*/ )

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

//libraryDependencies ++= AsunaSettings.circeDependencies.map(_ % Test)
//libraryDependencies += "com.lihaoyi"    %% "upickle"      % "0.8.0" % Test
//libraryDependencies += "org.scalatest"  %% "scalatest"    % scalaTestVersion % Test
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25")
