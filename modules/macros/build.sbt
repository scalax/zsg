AsunaSettings.scala_2_12_And_2_13_Settings
AsunaSettings.commonSettings

Dependices.scalaReflect
libraryDependencies ++= Dependices.slf4j.map(_ % Test)
libraryDependencies += Dependices.scalaCollectionCompat
libraryDependencies += Dependices.commonsCodec % Compile

libraryDependencies ++= Dependices.testDependencies.map(_ % Test)
