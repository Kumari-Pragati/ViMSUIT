package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18712_18712003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowUserClicksOnThePrivacyPolicyLink() throws InterruptedException {
        // Step 1: Open the Weather Live app (already covered by activityRule)
        
        // Step 2: Navigate to the permission request page
        onView(withText("Allow")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the 'Privacy Policy' link
        onView(withId(R.id.id_understand)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user is redirected to the privacy policy page, and the permission request page remains open.
        // Assert that we are still on the permission request page
        onView(withText("Allow")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}