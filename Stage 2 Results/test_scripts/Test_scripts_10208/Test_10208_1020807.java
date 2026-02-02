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
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_10208_1020807 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithFacebookBoundaryvalidation() throws InterruptedException {
        // Open the 'buzzMuslim' app.
        Thread.sleep(500); // Wait for 500ms

        // Click on the 'Register with Facebook' button.
        onView(withId(R.id.id_register_fb_btn)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms

        // The user should be redirected to the Facebook login page with the correct parameters.
        Espresso.onView(isDisplayed()).check(matches(withId(R.id.facebook_login_page_container)));
    }
}