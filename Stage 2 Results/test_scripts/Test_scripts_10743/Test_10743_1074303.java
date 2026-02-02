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
public class Test_10743_1074303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserClicksOnTheSkipAndFinishSignUpButton() throws InterruptedException {
        // Navigate to the 'GET CONNECTED' screen (Assuming this is a step in the app flow)
        Thread.sleep(500); // Wait for initial screen load

        // Click on the 'SKIP AND FINISH SIGN UP' button
        onView(withId(R.id.id_finish_sign_up)).perform(click());
        Thread.sleep(500); // Wait for the action to complete

        // Verify that the user is directed to the sign-up completion screen
        onView(withText("Sign Up Completion Screen Title")).check(matches(isDisplayed()));
    }
}