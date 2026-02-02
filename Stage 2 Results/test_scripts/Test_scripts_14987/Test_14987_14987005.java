package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_14987_14987005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowPasswordToggle() throws InterruptedException {
        // Step 1: Click the 'Show' toggle next to the 'Password' field
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI update
        
        // Step 2: Enter 'Password1234' in the 'Password' field
        onView(withId(R.id.password)).perform(ViewActions.typeText("Password1234"));
        
        Thread.sleep(500); // Wait for UI update
        
        // Step 3: Click the 'SUBMIT' button
        onView(withId(R.id.submit_button)).perform(click());
        
        Thread.sleep(500); // Wait for error message to appear
        
        // Expected Result: The user is presented with an error message for the 'Password' field
        onView(ViewMatchers.withText("Invalid password")).inRoot(isRoot()).check(matches(ViewMatchers.isDisplayed()));
    }
}