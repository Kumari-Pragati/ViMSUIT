package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_14549_14549002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        // Element 1: withId(R.id.id_createAccount)
        onView(withId(R.id.id_createAccount))
                .perform(click());
        Thread.sleep(500);
        
        Espresso.onView(ViewMatchers.withText("Log In"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.ScrollView.class)))
                .perform(ViewActions.click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("airG Username"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.support.design.widget.TextInputLayout.class)))
                .perform(ViewActions.typeText("invalidUsername"));
        
        Espresso.onView(ViewMatchers.withText("Password"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.support.design.widget.TextInputLayout.class)))
                .perform(ViewActions.typeText("validPassword"));

        Espresso.onView(ViewMatchers.withText("Log In"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.ScrollView.class)))
                .perform(ViewActions.click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("Invalid credentials"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_signup_tandc)
        onView(withId(R.id.id_signup_tandc))
                .perform(click());
        Thread.sleep(500);
        
        Espresso.onView(ViewMatchers.withText("Log In"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.ScrollView.class)))
                .perform(ViewActions.click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("airG Username"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.support.design.widget.TextInputLayout.class)))
                .perform(ViewActions.typeText("invalidUsername"));
        
        Espresso.onView(ViewMatchers.withText("Password"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.support.design.widget.TextInputLayout.class)))
                .perform(ViewActions.typeText("validPassword"));

        Espresso.onView(ViewMatchers.withText("Log In"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.ScrollView.class)))
                .perform(ViewActions.click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("Invalid credentials"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}