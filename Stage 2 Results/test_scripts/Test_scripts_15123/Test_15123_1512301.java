package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15123_1512301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheWelcomeScreenDisplaysCorrectly() throws InterruptedException {
        // Verify the status bar at the top shows various icons and the time (8:52).
        Thread.sleep(500);
        onView(withId(R.id.id_bOnboardingF21)).check(matches(isDisplayed()));
        
        // Verify the large image of a person wearing a Forever 21 outfit is displayed.
        Thread.sleep(500);
        onView(withId(R.id.id_bOnboardingF21)).perform(ViewActions.click());
        Thread.sleep(500);
        onView(withText("FOREVER 21")).check(matches(isDisplayed()));
        
        // Verify the text "FOREVER 21" is prominently displayed in the center of the image.
        Thread.sleep(500);
        onView(withText("GET APP EXCLUSIVES")).check(matches(isDisplayed()));
        
        // Verify the text "GET APP EXCLUSIVES" is shown below the image.
        Thread.sleep(500);
        onView(withText("Enable Push Notifications in the Inbox for the lowdown on awesome sales and perks!")).check(matches(isDisplayed()));
        
        // Verify the text "Enable Push Notifications in the Inbox for the lowdown on awesome sales and perks!" is displayed.
        Thread.sleep(500);
        onView(withId(R.id.id_bOnboardingSkip)).check(matches(isDisplayed()));
        
        // Verify the "Sign In Forever 21 Account" button is present at the bottom.
        Thread.sleep(500);
        onView(withId(R.id.id_bOnboardingSkip)).perform(ViewActions.click());
        Thread.sleep(500);
        onView(withText("Sign In Forever 21 Account")).check(matches(isDisplayed()));
        
        // Verify the "Skip" option is present to the right of the sign-in button.
    }
}