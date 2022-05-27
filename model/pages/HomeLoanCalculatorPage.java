package com.liammoy.sdetproject.model.pages;

// Import Selenium things

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeLoanCalculatorPage extends BasePage {
    public HomeLoanCalculatorPage(WebDriver driver) {
        super(driver);
    }

// Select the "Personal banking" radio button
// This is selected by default but a user may peruse other products before home loan products
// Because the option we want is the default one we can implement this later and comment it out for now in the tests

    public HomeLoanCalculatorPage selectPersonalBanking() {
        driver.findElement(By.id("mainMenu-0")).click();
        return this;
    }

// Select the "Home loans" product type from the "Product type" dropdown list
// This is selected by default but a user may peruse other options before home loan products  
// Because the option we want is the default one we can implement this later and comment it out for now in the tests

    public HomeLoanCalculatorPage selectHomeLoans() {
        driver.findElement(By.id("dropdown-toggle-button-menu category-menu")).click();
        driver.findElement(By.linkText("Home loans")).click();
        return this;
    }

// Click "Get started" button to progress to the next screen
// A response to the "What are you interested in?" dropdown list is not required for this
// This function can be used for submitting a response to the first dropdown list only or to both dropdown lists

    public HomeLoanCalculatorPage clickGetStartedButton() {
        driver.findElement(By.linkText("Get started")).click();
        return this;
    }

// Progress from the intermediate page to the Home Loan Calculator
// Build out the model by identifying a few candidate findElement() approaches and audition them


    public HomeLoanCalculatorPage clickWhatWillMyRepaymentsBe() {
//        driver.findElement(By.linkText("What will my repayments be?")).click();
//        driver.findElement(By.XPath("//a[@href='/personal/home-loans/calculators/loan-repayments-calculator']")).click();
        driver.findElement(By.cssSelector("a[href='/personal/home-loans/calculators/loan-repayments-calculator']")).click();

        return this;
    }

// Set the Loan Repayment Calculator fields

    public HomeLoanCalculatorPage setLoanAmount(String newLoanAmount) {
        driver.findElement(By.id("nab-loan-calc-app__repayments--loan-amount")).sendKeys(newLoanAmount);
        return this;
    }

    public HomeLoanCalculatorPage setLoanTerm(String newLoanTerm) {
        driver.findElement(By.id("nab-loan-calc-app__repayments--loan-term")).sendKeys(newLoanTerm);
        return this; 
    }

    public HomeLoanCalculatorPage clickPrincipalAndInterestButton() {
        driver.findElement(By.linkText("Principal & interest")).click();
//      driver.findElement(By.XPath("//button[@value='Principal & interest']")).click();
//      driver.findElement(By.XPath("//input[@value='Principal & interest']")).click();
//      driver.findElement(By.cssSelector("button[value='Principal & interest']")).click();
//      driver.findElement(By.cssSelector("input[@value='Principal & interest']")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickInterestOnlyButton() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }



    public HomeLoanCalculatorPage clickInterestOnlyPeriodField() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickNoInvestmentPurposesButton() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickYesInvestmentPurposesButton() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickYesChoicePackageButton() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickNoChoicePackageButton() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage clickPleaseSelectProductList() {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

    public HomeLoanCalculatorPage SelectFromProductList(String[] args) {
        driver.findElement(By.id(" ... ")).click();
        return this;
    }

}