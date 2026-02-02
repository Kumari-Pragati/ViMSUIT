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
public class Test_1130_113002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheModalScreenAndSelectsContinueWithFreeResources() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Navigate to modal screen (assuming a method exists in MainActivity to show modal)
        Espresso.onView(withId(R.id.show_modal_button)).perform(ViewActions.click());

        // Wait for the modal screen to load
        Thread.sleep(500);

        // Click on 'CONTINUE WITH FREE RESOURCES'
        Espresso.onView(withId(R.id.id_upgrade_btn_continue)).perform(ViewActions.click());

        // Wait before assertions
        Thread.sleep(500);

        // Assert that the user remains on the modal screen
        Espresso.onView(withId(R.id.modal_screen_content)).check(matches(isDisplayed()));
    }
}