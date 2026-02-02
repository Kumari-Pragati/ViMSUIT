package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_12804_12804003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestVerifyingTheAppBarTitle() throws InterruptedException {
        // Navigate up to the parent activity (assuming it's the Artists screen)
        onView(withContentDescription("Navigate up")).perform(click());
        
        Thread.sleep(500); // Wait for 500ms to ensure UI updates
        
        // Verify that the app bar title is correctly displayed as 'Artists'
        onView(ViewMatchers.withText("Artists")).check(matches(isDisplayed()));
    }
}