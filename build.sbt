ThisBuild / scalaVersion := "2.13.16"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dep-review-test",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0",
      "mysql" % "mysql-connector-java" % "8.0.33"
    )
  )
