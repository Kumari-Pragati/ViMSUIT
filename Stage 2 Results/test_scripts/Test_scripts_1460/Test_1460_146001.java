package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_1460_146001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowAddAPersonSuccessfully() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming the People screen is already open or can be navigated directly

        // Step 2: Click on the 'Add person' button.
        Espresso.onView(ViewMatchers.withId(R.id.add_person_button)).perform(ViewActions.click());

        // Step 3: Enter a name for the person in the input field.
        Espresso.onView(ViewMatchers.withId(R.id.person_name_input))
                .perform(ViewActions.typeText("John Doe"));

        // Step 4: Click on the 'FINISH' button.
        Thread.sleep(500); // Wait for UI to update
        Espresso.onView(ViewMatchers.withId(R.id.id_finish)).perform(ViewActions.click());

        // Expected Result: The app should display a confirmation message indicating the person has been added successfully.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Person added successfully!"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Expected Result: The 'People' screen should show the newly added person.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("John Doe")).inRoot(
                ViewMatchers.withParent(
                        ViewMatchers.isAssignableFrom(Button.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}