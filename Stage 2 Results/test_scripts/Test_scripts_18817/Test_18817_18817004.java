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

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class Test_18817_18817004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyMessage() throws InterruptedException {
        // Step 2: Enter 'kylie@example.com' in the 'Email' field.
        Espresso.onView(ViewMatchers.withId(R.id.email_field))
                .perform(ViewActions.typeText("kylie@example.com"))
                .perform(ViewActions.closeSoftKeyboard());

        // Step 3: Enter 'John Doe' in the 'Your Name' field.
        Espresso.onView(ViewMatchers.withId(R.id.your_name_field))
                .perform(ViewActions.typeText("John Doe"))
                .perform(ViewActions.closeSoftKeyboard());

        // Step 4: Leave the 'Your Message' field empty.

        // Step 5: Click the 'SEND' button.
        Espresso.onView(ViewMatchers.withId(R.id.id_sendButton))
                .perform(ViewActions.click());
        
        Thread.sleep(500);

        // Verify error message is displayed
        Espresso.onView(ViewMatchers.withText("Message is required"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 1: Open the app and navigate to the form screen for composing an email to Kylie.
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 1: withId(R.id.id_previousButton)
        Espresso.onView(ViewMatchers.withContentDescription("Navigate up"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 2: withId(R.id.id_sendButton)
        Espresso.onView(ViewMatchers.withId(R.id.id_sendButton))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 3: withContentDescription("Navigate up")
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 4, 5, and 6: withContentDescription("[None]")
        for (int i = 1; i <= 3; i++) {
            Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                    .perform(ViewActions.click());
            Thread.sleep(500);
        }
    }
}