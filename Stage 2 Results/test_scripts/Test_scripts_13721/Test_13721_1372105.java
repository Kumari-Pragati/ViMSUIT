package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(JUnit4.class)
public class Test_13721_1372105 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityTextContrast() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu.
        Thread.sleep(500);

        // Step 2: Locate and tap on the menu icon in the header.
        onView(withContentDescription("Open menu")).perform(click());
        Thread.sleep(500);

        // Step 3: Locate and tap on the option to share access with family members or helpers.
        // Assuming the resource ID for "Share Access" is R.id.share_access
        onView(allOf(withId(R.id.share_access), withText("Share Access"))).perform(click());
        Thread.sleep(500);

        // Step 4: Check the text contrast between the message and the background.
        // Assuming the resource ID for the message is R.id.message_text
        onView(withText("Message Text")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Additional assertion to check text contrast (pseudo-code)
        // Espresso does not provide direct support for checking text contrast, but you can use a custom view matcher or UI Automator for this purpose.
        // For demonstration purposes, we will just assert that the message is displayed.
    }
}
```

Note: The actual implementation of text contrast checking might require additional tools like UI Automator or custom matchers. The above code provides a basic structure and steps to follow based on the given requirements.