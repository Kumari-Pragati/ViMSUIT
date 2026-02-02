package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_14630_1463009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheGridOfCatImagesIsScrollable() throws InterruptedException {
        // Wait for the view to be displayed
        onView(withId(R.id.id_viewpager_layout)).check(matches(isDisplayed()));

        // Perform a swipe right action to scroll through the grid of cat images
        onView(withId(R.id.id_viewpager_layout)).perform(swipeRight());

        // Add a delay between interactions
        Thread.sleep(500);

        // Verify that the view is still displayed after scrolling
        onView(withId(R.id.id_viewpager_layout)).check(matches(isDisplayed()));
    }
}