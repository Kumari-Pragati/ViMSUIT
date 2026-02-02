package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_11393_1139303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestVerifyTheVisibilityOfTheOffairLabel() throws InterruptedException {
        // Element 1: Search Icon
        onView(withContentDescription("['Search']"))
                .perform(click());
        Thread.sleep(500);
        verifyOffAirLabel();

        // Element 2: More Options
        Espresso.closeSoftKeyboard();
        onView(withContentDescription("['More options']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyOffAirLabel();

        // Element 3: None (Assuming it's a default or no content description)
        Espresso.closeSoftKeyboard();
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyOffAirLabel();
    }

    private void verifyOffAirLabel() {
        // Assuming the 'Off-air' label is in a list item, we can use a generic matcher
        Espresso.onView(ViewMatchers.withText("Off-air"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}