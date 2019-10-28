name := "sangria-playground"
description := "An example of GraphQL server written with Play and Sangria."

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.0"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  guice,
  filters,
  "org.sangria-graphql" %% "sangria" % "2.0.0-M1",
  "org.sangria-graphql" %% "sangria-play-json" % "2.0.0",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test")

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
