name := "akka-streams-bakery"

version := "1.0"

scalaVersion := "2.12.6" // 2.13.0-M4

lazy val akkaVersion = "2.5.14"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)