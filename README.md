# ParaBank Automation Framework

## 📌 Project Overview
This project is an automation framework for the ParaBank demo application using Selenium, Java, Cucumber (BDD), and TestNG.

## 🧰 Tech Stack
- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- Log4j

## 📂 Project Structure
- pages → Page Object classes
- stepdefinitions → Step definitions
- features → Cucumber feature files
- utils → Utility classes (Driver, Config, Screenshot)

## 🚀 Features Covered

### Register Module
- Valid registration
- Invalid registration
- Duplicate user
- Field validations

### Login Module
- Valid login
- Invalid login (multiple combinations)
- Blank fields validation
- Special characters
- Leading/trailing spaces
- Case sensitivity

## ⚙️ How to Run
- Run TestRunner.java
- Or use Maven:
  mvn test

## 📊 Reports
- Extent Report
- Cucumber HTML Report

## ⚠️ Note
ParaBank is a demo application, so some negative scenarios may not behave as expected due to lack of proper backend validation.