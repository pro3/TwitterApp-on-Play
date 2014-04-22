name := "OAuth5"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.twitter4j" % "twitter4j-core" % "4.0.1"
 )     

play.Project.playJavaSettings
