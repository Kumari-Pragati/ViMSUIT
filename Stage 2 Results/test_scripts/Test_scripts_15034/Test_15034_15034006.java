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
public class Test_15034_15034006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheBorderWaitAppListing() throws InterruptedException {
        // Navigate to the promotional section (assuming it's a separate screen or can be navigated)
        Thread.sleep(500); // Wait for 500ms

        // Click on the 'Border Wait' app listing
        onView(withId(R.id.id_border_wait_button)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Assert that the app navigates to the 'Border Wait' app page (this is a placeholder assertion)
        onView(withId(R.id.id_border_wait_button)).check(matches(isDisplayed()));
    }
}