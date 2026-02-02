package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1068_1068007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAddANewLocation() throws InterruptedException {
        // Step 1: Click on the pink circular button with a plus sign in the bottom right corner.
        onView(withId(R.id.id_fab_expand_menu_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter a new location and save.
        EditText locationEditText = activityRule.getActivity().findViewById(R.id.location_edit_text);
        if (locationEditText != null) {
            locationEditText.perform(ViewActions.typeText("New Location"));
        }
        Espresso.onView(withText("Save")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The new location is successfully added.
        onView(withText("New Location")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}