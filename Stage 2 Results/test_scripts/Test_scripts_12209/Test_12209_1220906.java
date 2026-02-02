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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_12209_1220906 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testClickOnTheBroncosMascotImageInTheAtTheGameSection() throws InterruptedException {
        // Wait for the view to be clickable and enabled
        onView(withId(R.id.id_card_view_pager_holder)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.id_card_view_pager_holder)).perform(ViewActions.click());

        // Sleep to ensure the transition is complete before assertions
        sleep(500);

        // Assert that the user is redirected to a page with more information about the Broncos mascot
        // This assertion should be replaced with actual UI checks or data checks based on your app's implementation
        Espresso.onView(withId(R.id.broncos_mascot_info)).check(ViewAssertions.matches(isEnabled()));
    }
}