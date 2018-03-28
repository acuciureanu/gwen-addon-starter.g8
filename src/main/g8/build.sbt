resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.4"
    )),
    name := "gwen-addon-example"
  )

libraryDependencies ++= Seq(
  "org.gweninterpreter" % "gwen" % "2.13.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
