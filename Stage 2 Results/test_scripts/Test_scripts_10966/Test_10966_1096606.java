package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_10966_1096606 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfSocialMediaIconsForSharing() throws InterruptedException {
        // Navigate to the 'About' page (assuming there is a way to navigate to it)
        // For demonstration, we will use Thread.sleep as a placeholder for navigation logic
        Thread.sleep(500);

        // Verify that social media icons for sharing are present
        onView(withId(R.id.id_facebook_share_icon)).check(matches(isDisplayed()));

        // Add a delay between interactions (as per requirement 7)
        Thread.sleep(500);
    }
}