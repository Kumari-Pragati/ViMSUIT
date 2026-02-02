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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_1622_1622003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmail() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Click on the 'Log In' button
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 3: Select 'Start with Email' as the login option (Assuming it's already selected)
        
        // Step 4: Enter email credentials
        onView(withId(R.id.email_input)).perform(typeText("test@example.com"));
        Thread.sleep(500);

        // Step 5: Enter password
        onView(withId(R.id.password_input)).perform(typeText("password123"));
        Thread.sleep(500);

        // Step 6: Click the 'Log In' button
        Espresso.closeSoftKeyboard();
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 7: Verify if the user is logged in successfully
        onView(withId(R.id.user_profile)).check(matches(ViewMatchers.isDisplayed()));
    }
}