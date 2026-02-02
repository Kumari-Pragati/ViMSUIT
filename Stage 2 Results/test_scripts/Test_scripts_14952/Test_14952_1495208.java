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
public class Test_14952_1495208 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestSkipButtonFlow() throws InterruptedException {
        // Wait for the onboarding screen to load
        Thread.sleep(500);

        // Click on the 'SKIP' button at the bottom
        onView(withId(R.id.id_next_btn)).perform(click());

        // Wait for 500ms before checking if the next screen is displayed
        Thread.sleep(500);

        // Assert that the next onboarding screen is displayed
        onView(withId(R.id.next_screen_id)).check(matches(isDisplayed()));
    }
}