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
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_18817_18817005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyName() throws InterruptedException {
        // Step 2: Enter 'kylie@example.com' in the 'Email' field.
        Espresso.onView(ViewMatchers.withId(R.id.email_field))
                .perform(ViewActions.typeText("kylie@example.com"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 3: Leave the 'Your Name' field empty.

        // Step 4: Enter 'Hello Kylie, how are you?' in the 'Your Message' field.
        Espresso.onView(ViewMatchers.withId(R.id.message_field))
                .perform(ViewActions.typeText("Hello Kylie, how are you?"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 6; i++) {
            switch (i) {
                case 1:
                    // Element 1: withId(R.id.id_previousButton)
                    Espresso.onView(ViewMatchers.withId(R.id.id_previousButton))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 2:
                    // Element 2: withId(R.id.id_sendButton)
                    Espresso.onView(ViewMatchers.withId(R.id.id_sendButton))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    // Element 3: withContentDescription("['Navigate up']")
                    Espresso.onView(ViewMatchers.withContentDescription("['Navigate up']"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 4:
                case 5:
                case 6:
                    // Elements 4, 5, and 6: withContentDescription("[None]")
                    Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify the error message is displayed
        Espresso.onView(ViewMatchers.withText("Name is required"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}