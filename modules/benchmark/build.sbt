CommonSettings.settings

ZsgSettings.dottyVersionSettings

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
libraryDependencies ++= Dependencies.upickleDependencies

enablePlugins(JmhPlugin)
