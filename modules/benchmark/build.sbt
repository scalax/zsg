CommonSettings.settings

ZsgSettings.settings.dottyVersion

libraryDependencies ++= Dependencies.circeDependencies(scalaVersion.value)
libraryDependencies ++= Dependencies.upickleDependencies

enablePlugins(JmhPlugin)
