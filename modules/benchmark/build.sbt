scalacOptions ++= Seq("-feature", "-deprecation",  "-encoding", "utf-8"  )

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

AsunaSettings.scalaVersionSettings

libraryDependencies ++= AsunaSettings.circeDependencies
libraryDependencies ++= AsunaSettings.upickleDependencies

enablePlugins(JmhPlugin)