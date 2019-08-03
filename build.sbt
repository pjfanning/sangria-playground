name := "sangria-playground"
description := "An example of GraphQL server written with Play and Sangria."

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.0"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  guice,
  filters,
  "com.github.pjfanning.sangria" %% "sangria" % "1.4.3",
  "com.github.pjfanning.sangria" %% "sangria-play-json" % "1.0.5",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test")

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
