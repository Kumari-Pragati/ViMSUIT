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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(JUnit4.class)
public class Test_1622_1622007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyPassword() throws InterruptedException {
        // Step 1: Open the Vingle app (Assuming it's already open, or this step is handled by setup)
        
        // Step 2: Click on the 'Log In' button
        onView(withContentDescription("Log In")).perform(click());
        Thread.sleep(500);

        // Step 3: Select 'Start with Email' as the login option (Assuming it's already selected, or this step is handled by setup)
        
        // Step 4: Enter valid email credentials
        onView(allOf(withId(R.id.email_input), isDisplayed())).perform(ViewActions.typeText("validemail@example.com"));
        Thread.sleep(500);

        // Step 5: Enter empty password
        onView(allOf(withId(R.id.password_input), isDisplayed())).perform(ViewActions.clearText(), ViewActions.typeText(""));
        Thread.sleep(500);

        // Step 6: Click the 'Log In' button
        Espresso.closeSoftKeyboard();
        onView(allOf(withId(R.id.login_button), isDisplayed())).perform(click());
        Thread.sleep(500);

        // Expected Result: Login attempt fails with error message
        onView(allOf(withId(R.id.error_message), isDisplayed())).check(matches(ViewMatchers.withText("Password cannot be empty")));
    }
}