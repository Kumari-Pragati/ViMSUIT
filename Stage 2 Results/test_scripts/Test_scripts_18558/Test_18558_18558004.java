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
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18558_18558004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationUserSkipsTheCurrentStep() throws InterruptedException {
        // Wait for the view to be clickable and then click on it
        onView(withId(R.id.id_button_skip)).check(matches(isClickable()));
        Thread.sleep(500);
        onView(withId(R.id.id_button_skip)).perform(click());
        Thread.sleep(500);

        // Assert that the user is redirected to the next step in the onboarding process
        // This assertion should be replaced with a more specific check, such as verifying the UI elements of the next screen
        // For example: onView(withId(R.id.next_screen_element)).check(matches(isDisplayed()));
    }
}