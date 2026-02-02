package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_10596_1059602 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the Help screen.
        // Assuming that navigating to the help screen is already done in the setup or previous tests.

        // Step 2: Tap the back arrow in the header to navigate back to the previous screen.
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Expected Result: The user is navigated back to the previous screen.
        // Assuming that the previous screen has a specific view or element that can be used as an assertion.
        // For example, if the previous screen has a TextView with id "previous_screen_text_view":
        onView(withContentDescription("Navigate up")).check(matches(not(isDisplayed())));
    }
}