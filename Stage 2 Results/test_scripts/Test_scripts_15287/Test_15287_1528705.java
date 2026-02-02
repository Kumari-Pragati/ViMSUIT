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
public class Test_15287_1528705 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithSpecialCharactersInPassword() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'NAME' field
        Espresso.onView(withId(R.id.id_name)).perform(ViewActions.typeText("John Doe"));

        // Step 2: Enter 'johndoe@example.com' in the 'EMAIL' field
        Espresso.onView(withId(R.id.id_email)).perform(ViewActions.typeText("johndoe@example.com"));

        // Step 3: Enter 'P@ssw0rd!' in the 'PASSWORD' field
        Espresso.onView(withId(R.id.id_password)).perform(ViewActions.typeText("P@ssw0rd!"), ViewActions.closeSoftKeyboard());

        Thread.sleep(500);

        // Step 4: Enter 'P@ssw0rd!' in the 'RETYPE PASSWORD' field
        Espresso.onView(withId(R.id.id_retype_password)).perform(ViewActions.typeText("P@ssw0rd!"));

        Thread.sleep(500);

        // Step 5: Click the 'SIGN UP' button
        Espresso.onView(withId(R.id.id_sign_up_button)).perform(ViewActions.click());

        Thread.sleep(500);

        // Expected Result: The user is successfully registered and redirected to the home screen
        Espresso.onView(ViewMatchers.withText("Home Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}