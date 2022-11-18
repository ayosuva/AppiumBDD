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

iOS Read Device setup:

<b>References:</b> </br>
https://www.headspin.io/blog/installing-appium-2-0-and-the-driver-and-plugins-cli
https://github.com/appium/appium-xcuitest-driver/blob/master/docs/real-device-config.md
https://github.com/appium/appium-xcuitest-driver#real-devices

<b>To know the WebDriverAgent root folder</b> </br>
```appium driver install xcuitest echo "$(dirname "$(find "$HOME/.appium" -name WebDriverAgent.xcodeproj)")"```

<b>To install drivers</b> </br>
```appium driver install xcuitest```
```appium driver install uiautomator2 ```

<b>To install drivers</b> </br>
To install Appium
```npm install -g appium@next```

<b>To install drivers</b> </br>
To list drivers
```appium driver list --updates```

<b>To install drivers</b> </br>
To update drivers
```appium driver update```

<b>To install drivers</b> </br>
To uninstall Appium
```npm uninstall -g appium```

<b>To build WebDriverAgent Runner</b> </br>

<b>Download the code from below link</b> </br>
https://github.com/appium/WebDriverAgent

Extract and Copy the content and paste it into WebDriverAgent root folder. Below is my webdriveragent path<br>
```/Users/username/.appium/node_modules/appium-xcuitest-driver/node_modules/appium-webdriveragent```

Change the bundle identifies and Team (You can user Personal Team)

Run the below commands<br>
```mkdir -p Resources/WebDriverAgent.bundle```<br>
```xcodebuild build-for-testing test-without-building -project WebDriverAgent.xcodeproj -scheme WebDriverAgentRunner -destination 'id=<udid>'```<br>
```xcodebuild clean build-for-testing -project WebDriverAgent.xcodeproj -derivedDataPath appium_wda_ios -scheme WebDriverAgentRunner -destination generic/platform=iOS CODE_SIGNING_ALLOWED=YES```
