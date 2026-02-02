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
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_15287_1528704 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithDifferentPasswords() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'NAME' field
        onView(withId(R.id.id_name)).perform(typeText("John Doe"), ViewActions.closeSoftKeyboard());

        // Step 2: Enter 'johndoe@example.com' in the 'EMAIL' field
        Thread.sleep(500);
        onView(withId(R.id.id_email)).perform(typeText("johndoe@example.com"), ViewActions.closeSoftKeyboard());

        // Step 3: Enter 'P@ssw0rd' in the 'PASSWORD' field
        Thread.sleep(500);
        onView(withId(R.id.id_password)).perform(clearText(), typeText("P@ssw0rd"));

        // Step 4: Enter 'P@ssw0rd123' in the 'RETYPE PASSWORD' field
        Thread.sleep(500);
        onView(withId(R.id.id_retype_password)).perform(clearText(), typeText("P@ssw0rd123"));

        // Step 5: Click the 'SIGN UP' button
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_sign_up_button)).perform(ViewActions.click());

        // Expected Result: An error message is displayed indicating that the passwords do not match
        Thread.sleep(500);
        onView(withText("Passwords do not match")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}