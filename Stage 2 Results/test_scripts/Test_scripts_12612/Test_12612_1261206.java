package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_12612_1261206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Initial setup if needed
    }

    @Test
    public void testRegisterWithEmptyFields throws InterruptedException {
        // Step 1: Open the app - This is implicitly done by ActivityTestRule

        // Step 2: Click on the 'REGISTER' button
        onView(allOf(withId(R.id.register_button), withContentDescription("['Main Menu Closed']"))).perform(click());
        Thread.sleep(500);

        // Step 3: Enter an empty email in the email field - Assuming R.id.email_field is the ID for the email input field
        onView(withId(R.id.email_field)).perform(ViewActions.clearText()).perform(ViewActions.typeText(""));

        // Step 4: Enter an empty password in the password field - Assuming R.id.password_field is the ID for the password input field
        onView(withId(R.id.password_field)).perform(ViewActions.clearText()).perform(ViewActions.typeText(""));

        // Step 5: Click on the 'REGISTER' button
        onView(allOf(withId(R.id.register_button), withContentDescription("['Main Menu Closed']"))).perform(click());
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating required fields are empty - Assuming R.id.error_message is the ID for the error message view
        onView(withId(R.id.error_message)).check(matches(ViewMatchers.isDisplayed()));
    }
}