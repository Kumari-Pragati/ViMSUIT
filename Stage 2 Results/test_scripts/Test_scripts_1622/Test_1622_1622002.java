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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1622_1622002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testLoginWithGoogle() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming it's already open, or this step is handled by setup)
        
        // Step 2: Click on the 'Log In' button
        onView(withId(R.id.log_in_button)).perform(click());
        Thread.sleep(500);

        // Step 3: Select 'Google' as the login option
        onView(withContentDescription("[None]")).perform(click()); // Assuming Google is selected by this selector
        Thread.sleep(500);

        // Step 4: Enter Google credentials (Not implemented due to lack of UI interaction)
        
        // Step 5: Click the 'Log In' button
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.google_login_button)).perform(click());
        Thread.sleep(500);

        // Step 6: Verify if the user is logged in successfully
        onView(withId(R.id.user_profile_image)).check(matches(ViewMatchers.isDisplayed()));
    }
}