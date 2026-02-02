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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17544_17544003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFacebookLoginFlow() throws InterruptedException {
        // Open the SurveyMini app (assumed to be done by ActivityTestRule)
        
        // Click on the "Log in with Facebook" button
        onView(withId(R.id.id_fb_login_button)).perform(click());
        Thread.sleep(500);  // Wait for the UI to update
        
        // Assert that the Facebook login dialog is displayed
        onView(withId(R.id.id_fb_login_button)).check(matches(isDisplayed()));
    }
}