AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

Dependices.scalaReflect
libraryDependencies ++= Dependices.slf4j.map(_ % Test)
libraryDependencies += Dependices.scalaCollectionCompat
libraryDependencies += Dependices.commonsCodec % Compile

libraryDependencies ++= Dependices.testDependencies.map(_ % Test)
