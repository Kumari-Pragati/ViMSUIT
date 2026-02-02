package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.CheckBox;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16254_1625406 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithKeepMeLoggedInCheckboxUnchecked() throws InterruptedException {
        // Step 1: Enter 'testuser' in the 'Username' field
        onView(withId(R.id.id_username)).perform(ViewActions.typeText("testuser"));

        // Step 2: Enter 'testpass' in the 'Password' field
        Thread.sleep(500);
        onView(withId(R.id.id_password)).perform(ViewActions.typeText("testpass"));

        // Step 3: Click on the 'Sign In' button
        Thread.sleep(500);
        onView(withText("Sign In")).perform(click());

        // Expected Result: The user is logged in successfully and the 'Keep me logged in' checkbox is unchecked
        Thread.sleep(500);
        CheckBox keepMeLoggedInCheckbox = (CheckBox) activityRule.getActivity().findViewById(R.id.id_login_checkbox);
        assertFalse(keepMeLoggedInCheckbox.isChecked());
        
        // Additional assertion to ensure login was successful, this might vary based on your actual UI implementation
        onView(withId(R.id.id_username)).check(matches(withText("testuser")));
    }
}