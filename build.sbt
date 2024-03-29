name := "scalastarter"

version := "0.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true


libraryDependencies ++={
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.4" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
  addSbtPlugin("com.hanhuy.sbt" % "kotlin-plugin" % "1.0.7")
}


