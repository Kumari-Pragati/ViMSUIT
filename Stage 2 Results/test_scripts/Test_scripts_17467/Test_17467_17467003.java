package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_17467_17467003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFooterAdIsDisplayedCorrectly() throws InterruptedException {
        // Open the app and observe the footer ad
        Thread.sleep(500); // Wait for the app to open

        // Check if the advertisement banner with the text 'AFRICA IS NOW CLOSER THAN EVER' and the logo for 'VueTel' is displayed correctly
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        // Add a delay between interactions
        Thread.sleep(500);
    }
}