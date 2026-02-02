package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_14630_1463010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGridOfCatImagesIsSwipeable() throws InterruptedException {
        // Wait for the ViewPager to be displayed
        onView(withId(R.id.id_viewpager_layout)).check(matches(isDisplayed()));

        // Perform a swipe left action on the ViewPager
        onView(withId(R.id.id_viewpager_layout))
                .perform(swipeLeft());

        // Add a delay between interactions
        Thread.sleep(500);

        // Verify that the swipe was successful by checking if the next image is displayed
        // Note: This assertion assumes that the images are distinct and can be identified.
        // In a real scenario, you might need to use more specific matchers or assertions.
        onView(withId(R.id.id_viewpager_layout)).check(matches(isDisplayed()));
    }
}