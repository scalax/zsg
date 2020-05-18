ZsgSettings.dottyVersionSettings
ZsgSettings.commonSettings

libraryDependencies ++= Dependencies.testDependencies(scalaVersion.value).map(_ % Test)
