package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_10352_10352009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheBackArrowInTheHeader() throws InterruptedException {
        // Step 1: Click on the 'Back' arrow in the header.
        onView(withContentDescription("['Navigate up']")).perform(click());
        
        // Step 2: Verify that the user is navigated back to the previous screen.
        Thread.sleep(500); // Wait for UI to update
        
        // Assuming there's a view or element on the previous screen that can be used as an assertion
        onView(withContentDescription("['Home']")).check(matches(isDisplayed()));
    }
}