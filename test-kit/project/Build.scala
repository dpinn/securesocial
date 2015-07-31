import sbt._
import Keys._

object ApplicationBuild extends Build {

    val appName         = "securesocial-testkit"
    val appVersion      = "1.0.0-SNAPSHOT"
    val appOrganization    = "io.appspokes"
    val dependencies = Seq(
	    "io.appspokes" %% "securesocial" % "1.0.0-SNAPSHOT",
      "org.scalacheck" %% "scalacheck" % "1.11.1",
      "com.typesafe.play" %% "play-test" % "2.2.0",
      "org.mockito" % "mockito-all" % "1.9.5"
  )
    val main = sbt.Project(appName, file(".") ).settings(
      resolvers += Resolver.sonatypeRepo("snapshots")
    , libraryDependencies ++= dependencies
    , version := appVersion
    , organization := appOrganization
    )
}
