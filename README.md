zsg
===========================================
[![Build status](https://img.shields.io/github/workflow/status/scalax/zsg/Continuous%20Integration.svg)](https://github.com/scalax/zsg/actions)
[![codecov](https://codecov.io/gh/scalax/zsg/branch/master/graph/badge.svg)](https://codecov.io/gh/scalax/zsg)

zsg is a Scala generic library based on code generation.

How to use this library:

```scala
resolvers += Resolver.bintrayRepo("scalax", "zsg")

libraryDependencies ++= Seq("org.scalax" %% "zsg-macros"      % "0.0.3")
libraryDependencies ++= Seq("org.scalax" %% "zsg-scala-tuple" % "0.0.3")
```
