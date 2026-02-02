package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_1068_1068001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateBackToThePreviousScreen() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the back arrow in the top left corner
        onView(withContentDescription("Navigate up")).perform(click());

        // Wait for 500ms before checking the result
        Thread.sleep(500);

        // Assert that we are redirected to the previous screen
        onView(withId(R.id.previous_screen_element)).check(ViewAssertions.matches(isDisplayed()));
    }
}