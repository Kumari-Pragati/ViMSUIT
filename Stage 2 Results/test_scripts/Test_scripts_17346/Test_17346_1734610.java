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
public class Test_17346_1734610 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAccessTheSettings() throws InterruptedException {
        // Step 1: Click on the gear icon in the title section.
        Thread.sleep(500);
        onView(withId(R.id.id_menu_button)).perform(ViewActions.click());

        // Expected Result: The settings screen should be displayed.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.settings_screen_container))
                .check(matches(isDisplayed()));
    }
}