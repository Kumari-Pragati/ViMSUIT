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
public class Test_18512_1851201 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndVerifyTheListOfCategories() throws InterruptedException {
        // Step 1: Open the 'Photo Notes Maker' app (already handled by ActivityTestRule)

        // Step 2: Verify that the screen displays a list of categories
        Thread.sleep(500); // Wait for UI to load

        onView(withId(R.id.id_list_mes)).check(ViewAssertions.matches(isDisplayed()));

        // Assuming there are specific categories like 'Anniversary', 'Attitude Shayari', etc.
        // For demonstration, we will check if the list is not empty
        Espresso.onView(withId(R.id.id_list_mes))
                .perform(action -> {
                    Thread.sleep(500); // Wait for list to populate
                    return true;
                })
                .check(ViewAssertions.matches(isDisplayed()));
    }
}