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
public class Test_1115_1115001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginButtonShouldNavigateToLoginPage() throws InterruptedException {
        // Step 1: Click on the 'Login' button at the bottom of the screen.
        onView(withId(R.id.id_button_login)).perform(click());
        
        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);
        
        // Expected Result: The app should navigate to the login page.
        onView(ViewMatchers.withText("Login")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}