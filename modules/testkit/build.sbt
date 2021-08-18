ZsgSettings.scalaVersionSettings
CommonSettings.settings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
//libraryDependencies ++= Dependices.upickleDependencies
libraryDependencies ++= Dependencies.zioTest
