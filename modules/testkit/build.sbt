ZsgSettings.scalaVersionSettings
ZsgSettings.commonSettings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
//libraryDependencies ++= Dependices.upickleDependencies
libraryDependencies ++= Dependencies.zioTest
