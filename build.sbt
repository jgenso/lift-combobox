name := "combobox"

version := "2.6"

organization := "net.liftmodules"
 
scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.9.2", "2.9.1-1", "2.9.1")

scalacOptions ++= Seq("-unchecked", "-deprecation")

scalacOptions in (Compile, doc) ++= Seq(
  "-doc-root-content", "README.scaladoc",
   "-doc-title", "Lift ComboBox Module 2.5-RC-0.6"
)

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-webkit" % "2.6.1",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

publishTo := Some(
  Resolver.sftp("bone", "bone.twbbs.org.tw", "public_html/ivy")
)
