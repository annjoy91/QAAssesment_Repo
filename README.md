Online Calculator Test Automation
*********************************
Application URL : https://www.online-calculator.com/full-screen-calculator/3

Tools:
---------
Maven
Selenium Webdriver
TestNG

Prerequisite:
----------------------
Need to have the following installed locally:

Maven 3.6
Chrome and Chromedriver (Currently supports execution in Chrome on Windows only)
Java 1.8

Test Execution
----------------------
cd ${Project Folder}
mvn clean test

________________________________________________________________________________________________________________________
Implementation
----------------------
/src/main/java/testbase/BaseClass.java   --- Baseclass with basic browser initialization & synchronization
/src/test/java/testClasses/   ----- Contains the different test classes dealing with Subtraction, division, clear button functionality
___________________________________________________________________________________________________________________________
