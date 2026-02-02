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
public class Test_1460_146006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickFinishWithEmptyInput() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming PeopleScreen is launched by default or we can navigate manually

        // Step 2: Click on the 'Add person' button.
        onView(withId(R.id.add_person_button)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Enter an empty name in the input field.
        EditText nameField = (EditText) activityTestRule.getActivity().findViewById(R.id.name_field);
        nameField.perform(ViewActions.clearText());
        nameField.perform(ViewActions.typeText(""));

        Thread.sleep(500); // Wait for UI to update

        // Step 4: Click on the 'FINISH' button.
        onView(withId(R.id.id_finish)).perform(click());

        Thread.sleep(500); // Wait for error message to appear

        // EXPECTED RESULT: The app should display an error message indicating that the name is required.
        onView(withText("Name is required")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.Toast.class)))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}