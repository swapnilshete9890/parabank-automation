# Test Strategy - ParaBank Automation

## 1. Testing Approach
- Functional testing using automation
- BDD approach using Cucumber
- Page Object Model (POM) design pattern
- Covers Register and Login modules

## 2. Test Levels
- UI testing (End-to-End flow)
- Validation testing (positive & negative scenarios)

## 3. Test Types
- Smoke testing (basic flow validation)
- Regression testing (after changes)
- Negative testing (invalid and edge cases)

## 4. Tools & Technologies
- Selenium WebDriver
- Java
- Cucumber (BDD)
- TestNG
- Maven

## 5. Test Data Strategy
- Dynamic data for registration (unique username generation)
- Static data for login (config file)
- Data-driven approach using Scenario Outline

## 6. Execution Strategy
- Tests executed locally
- Tag-based execution supported
- Sequential execution (single thread)

## 7. Reporting
- Extent Reports for execution results
- Screenshot capture on failure
- Cucumber HTML reports

## 8. Risk & Mitigation
- Application instability (demo app limitation) → handled with retries/validation
- Dynamic UI changes → handled using explicit waits
- Duplicate data issues → handled using dynamic test data
- Test failures → captured using logs and screenshots