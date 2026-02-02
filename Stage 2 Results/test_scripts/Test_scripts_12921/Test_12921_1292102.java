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

@RunWith(AndroidJUnit4.class)
public class Test_12921_1292102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigatingBetweenTabs() throws InterruptedException {
        // Click on the 'FOR YOU' tab
        onView(withContentDescription("For You")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));

        // Click on the 'HOMES' tab
        onView(withContentDescription("Homes")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));

        // Click on the 'EXPERIENCES' tab
        onView(withContentDescription("Experiences")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));

        // Click on the 'PLACES' tab
        onView(withContentDescription("Places")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(isDisplayed()));
    }
}