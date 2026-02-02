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
public class Test_17544_17544001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveLoginFlow() throws InterruptedException {
        // Step 1: Open the SurveyMini app (Assumed to be done by ActivityTestRule)
        
        // Step 2: Click on the "Log in" button
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withId(R.id.id_LoginButton)).perform(click());
        
        // Step 3: Assert that the login form appears (Assuming a TextView with id R.id.loginFormText is shown)
        Thread.sleep(500); // Wait for UI to stabilize
        onView(withText("Login Form")).inRoot(isDialog()).check(matches(withText("Login Form")));
    }
}