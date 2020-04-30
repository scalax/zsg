AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

Dependencies.scalaReflect
libraryDependencies ++= Dependencies.slf4j.map(_ % Test)
libraryDependencies += Dependencies.scalaCollectionCompat
libraryDependencies += Dependencies.commonsCodec % Compile

libraryDependencies ++= Dependencies.testDependencies.map(_ % Test)
