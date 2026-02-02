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
public class Test_11231_1123107 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationUserNavigatesToTheLoginPage() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 1: Open the Talabat.com mobile app (already covered by ActivityTestRule)

        // Step 2: Click on the 'LOGIN' button in the footer
        onView(withId(R.id.id_btnLogin)).perform(click());

        // Thread.sleep(500) to ensure the navigation is complete before assertions
        Thread.sleep(500);

        // Expected Result: The app should navigate to the login page
        onView(withText("Login")).inRoot(isDialog()).check(matches(withText("Login")));
    }
}