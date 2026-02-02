package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217603 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignUpButtonWithEmptyFields() throws InterruptedException {
        // Test 'Sign Up' button
        onView(withId(R.id.id_fragment_main_sign_up_button))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed())
                .check(ViewAssertions.matches(ViewMatchers.withText("Please fill out all required fields.")));

        // Test 'Sign In' button
        onView(withId(R.id.id_fragment_main_sign_in_button))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed())
                .check(ViewAssertions.matches(ViewMatchers.withText("Please fill out all required fields.")));
    }
}