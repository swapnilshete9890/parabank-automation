# Test Strategy - ParaBank Automation

## 1. Testing Approach
- Functional testing using automation
- BDD approach using Cucumber
- Page Object Model (POM) design pattern

## 2. Test Levels
- UI testing (End-to-End flow)
- Validation testing (positive & negative scenarios)

## 3. Test Types
- Smoke testing (basic flow)
- Regression testing (after changes)

## 4. Tools & Technologies
- Selenium WebDriver
- Java
- Cucumber (BDD)
- TestNG
- Maven

## 5. Test Data Strategy
- Dynamic data for registration (unique username)
- Static data for login (config file)

## 6. Execution Strategy
- Tests executed locally
- Sequential execution (single thread)

## 7. Reporting
- Extent Reports for execution results
- Screenshot capture on failure

## 8. Risk & Mitigation
- Dynamic UI changes → handled using waits
- Duplicate data issues → handled using dynamic data
- Test failures → captured using logs and screenshots