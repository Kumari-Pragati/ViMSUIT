package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703207 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateBackToThePreviousScreen() throws InterruptedException {
        // Navigate to the 'All Lines' section (Assuming this is done in MainActivity)
        
        // Press the back button on the device
        onView(withId(R.id.id_footer_add_button)).perform(click());
        Thread.sleep(500); // Wait for 500ms to ensure the action is processed

        // Assert that the screen navigates back to the previous screen displaying the 'Lines' section
        onView(ViewMatchers.withText("Lines")).check(matches(isDisplayed()));
    }
}