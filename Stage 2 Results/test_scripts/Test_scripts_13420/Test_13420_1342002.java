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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_13420_1342002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithFacebook() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the Facebook button in the 'Connect with' section.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Step 3: Sign in with the provided Facebook account credentials (Assuming this step is handled by Espresso actions)
        Thread.sleep(500);

        // Step 4: Verify that the user is logged in successfully.
        Thread.sleep(500);
        onView(withId(R.id.button_facebook)).check(matches(withText("Connected")));
        onView(withId(R.id.button_facebook)).check(matches(isDisplayed()));
    }
}