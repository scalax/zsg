val scalaTestVersion = "3.1.0-RC3"

AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

libraryDependencies ++= AsunaSettings.testDependencies.map(_ % Test)
