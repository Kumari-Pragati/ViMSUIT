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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_18483_1848306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityBottomNavigationButton throws InterruptedException {
        // Step 1: Open the app and navigate to the main feed screen (Assuming it's already on the main feed)
        
        // Step 2: Click on the red circular button with the pen icon at the bottom of the screen.
        onView(withId(R.id.id_fab)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the red circular button with the pen icon at the bottom of the screen again.
        onView(withId(R.id.id_fab)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app navigates to the post creation screen
        Espresso.onView(isDisplayed()).check(ViewAssertions.matches(ViewMatchers.withText("Post Creation Screen")));
    }
}