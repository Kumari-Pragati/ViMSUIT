package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10890_10890002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheGetItNowButtonFunctionality() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 2: Click on the 'GET IT NOW' button
        onView(withId(R.id.id_get_one_app_button)).perform(click());

        // Thread.sleep(500) to allow time for navigation or loading of new page
        Thread.sleep(500);

        // Expected result: The user is redirected to the Sololearn app download page.
        // For demonstration purposes, we will assert that a specific text appears on the screen,
        // which would typically be the title or content of the Sololearn app's download page.
        onView(withText("Sololearn")).check(matches(isDisplayed()));
    }
}