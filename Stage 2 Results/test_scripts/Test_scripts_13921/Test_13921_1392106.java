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
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Test_13921_1392106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithSkipButton() throws InterruptedException {
        // Step 1: Enter 'appcrawler4@gmail.com' into the email input field.
        onView(withId(R.id.id_login_email_input)).perform(typeText("appcrawler4@gmail.com"), ViewActions.closeSoftKeyboard());

        // Step 2: Enter 'password123' into the password input field.
        onView(withId(R.id.id_login_password_input)).perform(clearText(), typeText("password123"), ViewActions.closeSoftKeyboard());

        // Step 3: Tap the 'Skip' button.
        Thread.sleep(500); // Wait for UI to update
        onView(withId(R.id.id_login_skip_button)).perform(ViewActions.click());

        // Expected Result: The user is redirected to the main screen without logging in.
        Thread.sleep(500); // Wait for UI to update

        // Assert that we are on the main screen (you may need to customize this based on your app's layout)
        onView(withId(R.id.main_screen_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}