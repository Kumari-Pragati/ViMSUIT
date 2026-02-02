package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10208_1020808 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithGoogleBoundaryvalidation() throws InterruptedException {
        // Open the 'buzzMuslim' app.
        
        // Click on the 'Register with Google' button.
        Thread.sleep(500);
        onView(withId(R.id.id_register_google_btn)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: The user should be redirected to the Google login page with the correct parameters.
        Espresso.onView(withText("Google")).check(ViewAssertions.matches(isDisplayed()));
    }
}