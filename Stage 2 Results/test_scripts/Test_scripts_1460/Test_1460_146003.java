package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1460_146003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickFinishWithoutAddingAPerson() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming PeopleScreen is the target screen, we need to interact with it.

        // Step 2: Click on the 'FINISH' button without adding a person.
        Thread.sleep(500); // Wait for UI to load
        onView(withId(R.id.id_finish)).perform(click());

        // Step 3: The app should display an error message indicating that a person needs to be added.
        Thread.sleep(500); // Wait for the error message to appear
        Espresso.onView(withText("Please add at least one person")).check(ViewAssertions.matches(isDisplayed()));
    }
}