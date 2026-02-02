package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1371_1371001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFlightDetailsAreDisplayedCorrectly() throws InterruptedException {
        // Open the app and navigate to the flight itinerary screen.
        Thread.sleep(500);

        // Verify the departure city is displayed as 'Aalborg'.
        onView(withContentDescription("[None]")).perform(click());
        Espresso.onView(withText("Aalborg")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the destination city is displayed as 'Abu Dhabi'.
        Espresso.onView(withText("Abu Dhabi")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the flight title is displayed as 'AAL - AUH 05 Jan, Thu'.
        Espresso.onView(withText("AAL - AUH 05 Jan, Thu")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the flight duration is displayed as '11h 25m 2 stop'.
        Espresso.onView(withText("11h 25m 2 stop")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the first flight route is displayed as 'AAL (Aalborg) to CPH (Kastrup)'.
        Espresso.onView(withText("AAL (Aalborg) to CPH (Kastrup)")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the first flight departure time is displayed as '10:30'.
        Espresso.onView(withText("10:30")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the first flight arrival time is displayed as '11:10'.
        Espresso.onView(withText("11:10")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the first flight stop duration is displayed as '1h 15m in Copenhagen, Denmark'.
        Espresso.onView(withText("1h 15m in Copenhagen, Denmark")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the second flight route is displayed as 'CPH (Kastrup) to IST (Ataturk)'.
        Espresso.onView(withText("CPH (Kastrup) to IST (Ataturk)")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the second flight departure time is displayed as '12:25'.
        Espresso.onView(withText("12:25")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the second flight arrival time is displayed as '17:40'.
        Espresso.onView(withText("17:40")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Verify the second flight stop duration is displayed as '1h 35m in Istanbul'.
        Espresso.onView(withText("1h 35m in Istanbul")).inRoot(withDecorView(not(isRootView()))).check(matches(ViewMatchers.isDisplayed()));
    }
}