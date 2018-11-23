Common.scalaSettings

lazy val core   = (project in file("./core"))
lazy val mapper = (project in file("./mapper"))

lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).dependsOn(mapper).aggregate(mapper)

lazy val template = (project in file("./template"))
