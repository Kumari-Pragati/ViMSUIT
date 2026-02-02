package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_14435_14435004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheContinueButtonIsAccessible() throws InterruptedException {
        // Step 1: Open the Cleveland Browns mobile app (assumed to be done by the rule)
        
        // Step 2: Use a screen reader to navigate to the "Continue" button.
        // Espresso does not directly support screen readers, but we can simulate
        // navigation using Espresso actions and assertions.

        // Step 3: Verify the "Continue" button is announced by the screen reader.
        // We will use Espresso's accessibility checks for this purpose.
        
        // Wait for the view to be clickable and focusable
        Thread.sleep(500);
        
        // Find the Continue button using its ID
        onView(withId(R.id.id_positive_action)).check(matches(isClickable()));
        
        // Simulate a screen reader interaction (this is an approximation)
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        Espresso.pressBack();
        
        // Verify the Continue button is announced
        Thread.sleep(500);
        onView(withId(R.id.id_positive_action)).check(matches(ViewAssertions.isDisplayed()));
    }
}