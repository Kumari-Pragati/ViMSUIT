package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_1753_1753007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGetStartButtonIsUsable() throws InterruptedException {
        // Step 1: Open the app and navigate to screen 1753 (Assuming it's already on the correct screen)
        
        // Step 2: Click on the 'GET START' button
        Thread.sleep(500);
        onView(withId(R.id.id_help_instruction_nextButton)).perform(click());

        // Step 3: Verify that the app navigates to the next screen without any usability issues
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Next Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}