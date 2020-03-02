AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25" % Test)

libraryDependencies ++= AsunaSettings.testDependencies.map(_ % Test)
