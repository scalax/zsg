ZsgSettings.dottyVersionSettings
ZsgSettings.commonSettings

libraryDependencies ++= Dependencies.scalaReflect(scalaVersion.value)
libraryDependencies ++= Dependencies.slf4j.map(_ % Test)
libraryDependencies ++= Dependencies.scalaCollectionCompat(scalaVersion.value)

libraryDependencies += Dependencies.commonsCodec % Compile

libraryDependencies ++= Dependencies.testDependencies(scalaVersion.value).map(_ % Test)
