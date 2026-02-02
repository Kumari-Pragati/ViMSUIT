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
public class Test_1863_186303 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheLargeCentralImageOfAStylizedPairOfGlassesWithAStar() throws InterruptedException {
        // Open the app and navigate to the screen with the large central image of a stylized pair of glasses with a star.
        onView(withContentDescription("['Navigate up']")).perform(click());
        
        Thread.sleep(500); // Wait for 500 milliseconds

        // Verify that the large central image of a stylized pair of glasses with a star is visible
        onView(ViewMatchers.withId(R.id.large_central_image)).check(matches(isDisplayed()));
    }
}