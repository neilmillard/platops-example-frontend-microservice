import play.core.PlayVersion
import sbt._

object AppDependencies {
  val compile = Seq(
      "uk.gov.hmrc" %% "govuk-template"     % "5.20.0",
      "uk.gov.hmrc" %% "play-ui"            % "7.14.0",
      "uk.gov.hmrc" %% "bootstrap-play-25"  % "1.5.0"
  )

  val test = Seq(
      "org.scalatest"          %% "scalatest"          % "3.0.0"              % "test",
      "org.jsoup"              %  "jsoup"              % "1.10.2"             % "test",
      "com.typesafe.play"      %% "play-test"          % PlayVersion.current  % "test",
      "org.pegdown"            %  "pegdown"            % "1.6.0"              % "test, it",
      "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0"              % "test, it",
      "uk.gov.hmrc"            %% "service-integration-test"    % "0.2.0"     % "test, it"
  )
}