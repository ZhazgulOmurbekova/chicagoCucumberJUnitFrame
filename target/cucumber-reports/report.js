$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/dzone.feature");
formatter.feature({
  "name": "DZone header",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Header comparison",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dzone"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"https://dzone.com/articles/gradle-vs-maven\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Dzone_steps.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user takes header",
  "keyword": "And "
});
formatter.match({
  "location": "Dzone_steps.user_takes_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"https://dzone.com/articles/api-security-weekly-issue-71\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_steps.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user takes header of that page",
  "keyword": "And "
});
formatter.match({
  "location": "Dzone_steps.user_takes_header_of_that_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user compares two headers",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_steps.user_compares_two_headers()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Gradle vs. Maven]\u003e but was:\u003c[API Security Weekly: Issue #71]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.Dzone_steps.user_compares_two_headers(Dzone_steps.java:38)\n\tat ✽.user compares two headers(src/test/resources/features/dzone.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});