package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17155_1715505 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignOutButtonFunctionality() throws InterruptedException {
        // Navigate to the Settings screen (assuming it's already on the main screen)
        
        // Tap on the 'SIGN OUT' button
        Thread.sleep(500);
        onView(withId(R.id.id_logoutButton)).perform(click());
        
        // Verify that the user is logged out and redirected to the login screen
        Thread.sleep(500);
        onView(withText("Login")).inRoot(org.hamcrest.core.AllOf.allOf(
                org.hamcrest.core.Is.is(org.hamcrest.core.IsNull.notNullValue()),
                org.hamcrest.core.StringContains.containsString("Login")
        )).check(matches(isDisplayed()));
    }
}