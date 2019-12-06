import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "srx-test",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.lihaoyi" %% "scalarx" % "0.4.0"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.




// "com.lihaoyi" % "scalarx" % "0.4.0"
// "com.lihaoyi" %% "scalarx" % "0.4.0"   "scalarx_2.12"
// "com.lihaoyi" %%% "scalarx" % "0.4.0"  "scalarx_2.12"
