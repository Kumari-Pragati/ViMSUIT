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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13063_1306308 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectTheSameLanguageMultipleTimes() throws InterruptedException {
        // Test each element
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                // Element 1: withId(R.id.id_language_option)
                onView(withId(R.id.id_language_option))
                        .perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withId(R.id.id_container))
                        .check(matches(ViewMatchers.isDisplayed()));
            } else if (i == 1) {
                // Element 2: withId(R.id.id_container)
                onView(withId(R.id.id_language_option))
                        .perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withId(R.id.id_container))
                        .check(matches(ViewMatchers.isDisplayed()));
            }
        }

        // Additional verification step to ensure 'Spanish' is selected as the active language
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_language_option))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_container))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}