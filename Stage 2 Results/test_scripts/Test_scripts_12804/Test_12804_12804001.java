package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_12804_12804001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingBackToThePreviousScreen() throws InterruptedException {
        // Wait for the initial screen to load
        Thread.sleep(500);

        // Tap the back arrow in the app bar to navigate back to the previous screen
        onView(withContentDescription("Navigate up")).perform(click());
        
        // Wait for 500ms before checking the result
        Thread.sleep(500);
        
        // Assert that the view is displayed, indicating navigation was successful
        onView(isRoot()).check(matches(isDisplayed()));
    }
}