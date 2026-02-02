package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import java.lang.Thread.sleep;

public class Test_15169_15169004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyBirthdayInput() throws InterruptedException {
        // Open the app and navigate to the 'New User' screen (assuming it's already there)
        
        // Test element 1: withContentDescription("[None]") - android:id/button2
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Select your birthday"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.pressBack();
        
        // Test element 2: withContentDescription("[None]") - android:id/button1
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Select your birthday"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.pressBack();
        
        // Perform the steps for both elements to select a birthday and confirm it
        // Element 1: withContentDescription("[None]") - android:id/button2
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("January"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("1"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("2020"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(click());
        
        // Element 2: withContentDescription("[None]") - android:id/button1
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("January"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("1"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("2020"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(click());

        // Verify the error message is displayed
        Espresso.onView(ViewMatchers.withText("Please enter a valid birthday"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}