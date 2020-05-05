AsunaSettings.scalaVersionSettings

AsunaSettings.commonSettings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
//libraryDependencies ++= Dependices.upickleDependencies
libraryDependencies ++= Dependencies.testDependencies(scalaVersion.value).map(_ % Test)
