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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13921_1392104 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyPasswordField() throws InterruptedException {
        // Step 1: Enter 'appcrawler4@gmail.com' into the email input field.
        onView(withId(R.id.id_login_email_input)).perform(clearText(), ViewActions.typeText("appcrawler4@gmail.com"));

        // Step 2: Tap the 'Sign in' button.
        Thread.sleep(500);
        onView(withId(R.id.id_login_sign_in_button)).perform(click());

        // Wait for 500ms to ensure the error message is displayed
        Thread.sleep(500);

        // Expected result: An error message is displayed indicating that the password field is required.
        onView(withText("Password is required")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(EditText.class)))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}