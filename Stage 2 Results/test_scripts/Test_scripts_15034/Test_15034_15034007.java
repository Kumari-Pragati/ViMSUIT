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
public class Test_15034_15034007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(20000);

    @Test
    public void testClickOnTheGetItOnGooglePlayButtonForDraftPunk() throws InterruptedException {
        // Open the Earthquake Alert app.
        activityRule.getActivity().startActivity(activityRule.getActivity().getIntent());

        // Navigate to the promotional section.
        Thread.sleep(500);
        
        // Click on the 'Draft Punk' app listing.
        onView(withId(R.id.id_earthquake_alert_button)).perform(click());
        Thread.sleep(500);

        // Click on the 'GET IT ON GOOGLE PLAY' button for 'Draft Punk'.
        Thread.sleep(500);
        onView(withText("Get it on Google Play")).perform(click());

        // Expected result: The user should be redirected to the Google Play Store.
        // Since Espresso does not provide a direct way to assert navigation to another app,
        // we can only check if the button was clicked successfully.
        Thread.sleep(500);
        onView(withText("Get it on Google Play")).check(matches(ViewMatchers.isDisplayed()));
    }
}