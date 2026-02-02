package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_12954_1295406 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the 'Addresses' screen (Assuming Addresses screen is opened by default)
        
        // Step 2: Click on the back arrow in the header/app bar
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Expected Result: The application navigates back to the previous screen
        onView(withContentDescription("['Navigate up']")).check(matches(isDisplayed()));
    }
}