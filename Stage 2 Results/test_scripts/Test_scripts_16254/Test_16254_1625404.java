package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.widget.CheckBox;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_16254_1625404 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private String username = "testuser";
    private String password = "testpass";

    @Before
    public void setUp() throws InterruptedException {
        Thread.sleep(500); // Add a small delay to ensure the UI is ready
    }

    @Test
    public void testToggleKeepMeLoggedInCheckbox() throws InterruptedException {
        // Step 1: Enter 'testuser' in the 'Username' field
        onView(withId(R.id.id_username)).perform(typeText(username));

        Thread.sleep(500); // Add a small delay to ensure the UI is ready

        // Step 2: Enter 'testpass' in the 'Password' field
        onView(withId(R.id.id_password)).perform(clearText(), typeText(password));

        Thread.sleep(500); // Add a small delay to ensure the UI is ready

        // Step 3: Toggle the 'Keep me logged in' checkbox
        CheckBox keepMeLoggedInCheckbox = (CheckBox) activityRule.getActivity().findViewById(R.id.id_login_checkbox);
        if (!keepMeLoggedInCheckbox.isChecked()) {
            keepMeLoggedInCheckbox.perform(ViewActions.click());
        }

        Thread.sleep(500); // Add a small delay to ensure the UI is ready

        // Step 4: Click on the 'Sign In' button
        onView(withText("Sign In")).perform(ViewActions.click());

        Thread.sleep(500); // Add a small delay to ensure the UI is ready

        // Expected Result: The user is logged in successfully and the 'Keep me logged in' checkbox is checked
        onView(withId(R.id.id_login_checkbox)).check(matches(ViewMatchers.isChecked()));
    }
}