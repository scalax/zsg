AsunaSettings.dottyVersionSettings
AsunaSettings.commonSettings

libraryDependencies ++= Dependencies.testDependencies(scalaVersion.value).map(_ % Test)
