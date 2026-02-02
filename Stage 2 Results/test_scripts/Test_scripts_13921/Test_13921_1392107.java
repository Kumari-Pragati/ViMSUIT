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

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_13921_1392107 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyEmailFieldAndSkipButton throws InterruptedException {
        // Step 1: Enter 'password123' into the password input field.
        onView(withId(R.id.id_login_password_field)).perform(typeText("password123"));

        // Step 2: Tap the 'Skip' button.
        Thread.sleep(500);
        onView(withId(R.id.id_login_skip_button)).perform(ViewActions.click());

        // Wait for 500ms to ensure the error message is displayed
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating that the email field is required.
        onView(ViewMatchers.withText("Email is required")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}