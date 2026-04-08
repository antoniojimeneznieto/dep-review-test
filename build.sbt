ThisBuild / tlBaseVersion := "0.1"
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.16"
ThisBuild / startYear := Some(2025)
ThisBuild / developers := Nil

lazy val root = project
  .in(file("."))
  .settings(
    name := "dep-review-test",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.13.0"
  )
