package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_18869_18869006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowCreateANewAccountWithInvalidEmailFormat() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the 'NEW ACCOUNT' title
        onView(withText("NEW ACCOUNT")).perform(click());
        Thread.sleep(500);

        // Step 3: Enter an email address with an invalid format into the 'EMAIL' input field
        onView(withId(R.id.email_input)).perform(ViewActions.typeText("invalidemail"));
        Thread.sleep(500);

        // Step 4: Click on the 'CREATE ACCOUNT' button
        onView(withId(R.id.id_reset_pass)).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating the email format is invalid
        onView(withText("Invalid email format")).inRoot(ViewMatchers.withParent(
                new RootMatcher(RootViewMatchers.isDialog()))).check(matches(isDisplayed()));
    }
}