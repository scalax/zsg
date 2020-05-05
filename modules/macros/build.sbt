AsunaSettings.dottyVersionSettings
AsunaSettings.commonSettings

libraryDependencies ++= Dependencies.scalaReflect(scalaVersion.value)
libraryDependencies ++= Dependencies.slf4j.map(_ % Test)
libraryDependencies ++= {
  if ((scalaVersion.value startsWith "2.11.") || (scalaVersion.value startsWith "2.12.") || (scalaVersion.value startsWith "2.13.")) {
    List(Dependencies.scalaCollectionCompat)
  } else {
    List.empty
  }
}

libraryDependencies += Dependencies.commonsCodec % Compile

libraryDependencies ++= Dependencies.testDependencies(scalaVersion.value).map(_ % Test)
