package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_12280_12280005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonSocialShareButton() throws InterruptedException {
        // Open the Holaa app (assumed to be done by the rule)
        
        // Navigate to the 'Profile' section
        Espresso.onView(ViewActions.click()).perform(ViewActions.scrollTo(), ViewActions.click());

        // Click on the Facebook share icon
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_secondaryIconView)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: The Facebook share dialog is displayed
        Espresso.onView(withId(R.id.id_secondaryIconView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}