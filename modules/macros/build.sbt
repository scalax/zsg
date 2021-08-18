ZsgSettings.dottyVersionSettings
CommonSettings.settings

libraryDependencies ++= Dependencies.scalaReflect(scalaVersion.value)
libraryDependencies ++= Dependencies.slf4j.map(_ % Test)
libraryDependencies += Dependencies.scalaCollectionCompat

libraryDependencies += Dependencies.commonsCodec % Compile

libraryDependencies ++= Dependencies.zioTest
