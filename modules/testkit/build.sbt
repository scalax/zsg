val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings

AsunaSettings.commonSettings

libraryDependencies ++= AsunaSettings.circeDependencies
libraryDependencies ++= AsunaSettings.upickleDependencies
libraryDependencies += "org.scalatest"  %% "scalatest"    % scalaTestVersion % Test
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
