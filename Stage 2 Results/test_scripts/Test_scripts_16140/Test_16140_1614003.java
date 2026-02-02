package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_16140_1614003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidEmail() throws InterruptedException {
        // Step 1: Click on the 'Kaydol' (Sign Up) button
        onView(withId(R.id.id_register_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter an invalid email address in the email input field
        Espresso.onView(ViewMatchers.withId(R.id.email_input_field))
                .perform(ViewActions.typeText("invalidemail"))
                .perform(ViewActions.closeSoftKeyboard());

        // Step 3: Enter a valid password in the password input field
        Espresso.onView(ViewMatchers.withId(R.id.password_input_field))
                .perform(ViewActions.typeText("ValidPassword123!"));

        // Step 4: Click on the 'Kaydol' (Sign Up) button again to submit the form
        Thread.sleep(500);
        onView(withId(R.id.id_register_button)).perform(ViewActions.click());

        // Expected Result: The app displays an error message indicating an invalid email address
        Espresso.onView(ViewMatchers.withText("Invalid email"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}