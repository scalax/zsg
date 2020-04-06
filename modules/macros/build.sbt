AsunaSettings.scalaVersionSettings
AsunaSettings.commonSettings

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25" % Test)
libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.4"
libraryDependencies += "commons-codec"          % "commons-codec"            % "1.14" % Compile

libraryDependencies ++= AsunaSettings.testDependencies.map(_ % Test)

scalafmtOnCompile in Compile := true
scalafmtOnCompile in Test := false
