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

import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10482_1048201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnterValidPhoneNumber() throws InterruptedException {
        // Navigate to the 'Phone for Checkout' screen (assuming it's already on this screen)
        
        // Tap on the text input field labeled 'Phone'
        onView(withId(R.id.id_editTextField)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms
        
        // Enter the phone number '123-456-7890'
        onView(withId(R.id.id_editTextField)).perform(ViewActions.typeText("123-456-7890"));
        
        Thread.sleep(500); // Wait for 500ms
        
        // Verify that the phone number is correctly entered
        Espresso.onView(withId(R.id.id_editTextField)).check(ViewAssertions.matches(
                org.hamcrest.core.AllOf.allOf(
                        org.hamcrest.Description.descriptionOfValue("123-456-7890"),
                        org.hamcrest.core.Is.is(org.hamcrest.core.StringContains.containsString("123-456-7890"))
                )
        ));
    }
}