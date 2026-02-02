package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputAndVerifyTheNormalFetalHeartRateField() throws InterruptedException {
        // Open the app and navigate to the pregnancy calendar view

        // Element 1: withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withContentDescription("['Open navigation drawer']")).check(matches(isDisplayed()));

        // Element 2: withId(R.id.id_pager)
        onView(withId(R.id.id_pager)).perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 3: withId(R.id.id_listView)
        onView(withId(R.id.id_listView)).perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 4-7: withId(R.id.id_imageViewItem) (same for all, no action needed)
        for (int i = 1; i <= 4; i++) {
            onView(withId(R.id.id_imageViewItem)).perform(click());
            Thread.sleep(500);
            // Verify state
        }

        // Element 8: withId(R.id.id_buttonPrev)
        onView(withId(R.id.id_buttonPrev)).perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 9: withId(R.id.id_buttonNext)
        onView(withId(R.id.id_buttonNext)).perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 10: withContentDescription("['Open navigation drawer']")
        onView(withContentDescription("['Open navigation drawer']")).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));

        // Element 11: withContentDescription("['More options']")
        onView(withContentDescription("['More options']")).perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 12-14: withContentDescription("[None]") (same for all, no action needed)
        for (int i = 1; i <= 3; i++) {
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
            // Verify state
        }

        // Input and verify the normal fetal heart rate field
        onView(withId(R.id.normalFetalHeartRateField)).perform(typeText("120 bpm"), closeSoftKeyboard());
        Thread.sleep(500);
        // Verify the normal fetal heart rate field is updated to '120 bpm'
        onView(withId(R.id.normalFetalHeartRateField)).check(matches(withText("120 bpm")));
    }
}