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
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10966_1096602 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheTitleComprehensiveEyeExamAnywhereAtYourConvenience() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'About' page.
        Thread.sleep(500); // Wait for the activity to load

        // Step 2: Verify that the title reads 'Comprehensive Eye Exam anywhere at your convenience!'.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText(R.string.about_title))
                .check(matches(withText("Comprehensive Eye Exam anywhere at your convenience!")));
    }
}