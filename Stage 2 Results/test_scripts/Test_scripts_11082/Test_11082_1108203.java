package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11082_1108203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignInButtonPositiveFlow() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the 'Sign In' button
        onView(withId(R.id.id_btn_login)).perform(click());
        
        // Wait for 500ms before checking the result
        Thread.sleep(500);
        
        // Assert that the user is redirected to the login page
        onView(withText("Login")).check(matches(isDisplayed()));
    }
}