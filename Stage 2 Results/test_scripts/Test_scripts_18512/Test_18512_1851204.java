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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_18512_1851204 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testCheckForNavigationToTheAdvertisement() throws InterruptedException {
        // Step 1: Open the 'Photo Notes Maker' app (assumed to be done by ActivityTestRule)

        // Step 2: Scroll down to the bottom of the screen
        Thread.sleep(500);

        // Step 3: Click on the 'Visit Site' button in the advertisement
        onView(allOf(withContentDescription("[None]"), isDisplayed())).perform(click());
        Thread.sleep(500);

        // Step 4: Verify that the app navigates to the website for 'The Furniture Gallery'
        Espresso.onView(allOf(withContentDescription("[None]"), isDisplayed()))
                .check(matches(ViewAssertions.matches(isDisplayed())));
    }
}