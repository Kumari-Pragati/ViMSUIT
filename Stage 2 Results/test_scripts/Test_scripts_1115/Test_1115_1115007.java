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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_1115_1115007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testIllustrationShouldBeDisplayed() throws InterruptedException {
        // Verify that the illustration of a wallet and a ticket with a percentage symbol is displayed

        // Element 1: withId(R.id.id_button_login)
        onView(withId(R.id.id_button_login)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 2: withId(R.id.id_button_sign_up)
        onView(withId(R.id.id_button_sign_up)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 3: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 4: withContentDescription("[None]")
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}