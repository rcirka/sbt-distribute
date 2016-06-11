name := "SBTDistribute"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(JavaAppPackaging)
enablePlugins(UniversalPlugin)


packageName in Universal := "myapp-deploy"

javaOptions in Universal ++= Seq(
  // -J params will be added as jvm parameters
  "-J-Xmx64m",
  "-J-Xms64m",

  // others will be added as app parameters
  "-Dproperty=true",
  "-port=8080",

  // you can access any build setting/task here
  s"-version=${version.value}"
)