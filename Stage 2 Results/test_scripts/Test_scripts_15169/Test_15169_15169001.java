package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15169_15169001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowCompleteBirthdayInputAndRegister() throws InterruptedException {
        // Open the app and navigate to the 'New User' screen (assuming it's already there)
        
        // Test each element
        for (int i = 0; i < 2; i++) {
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
            
            // Select month, day, and year from the date picker dialog
            onView(allOf(ViewMatchers.withClassName(containsString("DatePickerDialog$DayPickerView")), withText("1"))).perform(click());
            Thread.sleep(500);
            onView(allOf(ViewMatchers.withClassName(containsString("DatePickerDialog$MonthPickerView")), withText("January"))).perform(click());
            Thread.sleep(500);
            onView(allOf(ViewMatchers.withClassName(containsString("DatePickerDialog$YearPickerView")), withText("2000"))).perform(click());
            Thread.sleep(500);
            
            // Tap on the 'OK' button to confirm the birthday selection
            Espresso.closeSoftKeyboard();
            onView(withContentDescription("[None]")).perform(click());
            Thread.sleep(500);
        }
        
        // Tap on the 'REGISTER' button to complete the registration process
        onView(allOf(ViewMatchers.withId(android:id/button2), withText("REGISTER"))).perform(click());
        Thread.sleep(500);
        
        // Verify state: confirmation message and redirection to home screen or next appropriate screen
        onView(withText("Registration successful!")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}