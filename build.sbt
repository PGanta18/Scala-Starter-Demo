lazy val root = (project in file(".")).
  settings(
    name := "Scala-Starter-Demo",
    version := "1.0",
    scalaVersion := "2.12.4",
    mainClass in Compile := Some("com.myhome.learnings.MainApp")
  )

val sparkVersion = "3.2.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  //"com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"% "provided",
  //"ch.qos.logback" % "logback-classic" % "1.3.5"% "provided",
  "io.netty" % "netty-all" % "4.1.68.Final"% "provided",
  "io.netty" % "netty-buffer" % "4.1.68.Final"% "provided"
)