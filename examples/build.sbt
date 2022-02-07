ZsgSettings.settings.scalaVersion
CommonSettings.settings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
libraryDependencies += Dependencies.scalaCollectionCompat
