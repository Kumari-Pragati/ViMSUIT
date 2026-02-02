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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13575_1357503 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationSelectTheFirstCategory() throws InterruptedException {
        // Open the app and navigate to the category selection screen
        Thread.sleep(500); // Wait for the UI to load

        // Tap on the first category option
        onView(withId(R.id.id_category_subcategory_list)).perform(click());
        Thread.sleep(500); // Wait for the selection to take effect

        // Verify that the first category is selected
        onView(withText("First Category Text")).check(matches(isDisplayed()));
    }
}