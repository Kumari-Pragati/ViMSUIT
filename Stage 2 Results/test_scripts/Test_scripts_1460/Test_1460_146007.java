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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1460_146007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickFinishWithSpecialCharacters() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming the People screen is the initial screen or can be navigated directly

        // Step 2: Click on the 'Add person' button
        onView(withId(R.id.add_person_button)).perform(click());

        Thread.sleep(500);

        // Step 3: Enter a name with special characters in the input field
        EditText nameField = (EditText) getInstrumentation().getTargetContext()
                .findViewById(R.id.person_name_field);
        nameField.perform(ViewActions.typeText("Special@#"));

        Thread.sleep(500);

        // Step 4: Click on the 'FINISH' button
        onView(withId(R.id.id_finish)).perform(click());

        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating that the name is invalid.
        onView(withText("Invalid name")).inRoot(isToast()).check(matches(ViewMatchers.isDisplayed()));
    }
}