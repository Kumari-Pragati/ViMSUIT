package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14435_14435002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheContinueButtonNavigatesToTheNextScreen() throws InterruptedException {
        // Step 1: Open the Cleveland Browns mobile app (assumed to be done by the rule)

        // Step 2: Click on the "Continue" button at the bottom of the screen
        Thread.sleep(500);
        onView(withId(R.id.id_positive_action)).perform(click());

        // Step 3: Verify the user is navigated to the next screen
        Thread.sleep(500);
        onView(withText("Next Screen Title")).check(matches(isDisplayed()));
    }
}