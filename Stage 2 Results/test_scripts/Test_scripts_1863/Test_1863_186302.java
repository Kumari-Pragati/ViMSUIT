package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_1863_186302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheTitleFindGaborInTheHeader() throws InterruptedException {
        // Navigate up to go back to the previous screen (assuming 'Find Gabor' is in the header)
        onView(withContentDescription("Navigate up")).perform(click());
        
        Thread.sleep(500); // Wait for 500ms

        // Verify that the title 'Find Gabor' is visible in the header
        onView(ViewMatchers.withText("Find Gabor")).check(matches(isDisplayed()));
    }
}