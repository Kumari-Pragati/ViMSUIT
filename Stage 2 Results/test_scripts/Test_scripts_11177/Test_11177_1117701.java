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
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11177_1117701 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheTutorialPopupCanBeClosedByTappingTheXButton() throws InterruptedException {
        // Wait for the tutorial popup to appear
        Thread.sleep(500);

        // Tap the 'X' button at the top right corner of the pop-up window
        onView(withId(R.id.id_tutorial_close_button)).perform(click());

        // Wait for 500ms before checking if the popup is no longer displayed
        Thread.sleep(500);

        // Assert that the tutorial popup is no longer displayed
        onView(withId(R.id.id_tutorial_popup_container)).check(matches(not(isDisplayed())));
    }
}