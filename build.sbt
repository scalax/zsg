lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core)
lazy val core = project in file("./core")
scalaVersion := "2.13.1"