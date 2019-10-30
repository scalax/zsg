scalacOptions ++= Seq("-feature", "-deprecation",  "-encoding", "utf-8"  )

org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile := false

AsunaSettings.scalaVersionSettings

libraryDependencies ++= AsunaSettings.circeDependencies
libraryDependencies += "com.lihaoyi" %% "upickle" % "0.8.0"

enablePlugins(JmhPlugin)