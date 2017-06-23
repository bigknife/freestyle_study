import sbt.Keys._
import coursier._

lazy val commonSettings = Seq(
  scalaVersion := "2.11.8",
  organization := "bigknife",
  scalacOptions ++= Seq(
    "-target:jvm-1.8",
    "-encoding",
    "UTF-8",
    "-unchecked",
    "-deprecation",
    "-Xfuture",
    "-feature",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Ywarn-unused"
  )
)
ensimeIgnoreMissingDirectories in ThisBuild := true
ensimeJavaFlags += "-Xmx4g"

//autoCompilerPlugins := true
//addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M9" cross CrossVersion.full)

lazy val freestyle_study = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"
  )
