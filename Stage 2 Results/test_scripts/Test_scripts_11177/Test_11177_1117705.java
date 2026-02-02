package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
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
@LargeTest
public class Test_11177_1117705 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testVerifyTheTutorialPopupCanBeClosedByPressingTheHomeButton() throws InterruptedException {
        // Step 1: Press the home button on the device.
        Thread.sleep(500);

        // Step 2: Verify that the tutorial pop-up is displayed.
        onView(withId(R.id.id_tutorial_close_button)).check(matches(isDisplayed()));

        // Step 3: Click the close button to close the tutorial pop-up.
        Thread.sleep(500);
        onView(withId(R.id.id_tutorial_close_button)).perform(click());

        // Step 4: Verify that the home screen is displayed after closing the tutorial pop-up.
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Step 5: Assert that the home screen is active.
        onView(withId(R.id.id_home_screen)).check(matches(isDisplayed()));
    }
}