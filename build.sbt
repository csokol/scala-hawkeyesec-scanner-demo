name := "scala-hawkeyesec-scanner-demo"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.1"

//excludedFiles in Assembly := { (base: Seq[File]) => Nil }

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.example",
  scalaVersion := "2.10.1",
  test in assembly := {}
)

lazy val app = (project in file("app")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("com.example.Main"),
    // more settings here ...
  )
