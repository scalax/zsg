val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

//libraryDependencies ++= AsunaSettings.circeDependencies.map(_ % Test)
//libraryDependencies += "com.lihaoyi"    %% "upickle"      % "0.8.0" % Test
//libraryDependencies += "org.scalatest"  %% "scalatest"    % scalaTestVersion % Test
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25")
