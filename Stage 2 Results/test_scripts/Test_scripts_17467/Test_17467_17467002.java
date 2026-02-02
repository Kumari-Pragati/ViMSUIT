package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17467_17467002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheMainImageIsDisplayedCorrectly() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_backgroundImage))
                .check(matches(isDisplayed()));
        Thread.sleep(500);
        
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));
        Thread.sleep(500);
    }
}