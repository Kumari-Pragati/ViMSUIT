package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import static android.support.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
public class Test_16886_16886003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheShareIconOpensTheSharingOptions() throws InterruptedException {
        // Step 1: Open the app and navigate to the property listing screen.
        // Assuming the property listing screen is already open, if not, add navigation steps here.

        // Step 2: Click on the share icon in the header.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Step 3: Verify the sharing options are opened.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Cancel"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}