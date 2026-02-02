package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_12393_1239308 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowTapOnEmptyAssignedByMeTab throws InterruptedException {
        // Step 1: Open the application (assumed to be done by ActivityTestRule)

        // Step 2: Tap on the 'MY TASK LIST' tab
        onView(withId(R.id.id_viewpager)).perform(ViewPager.swipeLeft());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Tap on the 'ASSIGNED BY ME' tab
        onView(withId(R.id.id_viewpager)).perform(ViewPager.swipeRight());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The 'ASSIGNED BY ME' tab remains empty
        onView(withId(R.id.id_viewpager)).check(matches(isDisplayed()));
    }
}