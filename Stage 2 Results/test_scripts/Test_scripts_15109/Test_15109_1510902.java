package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15109_1510902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheBackArrowToNavigateToThePreviousScreen() throws InterruptedException {
        // Step 1: Click on the Back Arrow
        onView(withId(R.id.id_page_header_icon_click)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms to ensure navigation is complete

        // Step 2: Verify navigation to the previous screen
        Espresso.onView(isDisplayed()).check(matches(withId(R.id.previous_screen_element_id)));
    }
}