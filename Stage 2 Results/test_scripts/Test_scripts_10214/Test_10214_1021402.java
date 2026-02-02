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
public class Test_10214_1021402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatClickingTheSignOutButtonLogsTheUserOut() throws InterruptedException {
        // Click on the 'Sign Out' button.
        onView(withId(R.id.id_logout_btn)).perform(click());

        // Wait for 500ms to ensure the logout process is completed.
        Thread.sleep(500);

        // Assert that the user is logged out (this might require a custom assertion based on your app's behavior).
        // For example, you could check if a specific screen or view is displayed after logging out.
        onView(withText("Login")).check(matches(isDisplayed()));
    }
}