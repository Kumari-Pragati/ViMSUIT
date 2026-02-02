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
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18929_18929005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserAttemptsToNavigateAwayFromTheConfirmationDialog() throws InterruptedException {
        // Navigate to settings or preferences section (assuming this is a known action)
        onView(ViewMatchers.withText("Settings")).perform(ViewActions.click());
        
        Thread.sleep(500);
        
        // Turn off all demos (assuming this is a known action)
        onView(withId(R.id.turn_off_demos)).perform(ViewActions.click());
        
        Thread.sleep(500);
        
        // Attempt to navigate away from the confirmation dialog by pressing the back button
        Espresso.pressBack();
        
        Thread.sleep(500);
        
        // Verify that the negative button remains open
        onView(withId(R.id.id_dialog_button_negative)).check(matches(isDisplayed()));
        
        Thread.sleep(500);
        
        // Attempt to navigate away again using positive button
        onView(withId(R.id.id_dialog_button_positive)).perform(ViewActions.click());
        
        Thread.sleep(500);
        
        // Verify that the confirmation dialog remains open after clicking positive button
        onView(withId(R.id.id_dialog_button_negative)).check(matches(isDisplayed()));
    }
}