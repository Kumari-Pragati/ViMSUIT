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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1460_146005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickFinishWithInvalidInput() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming the People screen is already open or can be navigated directly.

        // Step 2: Click on the 'Add person' button.
        onView(withId(R.id.add_person_button)).perform(click());

        Thread.sleep(500);

        // Step 3: Enter an invalid name (e.g., a number) in the input field.
        onView(withId(R.id.person_name_input)).perform(clearText(), ViewActions.typeText("1234"));

        Thread.sleep(500);

        // Step 4: Click on the 'FINISH' button.
        onView(withId(R.id.id_finish)).perform(click());

        Thread.sleep(500);

        // EXPECTED RESULT: The app should display an error message indicating that the name is invalid.
        onView(withText("Invalid input")).inRoot(isToast()).check(matches(ViewMatchers.isDisplayed()));
    }
}