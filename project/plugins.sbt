ThisBuild / useCoursier := false

addSbtPlugin("org.scalameta"      % "sbt-scalafmt"  % "2.2.1")
addSbtPlugin("org.scoverage"      % "sbt-scoverage" % "1.6.1")
addSbtPlugin("org.foundweekends"  % "sbt-bintray"   % "0.5.4")
addSbtPlugin("com.github.gseitz"  % "sbt-release"   % "1.0.9")
addSbtPlugin("com.typesafe.sbt"   % "sbt-twirl"     % "1.4.2")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"       % "0.3.7")
addSbtPlugin("ch.epfl.lamp"       % "sbt-dotty"     % "0.3.4")
