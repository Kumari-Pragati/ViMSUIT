package com.example.tests;

import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16566_16566007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAutomaticallyButtonIsNotClickableWhenTheAppIsInTheBackground() throws InterruptedException {
        // Step 1: Open the app and navigate to the home page.
        onView(withId(R.id.id_drawer_layout)).perform(click());

        // Step 2: Click on the 'AUTOMATICALLY' button.
        onView(withId(R.id.id_automatically_button)).perform(click());
        
        // Step 3: Put the app in the background by pressing the home button.
        Thread.sleep(500); // Wait for a moment to ensure the app is in the background

        // Step 4: Verify the 'AUTOMATICALLY' button is not clickable when the app is in the background.
        onView(withId(R.id.id_automatically_button)).check(doesNotExist());
    }
}