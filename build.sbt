ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "de_sprint_project",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.1",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.1",
    libraryDependencies += "org.postgresql" % "postgresql" % "42.2.20"

  )
