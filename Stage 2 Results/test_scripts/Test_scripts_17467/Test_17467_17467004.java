package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17467_17467004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePrimaryCtaIsFunctional() throws InterruptedException {
        // Open the app and locate the primary CTA
        Thread.sleep(500);
        
        // Click on the primary CTA
        onView(withId(R.id.id_backgroundImage)).perform(click());
        Thread.sleep(500);

        // Verify that the expected action is triggered
        Espresso.onView(ViewMatchers.withText("Expected Action Text"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}