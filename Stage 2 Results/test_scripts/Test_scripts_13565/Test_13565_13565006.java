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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13565_13565006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityScreenReaderSupport() throws InterruptedException {
        // Open the app and navigate to the screen displaying rental properties in Koramangala.
        
        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        onView(withContentDescription("['Open Drawer']"))
                .perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        onView(withId(R.id.id_mcr_button))
                .perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        onView(withId(R.id.id_menu_ad_list_search))
                .check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Test elements with no content description
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
    }
}