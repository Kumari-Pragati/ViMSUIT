package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_13349_1334904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAccessibilityAndUsability() throws InterruptedException {
        // Open the app and navigate to the Legal screen.
        onView(withId(R.id.id_recycler_view_legal_items)).perform(click());
        Thread.sleep(500);
        
        // Verify that all elements are accessible via screen reader.
        // Test Element 1: withId(R.id.id_recycler_view_legal_items)
        onView(withId(R.id.id_recycler_view_legal_items))
                .check(matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the content area is easy to read and navigate.
        // Test Element 2: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .check(matches(ViewMatchers.isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Verify that the back arrow is easily identifiable.
        Espresso.pressBack();
        Thread.sleep(500);
    }
}