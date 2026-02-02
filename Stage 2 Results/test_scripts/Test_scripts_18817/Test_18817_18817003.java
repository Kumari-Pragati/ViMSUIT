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
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18817_18817003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidEmail() throws InterruptedException {
        // Step 2: Enter 'invalid-email' in the 'Email' field.
        onView(withId(R.id.email_field))
                .perform(typeText("invalid-email"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 3: Enter 'John Doe' in the 'Your Name' field.
        onView(withId(R.id.your_name_field))
                .perform(typeText("John Doe"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 4: Enter 'Hello Kylie, how are you?' in the 'Your Message' field.
        onView(withId(R.id.your_message_field))
                .perform(typeText("Hello Kylie, how are you?"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 5: Click the 'SEND' button.
        onView(withId(R.id.id_sendButton))
                .perform(click());
        Thread.sleep(500);

        // Verify error message is displayed
        onView(withContentDescription("['Navigate up']"))
                .check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 6; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_previousButton))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    // Already performed in step 5
                    break;
                case 3:
                    // Already verified in the previous step
                    break;
                default:
                    // Skip elements with no content description or perform a dummy action
                    break;
            }
        }

        // Verify error message is displayed for invalid email
        onView(withId(R.id.error_message))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The `MainActivity` class and the IDs (`R.id.email_field`, `R.id.your_name_field`, `R.id.your_message_field`, `R.id.id_sendButton`, `R.id.id_previousButton`, `R.id.error_message`) are assumed to be part of your application's UI. You may need to adjust these based on your actual implementation.