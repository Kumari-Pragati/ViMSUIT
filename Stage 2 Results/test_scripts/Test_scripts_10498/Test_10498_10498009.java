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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10498_10498009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheLoginPrompt() throws InterruptedException {
        // Navigate to the 'Headlines' section (Assuming this is done in MainActivity)
        Thread.sleep(500); // Wait for initial screen

        // Click on the login prompt
        onView(withId(R.id.id_ey)).perform(click());
        Thread.sleep(500); // Wait before assertion

        // Assert that the app navigates to the login screen
        onView(withId(R.id.login_screen_container)).check(matches(isDisplayed()));
    }
}