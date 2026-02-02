package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.widget.ImageButton;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_12612_1261204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Wait for the app to be fully loaded before starting tests
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegisterWithValidCredentials() throws InterruptedException {
        // Step 1: Open the app - This is handled by ActivityTestRule

        // Step 2: Click on the 'REGISTER' button
        onView(withId(R.id.register_button)).perform(click());

        // Step 3: Enter a valid email in the email field
        onView(withId(R.id.email_field)).perform(ViewActions.typeText("test@example.com"));

        // Step 4: Enter a valid password in the password field
        onView(withId(R.id.password_field)).perform(ViewActions.typeText("TestPassword123!"));

        // Step 5: Click on the 'REGISTER' button
        onView(withId(R.id.register_button)).perform(click());

        // Wait for the registration process to complete
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Expected Result: The user is registered successfully
        // Assuming there's a success message or some UI element that indicates successful registration
        onView(withContentDescription("['Main Menu Closed']")).check(matches(ViewMatchers.isDisplayed()));

        // Additional assertion to check if the main menu closed button is displayed (indicating successful registration)
        Espresso.onView(withId(R.id.main_menu_closed_button)).check(matches(ViewMatchers.isDisplayed()));
    }
}