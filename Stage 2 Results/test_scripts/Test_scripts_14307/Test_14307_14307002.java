package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14307_14307002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheBackArrowInTheHeaderNavigatesBackToThePreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen with ID 14307 (Assuming this is already done in setup)
        
        // Step 2: Click on the back arrow in the header
        Thread.sleep(500);
        onView(withId(R.id.id_title_bar_back_button)).perform(ViewActions.click());
        
        // Step 3: Verify that the user is navigated back to the previous screen
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.id_previous_screen_element_id)).check(matches(isDisplayed()));
    }
}