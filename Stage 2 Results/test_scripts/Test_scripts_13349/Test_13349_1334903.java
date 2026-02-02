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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_13349_1334903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatClickingTheBackArrowReturnsToThePreviousScreen() throws InterruptedException {
        // Navigate to the Legal screen (assuming it's a separate activity)
        // For demonstration, we'll assume there is an action that navigates to the Legal screen.
        // This might be a button click or some other action in your app.
        // Thread.sleep(500); // Uncomment if needed for UI thread synchronization

        // Click on the back arrow
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure the navigation is complete

        // Verify that the app navigates back to the previous screen
        // Assuming the previous screen has a view with id R.id.someViewId
        onView(withContentDescription("['Navigate up']")).check(matches(isDisplayed()));
    }
}