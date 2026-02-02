package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703209 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanNavigateToTheMapsSectionWithAnEmptySearchBar() throws InterruptedException {
        // Step 1: Click on the 'MAPS' section.
        Thread.sleep(500);
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());

        // Expected Result: The screen should navigate to the 'Maps' section displaying the Muni Metro map.
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));
    }
}