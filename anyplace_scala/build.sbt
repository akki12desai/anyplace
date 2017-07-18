name := "anyplace_scala"

version := "1.0"

lazy val `anyplace_scala` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

libraryDependencies ++= Seq(
  // Add here the specific dependencies for this module:
  filters
)

libraryDependencies += "com.couchbase.client" % "java-client" % "2.4.5"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

javaOptions += "-Dfile.encoding=UTF-8"