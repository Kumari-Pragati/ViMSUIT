package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.assertion.ViewAssertions.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

public class Test_1303_130307 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityEnsuringTheBackArrowIsAccessible() throws InterruptedException {
        // Step 1: Open the application (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the 'Select City' screen (This step might require additional UI interactions, which are not specified in the test case)
        
        // Step 3: Perform a long press on the back arrow in the header
        onView(allOf(withContentDescription("Navigate up"), isDisplayed())).perform(longClick());
        
        // Step 4: Verify that the back arrow is accessible and can be interacted with
        Thread.sleep(500); // Wait for 500ms to ensure the view state updates
        
        onView(allOf(withContentDescription("Navigate up"), isClickable())).check(isClickable());
    }
}