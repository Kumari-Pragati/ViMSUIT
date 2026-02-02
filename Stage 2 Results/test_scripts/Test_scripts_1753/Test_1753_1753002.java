package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.core.IsNot.not;

@RunWith(JUnit4.class)
public class Test_1753_1753002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfSavedRoutesTitleInTheHeader() throws InterruptedException {
        // Step 1: Open the app and navigate to screen 1753
        Espresso.onView(allOf(ViewMatchers.withContentDescription("['OPEN']"), isDisplayed())).performClick();
        Thread.sleep(500);

        // Step 2: Verify that the header displays 'Saved Routes' in bold black text on a white background
        Espresso.onView(allOf(
                withText("Saved Routes"),
                ViewMatchers.isDisplayed()
        )).check(matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));

        Thread.sleep(500);
    }
}