AsunaSettings.scalaVersionSettings

AsunaSettings.commonSettings

libraryDependencies ++= AsunaSettings.circeDependencies
libraryDependencies ++= AsunaSettings.upickleDependencies
libraryDependencies ++= AsunaSettings.testDependencies.map(_ % Test)
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

scalafmtOnCompile := true
