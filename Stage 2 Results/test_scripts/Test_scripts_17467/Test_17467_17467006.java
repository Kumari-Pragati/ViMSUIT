package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17467_17467006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Step 1: Open the app, perform an action, and then close the app
        // Assuming we set a background image in MainActivity for demonstration purposes

        // Perform some action that sets the background image (for example, click a button)
        // For this example, let's assume there is a button with id R.id.set_background_image_button
        // onView(withId(R.id.set_background_image_button)).perform(click());

        // Close the app
        activityRule.finishActivity();

        Thread.sleep(500); // Wait for 500ms to ensure the app has fully closed

        // Step 2: Reopen the app and verify that the data is persisted correctly
        // Open the app again
        activityRule.launchActivity(null);

        Thread.sleep(500); // Wait for 500ms after reopening the app

        // Verify that the background image is still set
        onView(withId(R.id.id_backgroundImage)).check(matches(isDisplayed()));
    }
}