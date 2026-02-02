package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17576_1757603 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheOkButton() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Help/Info' page.
        // Assuming that navigating to Help/Info page is handled by some action in MainActivity

        // Step 2: Verify that the 'OK' button is present at the bottom of the screen
        Thread.sleep(500); // Wait for UI to load and stabilize

        onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        // Additional assertion to check if the OK button is clickable and focusable
        Button okButton = (Button) activityTestRule.getActivity().findViewById(R.id.button3);
        assert okButton != null : "OK button not found";
        assert okButton.isClickable() && okButton.isFocusable() : "OK button is not interactive";

        // Additional Espresso assertion to verify the text of the OK button
        onView(withId(R.id.button3)).check(matches(ViewMatchers.withText("OK")));
    }
}