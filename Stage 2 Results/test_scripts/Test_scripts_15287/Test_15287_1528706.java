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
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_15287_1528706 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithLongPassword() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'NAME' field
        Espresso.onView(withId(R.id.id_name)).perform(ViewActions.typeText("John Doe"));

        // Step 2: Enter 'johndoe@example.com' in the 'EMAIL' field
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_email)).perform(ViewActions.typeText("johndoe@example.com"));

        // Step 3: Enter 'P@ssw0rd1234567890' in the 'PASSWORD' field
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_password)).perform(ViewActions.typeText("P@ssw0rd1234567890"));

        // Step 4: Enter 'P@ssw0rd1234567890' in the 'RETYPE PASSWORD' field
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_retype_password)).perform(ViewActions.typeText("P@ssw0rd1234567890"));

        // Step 5: Click the 'SIGN UP' button
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_sign_up_button)).perform(ViewActions.click());

        // Expected Result: The user is successfully registered and redirected to the home screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Home Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}