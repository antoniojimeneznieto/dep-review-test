ThisBuild / scalaVersion := "2.13.16"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dep-review-test",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.13.0"
  )
