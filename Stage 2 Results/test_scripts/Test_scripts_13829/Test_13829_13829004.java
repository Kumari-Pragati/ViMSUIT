package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.CardView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_13829_13829004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookUiTestProfilePicturePlaceholder() throws InterruptedException {
        // Step 1: Open the Drug Index app (already done by ActivityTestRule)

        // Step 2: Click on the Facebook login prompt
        onView(withId(R.id.facebook_login_button)).perform(click());
        Thread.sleep(500); // Wait for the transition

        // Step 3: Observe the profile picture placeholder
        onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait to ensure the view is fully displayed before assertion

        // Assert that the CardView (profile picture placeholder) is displayed correctly
        onView(withId(R.id.id_card_view)).check(matches(ViewMatchers.instanceOf(CardView.class)));
    }
}