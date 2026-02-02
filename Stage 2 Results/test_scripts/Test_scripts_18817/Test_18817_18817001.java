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
public class Test_18817_18817001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowComposeEmailToKylie() throws InterruptedException {
        // Step 1: Open the app and navigate to the form screen for composing an email to Kylie.
        onView(ViewMatchers.withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter 'kylie@example.com' in the 'Email' field.
        Espresso.onView(ViewMatchers.withId(R.id.email_field))
                .perform(ViewActions.typeText("kylie@example.com"));
        Thread.sleep(500);

        // Step 3: Enter 'John Doe' in the 'Your Name' field.
        Espresso.onView(ViewMatchers.withId(R.id.your_name_field))
                .perform(ViewActions.typeText("John Doe"));
        Thread.sleep(500);

        // Step 4: Enter 'Hello Kylie, how are you?' in the 'Your Message' field.
        Espresso.onView(ViewMatchers.withId(R.id.message_field))
                .perform(ViewActions.typeText("Hello Kylie, how are you?"));
        Thread.sleep(500);

        // Step 5: Click the 'SEND' button.
        onView(withId(R.id.id_sendButton))
                .perform(click());
        Thread.sleep(500);

        // Verify that the email is sent successfully
        Espresso.onView(ViewMatchers.withText("Email sent successfully"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The `MainActivity` class and its layout should have corresponding views with IDs such as `email_field`, `your_name_field`, and `message_field`. Also, the success message "Email sent successfully" should be present in the UI for verification. Adjust the view matchers according to your actual app structure.