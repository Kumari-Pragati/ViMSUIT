package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_12802_12802005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsNavigationBar() throws InterruptedException {
        // Navigate to the Music History screen (Assuming this is a step in your app flow)
        Espresso.onView(ViewMatchers.withId(R.id.music_history_button)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms

        // Click on the back arrow in the navigation bar
        onView(withContentDescription("Navigate up")).perform(click());

        Thread.sleep(500); // Wait for 500ms

        // Assert that we are navigated back to the previous screen (Assuming this is your expected result)
        Espresso.onView(ViewMatchers.withId(R.id.previous_screen_element)).check(matches(isDisplayed()));
    }
}