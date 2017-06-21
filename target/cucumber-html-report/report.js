$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "I order to login",
  "description": "       User needs to provide user information",
  "id": "i-order-to-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3297253360,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User logining",
  "description": "",
  "id": "i-order-to-login;user-logining",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am landing on nike homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I need to provide the user details to login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I need to see the current page url",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefination.i_am_landing_on_nike_homepage()"
});
formatter.result({
  "duration": 3386566496,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignupStepDefination.i_need_to_see_the_current_page_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 589210614,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 2,
  "name": "In order to signup",
  "description": "       user needs to create the account",
  "id": "in-order-to-signup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.before({
  "duration": 2573871912,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "creating a account to user",
  "description": "",
  "id": "in-order-to-signup;creating-a-account-to-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am landing on nike homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on join now",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I provide the user details to join",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I need to see the current page url",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefination.i_am_landing_on_nike_homepage()"
});
formatter.result({
  "duration": 4310590819,
  "status": "passed"
});
formatter.match({
  "location": "SignupStepDefination.i_click_on_join_now()"
});
formatter.result({
  "duration": 2991646049,
  "status": "passed"
});
formatter.match({
  "location": "SignupStepDefination.i_provide_the_user_details_to_join()"
});
formatter.result({
  "duration": 22740175034,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #\\/html\\/body\\/div\\[12\\]\\/div\\[2\\]\\/div\\[1\\]\\/div\\/div\\[1\\]\\/div\\/div\\[2\\]\\/form\\/div\\[10\\]\\/input\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027Ajays-MBP\u0027, ip: \u00272602:306:cea2:3570:7431:1f3a:7b14:e3ff\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.5\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/var/folders/w9/y86m5q6n4zbfhk90lsqfqwww0000gn/T/rust_mozprofile.nwOqe1ntaHkQ, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d54.0, platformVersion\u003d16.6.0, moz:processID\u003d36092.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003ddarwin}]\nSession ID: 0656a1f6-efb1-3d46-b82c-0e464237bf1a\n*** Element info: {Using\u003did, value\u003d/html/body/div[12]/div[2]/div[1]/div/div[1]/div/div[2]/form/div[10]/input}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:453)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\n\tat pages.Signup.user_details(Signup.java:60)\n\tat step_defination.SignupStepDefination.i_provide_the_user_details_to_join(SignupStepDefination.java:24)\n\tat ✽.And I provide the user details to join(signup.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignupStepDefination.i_need_to_see_the_current_page_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 649425302,
  "status": "passed"
});
});