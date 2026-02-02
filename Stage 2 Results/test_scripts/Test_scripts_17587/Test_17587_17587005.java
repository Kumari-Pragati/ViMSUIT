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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheHomeButtonInTheFooter() throws InterruptedException {
        // Step 1: Open the news app (already done by ActivityTestRule)

        // Step 2: Tap on the 'For You' tab in the navigation bar.
        onView(withId(R.id.nav_for_you)).perform(click());
        Thread.sleep(500);

        // Step 3: Tap on the 'Home' button in the footer.
        onView(withId(R.id.id_o3)).check(matches(isClickable())).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should navigate to the home screen.
        assertTrue("Expected to be on the home screen", activityRule.getActivity().isHomeScreenVisible());
    }
}