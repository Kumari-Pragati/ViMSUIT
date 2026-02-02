package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_11658_11658001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyMonthlySubscriptionOption() throws InterruptedException {
        // Navigate to the Subscription Options screen
        Espresso.onView(ViewMatchers.withText("Subscription Options")).perform(ViewActions.click());
        
        Thread.sleep(500);
        
        // Test each element
        for (int i = 1; i <= 2; i++) {
            String btnId = "id_btn_purchase" + i;
            
            onView(withId(Integer.parseInt(btnId)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.click());
            Thread.sleep(500);
            
            // Verify that the subscription details are displayed correctly
            Espresso.onView(ViewMatchers.withText("Monthly Subscription (Dcoder, Mobile Compiler IDE)"))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            
            // Verify that the 'PURCHASE' button is clickable
            onView(withId(Integer.parseInt(btnId)))
                .perform(ViewActions.click());
            Thread.sleep(500);
        }
        
        // Test withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}