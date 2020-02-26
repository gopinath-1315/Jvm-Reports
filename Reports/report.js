$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature files/Showroom.feature");
formatter.feature({
  "line": 1,
  "name": "To validate home page",
  "description": "",
  "id": "to-validate-home-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11768740400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user has to in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShowroomSD.user_has_to_in_home_page()"
});
formatter.result({
  "duration": 12285050700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "to verify login functionality",
  "description": "",
  "id": "to-validate-home-page;to-verify-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user has to enter \"saravanan00@gmail.com\" and \"7402516716\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user has to click login button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "saravanan00@gmail.com",
      "offset": 19
    },
    {
      "val": "7402516716",
      "offset": 47
    }
  ],
  "location": "ShowroomSD.user_has_to_enter_and(String,String)"
});
formatter.result({
  "duration": 4704902000,
  "status": "passed"
});
formatter.match({
  "location": "ShowroomSD.user_has_to_click_login_button()"
});
formatter.result({
  "duration": 2913695200,
  "status": "passed"
});
formatter.after({
  "duration": 147400,
  "status": "passed"
});
});