package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1115_1115004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginButtonShouldBeClickable() throws InterruptedException {
        // Wait for the view to be ready
        Thread.sleep(500);

        // Find the login button and check if it is clickable
        onView(withId(R.id.id_button_login)).check(ViewAssertions.matches(isClickable()));

        // Wait before next interaction
        Thread.sleep(500);
    }
}