package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_13063_1306306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectMultipleLanguages() throws InterruptedException {
        // Step 2: Navigate to the language selection screen

        // Element 1: withId(R.id.id_language_option)
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Spanish")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state
        Espresso.onView(ViewMatchers.withText("Spanish"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_language_option)
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("German")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state
        Espresso.onView(ViewMatchers.withText("German"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 1: withId(R.id.id_language_option)
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("French")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state
        Espresso.onView(ViewMatchers.withText("French"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_container)
        onView(withId(R.id.id_container)).perform(click());
        Thread.sleep(500);
    }
}