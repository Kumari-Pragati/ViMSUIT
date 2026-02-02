package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanAccessServiceInformationForASpecificLine() throws InterruptedException {
        // Step 1: Click on the 'i' icon next to the 'Taraval' line.
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI updates
        
        // Expected result: The screen should display detailed service information for the 'Taraval' line.
        Espresso.onView(withId(R.id.service_info_text)).check(matches(ViewMatchers.isDisplayed()));
    }
}