package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_12775_12775005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSortTheModListByCategory() throws InterruptedException {
        // Open the 'Falloutcrafter Mod' app

        // Tap on the 'ALL MODS' tab in the navigation bar
        onView(withId(R.id.id_howto)).perform(ViewActions.click());
        Thread.sleep(500);

        // Tap on the 'COSMETIC' tab in the navigation bar to sort the mod list by category
        onView(withId(R.id.id_sliding_tabs)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify state of each element

        // Element 1: withId(R.id.id_howto)
        onView(withId(R.id.id_howto)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_howto)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_sliding_tabs)
        onView(withId(R.id.id_sliding_tabs)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_sliding_tabs)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: withId(R.id.id_pager)
        onView(withId(R.id.id_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 4: withId(R.id.id_my_recycler_view)
        Espresso.onView(withId(R.id.id_my_recycler_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Elements 5-13: withContentDescription("[None]")
        for (int i = 0; i < 9; i++) {
            onView(withContentDescription("[None]")).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.onView(withContentDescription("[None]")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}