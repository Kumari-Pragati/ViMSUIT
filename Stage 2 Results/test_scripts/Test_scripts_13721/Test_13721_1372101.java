package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13721_1372101 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowAccessSharingConfirmation() throws InterruptedException {
        // Open the app and navigate to the menu.
        onView(withContentDescription("Open menu")).perform(click());
        
        Thread.sleep(500); // Wait for 500ms
        
        // Locate and tap on the option to share access with family members or helpers.
        onView(allOf(
                withText("Share Access"),
                withContentDescription("['Share access']")
        )).perform(click());
        
        Thread.sleep(500); // Wait for 500ms
        
        // Review the message: 'After you share access with your spouse, siblings or other helpers, you’ll see their activity here.'
        onView(withText("After you share access with your spouse, siblings or other helpers, you’ll see their activity here.")).check(matches(isDisplayed()));
        
        Thread.sleep(500); // Wait for 500ms
    }
}