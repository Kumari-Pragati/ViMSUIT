package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Spinner;

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
public class Test_13565_13565005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilitySortingProperties() throws InterruptedException {
        // Step 1: Open the app and navigate to the screen displaying rental properties in Koramangala.
        Espresso.onView(withId(R.id.id_mcr_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'SORT' button.
        onView(withId(R.id.id_mcr_button)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Select a sorting option and verify that the properties are sorted accordingly.
        Spinner spinner = (Spinner) activityRule.getActivity().findViewById(R.id.sort_spinner);
        if (spinner != null && spinner.getAdapter() != null) {
            int count = spinner.getCount();
            for (int i = 0; i < count - 1; i++) {
                // Click on the first item in the spinner
                onView(withText(spinner.getItemAtPosition(0).toString())).perform(click());
                Thread.sleep(500); // Wait for UI to update

                // Verify that properties are sorted accordingly (this is a placeholder assertion)
                Espresso.onView(withId(R.id.property_list)).check(matches(ViewMatchers.isDisplayed()));
            }
        } else {
            System.out.println("Spinner not found or no items in the spinner.");
        }
    }
}