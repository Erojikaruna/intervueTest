Project Structure

├── GenericUtilities
│   ├── Property_Utility.java
│   └── WebDriver_Utility.java
├── POM_Pages
│   ├── HomePomPage.java
│   ├── loginPomPage.java
│   └── loginDetailPomPage.java
├── Login
│   └── LoginTest.java
├── testData
│   └── config.properties

 Prerequisites
Maven (optional but recommended)
Selenium (version:4.27.0)
TestNG(versrion:7.10.2)
ChromeDriver(version:135.0.7049.85) or EdgeDriver
A valid Intervue.io test account

Execution Steps
Navigate to Login/LoginTest.java
Run the file as a TestNg suite using your IDE or Run the TestExecution.xml  file

Launches browser specified in config
Navigates to Intervue.io
Clicks on login
Switches to login tab
Enters email and password
Hovers and verifies the login button
Logs results in TestNG Reporter
Closes the browser
