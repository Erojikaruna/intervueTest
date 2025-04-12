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
.Maven (optional but recommended)
.Selenium (version:4.27.0)
.TestNG(versrion:7.10.2)
.ChromeDriver(version:135.0.7049.85) or EdgeDriver
.A valid Intervue.io test account

Execution Steps
.Navigate to Login/LoginTest.java
.Run the file as a TestNg suite using your IDE or Run the TestExecution.xml  file

1. Launches browser specified in config
2. Navigates to Intervue.io
3. Clicks on login
4. Switches to login tab
5. Enters email and password
6. Hovers and verifies the login button
7. Logs results in TestNG Reporter
8. Closes the browser
