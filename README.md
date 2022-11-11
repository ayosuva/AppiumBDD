**Java Appium BDD**
It is a Appium Java BDD based test automation framework and the test scripts written for Auto Trade UK app

It has following features:

-> Page object Model

-> Extent HTML Report with screenshot

-> BDD with Cucumber

-> Screenshot for both pass and fail steps

-> CI/CD configurable

Import the project in eclipse/IntelliJ

To run using IDE, Right-click on Runner class and select Run option

To run using command line , use command ```mvn clean verify```

To run cucumber tests with tags , use command ```mvn clean verify -D"cucumber.filter.tags=@order"```

Html report can be found under target/index.html

# Jenkins Setup:

**Source Code Management:** Git : https://github.com/ayosuva/SeleniumBDD

**Branches to build:** */main

**Build Triggers:** Poll SCM : * * * * *

**Build :** Execute Windows batch command : mvn -Dtest=Runner test

**E-mail Notification :**
Manage Jenkins -> Configure System
smtp.gmail.com
Use SMTP Authentication
Use SSL
Port:465

Useful commands:

```adb devices``` to list the device id of connected devices or emulator
``` adb install <apk path>``` to install app on the device
