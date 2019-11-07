AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

bintrayOrganization := Some("scalax")
bintrayRepository := "asuna"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25")
