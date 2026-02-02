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

@RunWith(AndroidJUnit4.class)
public class Test_1130_113003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheModalScreenAndClicksOnTheJoinCodeButton() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Open the modal screen (assuming it's opened by some action, e.g., clicking a button)
        Espresso.onView(withId(R.id.open_modal_button)).perform(ViewActions.click());

        // Wait for the modal screen to load
        Thread.sleep(500);

        // Click on the 'JOIN CODE' button
        Espresso.onView(withId(R.id.id_upgrade_btn_join)).perform(ViewActions.click());

        // Wait before checking the result
        Thread.sleep(500);

        // Assert that the user is prompted to enter a join code (this might require custom view checks)
        Espresso.onView(withId(R.id.join_code_input_field))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Optionally, you can add more assertions based on your UI elements
    }
}