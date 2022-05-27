package com.liammoy.sdetproject.test;

// Import from the page-object-model

import com.liammoy.sdetproject.model.pages.HomeLoanCalculatorPage;

// Import Java things

import org.junit.jupiter.api.Test;

public class NavigationTests extends BaseTestSuite {

// Test Case 1: Verify that a user can access the Home Loan Calculator from the NAB home page by:
//
//          1a: Selecting "Home loans" from the first dropdown list; and then
//          1b: Clicking "Get started" without choosing any option from the second dropdown list.


    @Test
    public void verifyProductTypeOnlyNavigation()
    {       
        new HomeLoanCalculatorPage(driver)
//          .selectPersonalBanking()                // not working yet, need to find a better CSS selector; method works anyway because option is the default
//          .selectHomeLoans()                      // not working yet, need to find a better CSS selector; method works anyway because option is the default
            .clickGetStartedButton()
            .clickWhatWillMyRepaymentsBe();         // does this need an Explicit Wait?

    }
}

// Build out the double-dropdown once the first dropdown can't be improved any further


// Test Case 2: Verify that a user can access the Home Loan Calculator from the NAB home page by:
//
//          2a: Selecting "Home loans" from the first dropdown list; and then
//          2b: Selecting "What my repayments will be?" from the second dropdown list


// Test Case 3: Verify that a user can access the Home Loan Calculator from the (responsive) navigation bar at the top of the Home Page.
//
//          3a: Navigating from a skinny window via the "Hamburger" dropdown menu
//          3b: Navigating from a fat window via the "Personal" dropdown menu