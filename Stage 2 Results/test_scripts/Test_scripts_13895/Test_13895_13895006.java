package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_13895_13895006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUsabilityTestAccessibility() throws InterruptedException {
        // Step 1: Open the app and navigate to the gallery screen.
        Espresso.onView(ViewMatchers.withId(R.id.gallery_screen)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Use a screen reader to interact with the back arrow button in the top left corner.
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user is able to navigate back to the previous screen using the screen reader.
        Espresso.onView(ViewMatchers.withId(R.id.previous_screen)).check(matches(isDisplayed()));
    }
}