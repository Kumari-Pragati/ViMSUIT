package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_1115_1115009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginButtonShouldNotBeClickableIfNotLoggedIn() throws InterruptedException {
        // Ensure the user is not logged in.
        // This step might require additional setup or logic to simulate an unlogged-in state.

        // Click on the 'Login' button at the bottom of the screen.
        Thread.sleep(500); // Wait for 500ms

        onView(withId(R.id.id_button_login)).perform(click());

        Thread.sleep(500); // Wait for 500ms

        // The 'Login' button should not be clickable.
        onView(withId(R.id.id_button_login)).check(matches(not(isClickable())));
    }
}