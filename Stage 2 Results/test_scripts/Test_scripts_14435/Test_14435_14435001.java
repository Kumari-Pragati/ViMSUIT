package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_14435_14435001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheWelcomeScreenDisplaysCorrectly() throws InterruptedException {
        // Step 2: Verify the status bar shows the time as 7:52 and various system icons.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("7:52")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Step 3: Verify the promotional image of a Cleveland Browns coach is displayed.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.promotional_image)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 4: Verify the navigation bar with icons for "Latest," "Social," "Fan Zone," "Schedule," and "Tickets" is positioned below the image.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.nav_bar)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 5: Verify the section labeled "Latest Media - August 25, 2016" displays a thumbnail of a video titled "Building the Browns."
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Latest Media - August 25, 2016")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("Building the Browns")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(AppCompatButton.class))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 6: Verify the main content area welcomes users with the text: "Welcome to the Browns App. This app allows the Dawg Pound to get the latest Browns news, video and live radio."
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Welcome to the Browns App. This app allows the Dawg Pound to get the latest Browns news, video and live radio.")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 7: Verify the prominent "Continue" button is located at the bottom of the screen.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_positive_action)).perform(ViewActions.click());
    }
}