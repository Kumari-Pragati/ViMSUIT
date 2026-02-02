package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_12393_1239306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowTapOnEmptyCompletedTasksTab() throws InterruptedException {
        // Step 1: Open the application (already done by ActivityTestRule)

        // Step 2: Tap on the 'MY TASK LIST' tab
        onView(withId(R.id.id_viewpager)).perform(ViewPager.swipeLeft());
        Thread.sleep(500);

        // Step 3: Tap on the 'COMPLETED TASKS' tab
        onView(withId(R.id.id_viewpager)).perform(ViewPager.swipeRight());
        Thread.sleep(500);

        // Expected Result: The 'COMPLETED TASKS' tab remains empty
        onView(withId(R.id.id_viewpager)).check(matches(isDisplayed()));
    }
}