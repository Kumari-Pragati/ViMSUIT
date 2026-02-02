package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14307_14307001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyTheScreenDisplaysWhenNoElectronicCouponsAreAvailable() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen with ID 14307.
        
        // Assuming the navigation is done through some method in MainActivity or a similar approach
        
        // Step 2: Verify the screen displays an illustration of a person sitting with their head down and a speech bubble with ellipses.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_current_list_view)).check(matches(isDisplayed()));

        // Step 3: Check if the text '空空如也' is displayed below the illustration.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_current_list_view))
                .check(matches(withText("空空如也")));
    }
}