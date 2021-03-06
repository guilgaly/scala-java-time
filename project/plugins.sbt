import sbt.Keys._

resolvers += Resolver.sonatypeRepo("public")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.17")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC2")

addSbtPlugin("com.47deg"  % "sbt-microsites" % "0.5.7")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

// Incompatible with 2.12.0-M5
// addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
// addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.1.0")

libraryDependencies ++= Seq(
  "io.github.cquiroz" %% "kuyfi" % "0.5.1",
  "org.apache.commons" % "commons-compress" % "1.12"
)
