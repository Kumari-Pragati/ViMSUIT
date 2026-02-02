package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17576_1757601 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheHelpinfoPageTitle() throws InterruptedException {
        // Thread.sleep(500) to allow the UI to settle after opening the app
        Thread.sleep(500);

        // Navigate to the 'Help/Info' page (assuming there is a button or action that navigates to this page)
        onView(withContentDescription("[None]")).perform(click());
        
        // Wait for 500ms before checking the title
        Thread.sleep(500);
        
        // Verify that the title 'Help/Info' is displayed at the top of the screen
        onView(withText("Help/Info")).check(matches(isDisplayed()));
    }
}