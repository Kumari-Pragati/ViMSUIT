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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_1460_146008 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickFinishWithTooManyCharacters() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming that navigating to the People screen is already done by the ActivityTestRule

        // Step 2: Click on the 'Add person' button
        onView(withId(R.id.add_person_button)).perform(click());

        Thread.sleep(500);

        // Step 3: Enter a name with too many characters in the input field
        EditText nameField = activityTestRule.getActivity().findViewById(R.id.person_name_field);
        String longName = "a".repeat(101); // Example of a string with more than 100 characters
        nameField.setText(longName);

        Thread.sleep(500);

        // Step 4: Click on the 'FINISH' button
        onView(withId(R.id.id_finish)).perform(click());

        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating that the name is too long.
        onView(ViewMatchers.withText("Name must be less than 100 characters")).inRoot(
                org.hamcrest.core.Is.is(org.espresso.contrib.RootMatchers.dialogIsDisplayed()))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}