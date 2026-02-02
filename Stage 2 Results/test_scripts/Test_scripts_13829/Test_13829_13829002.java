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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13829_13829002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithFacebookNegativeFlowNoFacebookAccount() throws InterruptedException {
        // Open the Drug Index app.
        
        // Click on the Facebook login prompt.
        onView(withId(R.id.facebook_login_button)).perform(click());
        Thread.sleep(500);
        
        // Click on the 'CONTINUE AS SAM' button.
        onView(withId(R.id.id_gdp_dialog_continue_button)).perform(click());
        Thread.sleep(500);

        // The app displays an error message indicating that the user does not have a Facebook account.
        onView(withText("You don't have a Facebook account.")).check(matches(ViewMatchers.isDisplayed()));
    }
}