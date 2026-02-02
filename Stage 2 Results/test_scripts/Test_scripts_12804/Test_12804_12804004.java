package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12804_12804004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestTappingOnTheImage() throws InterruptedException {
        // Tap on the image of the person playing a stringed instrument.
        Thread.sleep(500);
        onView(withId(R.id.id_popup_menu)).perform(ViewActions.click());

        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);

        // Assert that the artist details screen is displayed
        Espresso.onView(withId(R.id.artist_details_screen_id)).check(matches(isDisplayed()));
    }
}