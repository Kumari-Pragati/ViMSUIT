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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12833_1283306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyAccessibilityusabilityOfTheReplyButton throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Animals & Nature' thread.
        // Assuming there is a method in MainActivity to navigate to the specific thread
        Espresso.onView(ViewMatchers.withText("Animals & Nature")).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the 'REPLY' button next to the first post.
        onView(withId(R.id.id_fab_add_content)).perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify that the reply form is accessible and usable.
        Espresso.onView(ViewMatchers.withText("New Reply")).check(ViewAssertions.matches(isDisplayed()));
    }
}