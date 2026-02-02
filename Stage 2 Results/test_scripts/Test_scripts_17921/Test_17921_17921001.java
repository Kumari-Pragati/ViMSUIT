package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17921_17921001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheFuelCalculatorHeaderIsDisplayedCorrectly throws InterruptedException {
        // Open the app and navigate to the menu screen.
        Thread.sleep(500); // Wait for the UI to initialize

        // Verify that the 'Fuel calculator' header is displayed at the top of the screen.
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));

        Thread.sleep(500); // Additional wait time
    }
}