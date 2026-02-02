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
public class Test_18817_18817002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyFields() throws InterruptedException {
        // Element 1: withId(R.id.id_previousButton)
        onView(withId(R.id.id_previousButton))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state (optional, if needed for previous button)
        Espresso.onView(ViewMatchers.withText("Compose Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_sendButton)
        onView(withId(R.id.id_sendButton))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify error message
        Espresso.onView(ViewMatchers.withText("All fields are required"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state (optional, if needed for back button)
        Espresso.onView(ViewMatchers.withText("Compose Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 4: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state (optional, if needed for other buttons or elements)
        Espresso.onView(ViewMatchers.withText("Compose Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 5: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state (optional, if needed for other buttons or elements)
        Espresso.onView(ViewMatchers.withText("Compose Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 6: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state (optional, if needed for other buttons or elements)
        Espresso.onView(ViewMatchers.withText("Compose Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}