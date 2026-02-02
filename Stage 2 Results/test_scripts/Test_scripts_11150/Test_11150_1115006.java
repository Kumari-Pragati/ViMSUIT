package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_11150_1115006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePencilIconFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the feedback review screen.
        // Assuming the feedback review screen is already open or can be navigated directly.

        // Step 2: Click on the pencil icon in the header.
        Thread.sleep(500);
        onView(withContentDescription("['写点评']")).perform(click());

        // Step 3: Verify that the user is navigated to the edit review screen.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.edit_review_screen)).check(matches(isDisplayed()));
    }
}