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
public class Test_10966_1096607 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfLinksToTer() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'About' page.
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Step 2: Verify that links to 'Ter are present.
        onView(allOf(withText("Ter"), withContentDescription("['Ter']"))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500); // Wait before next interaction
    }
}