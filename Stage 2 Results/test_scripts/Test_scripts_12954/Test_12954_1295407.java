package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295407 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckAccessibilityusability() throws InterruptedException {
        // Open the 'Addresses' screen (assuming it's the main screen)
        
        // Test each element
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertWithMessage("Navigate up button should be displayed", withContentDescription("['Navigate up']").exists()).exists();
        
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertWithMessage("Element 2 should be displayed").check(matches(isDisplayed()));
        
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertWithMessage("Element 3 should be displayed").check(matches(isDisplayed()));
    }
}