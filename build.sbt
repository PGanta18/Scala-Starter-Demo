lazy val root = (project in file(".")).
  settings(
    name := "Scala-Starter-Demo",
    version := "1.0",
    scalaVersion := "2.11.4",
    mainClass in Compile := Some("com.myhome.learnings.MainApp")
  )

val sparkVersion = "1.2.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion
)


