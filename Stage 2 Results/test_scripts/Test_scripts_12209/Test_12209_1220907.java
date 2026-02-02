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
public class Test_12209_1220907 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnThePromotionsSectionAndVerifyTheContent() throws InterruptedException {
        // Step 1: Click on the 'PROMOTIONS' section
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_scroll_view)).perform(ViewActions.click());

        // Step 2: Verify the content of the 'PROMOTIONS' section
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_scroll_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}