resolvers += Resolver.sonatypeRepo("releases")

val slickVersion = "3.2.3"

libraryDependencies += "com.typesafe.slick" %% "slick" % slickVersion

libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % slickVersion exclude("com.zaxxer", "HikariCP-java6")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "com.h2database" % "h2" % "1.4.197" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" % Test

libraryDependencies += "com.github.javafaker" % "javafaker" % "0.15" % Test

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-literal"
).map(_ % circeVersion)

libraryDependencies ++= {
  val playV = "2.6.17"
  Seq(
    "com.typesafe.play" %% "play" % playV,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    "com.typesafe.play" %% "play-ws" % playV % Test
  )
}

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3"
)

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria-circe" % "1.2.1",
  "org.sangria-graphql" %% "sangria" % "1.4.1",
  "org.sangria-graphql" %% "sangria-relay" % "1.4.1"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.1.3",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.3",
  "com.typesafe.akka" %% "akka-stream" % "2.5.12"
)

libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.0"

libraryDependencies += "com.github.fommil" % "spray-json-shapeless_2.12" % "1.4.0"

libraryDependencies += "ai.x" %% "play-json-extensions" % "0.10.0"