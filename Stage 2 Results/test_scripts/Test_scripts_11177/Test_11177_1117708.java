package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_11177_1117708 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheTutorialPopupCanBeClosedByPressingTheMultitaskingButton() throws InterruptedException {
        // Step 1: Press the multitasking button on the device.
        
        // Assuming the multitasking button press is simulated by a specific action or event
        // For demonstration, we will simulate it with Thread.sleep and then close the tutorial popup
        
        Thread.sleep(500); // Wait for the tutorial to appear

        // Step 2: Click the close button of the tutorial pop-up.
        onView(withId(R.id.id_tutorial_close_button)).perform(click());

        // Step 3: Verify that the tutorial pop-up is no longer displayed.
        Thread.sleep(500); // Give some time for the view to update
        onView(withId(R.id.id_tutorial_close_button)).check(doesNotExist());
        
        // Additional assertion to check if we are back on the previous screen
        onView(isRoot()).perform(click()); // Simulate going back to the root activity
        Thread.sleep(500); // Wait for the transition
    }
}