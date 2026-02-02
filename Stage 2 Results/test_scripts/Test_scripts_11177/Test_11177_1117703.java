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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11177_1117703 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyTheTutorialPopupRemainsOpenIfTheXButtonIsTappedMultipleTimes throws InterruptedException {
        // Tap the 'X' button multiple times and wait between each tap
        for (int i = 0; i < 3; i++) {
            onView(withId(R.id.id_tutorial_close_button)).perform(ViewActions.click());
            Thread.sleep(500); // Wait for 500 milliseconds before next interaction
        }

        // Assert that the tutorial pop-up is still displayed after tapping the 'X' button multiple times
        onView(withId(R.id.id_tutorial_popup)).check(ViewAssertions.matches(isDisplayed()));
    }
}