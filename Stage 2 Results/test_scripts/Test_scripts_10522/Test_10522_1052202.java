package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10522_1052202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheDownloadIcon() throws InterruptedException {
        // Click on the download icon
        onView(withId(R.id.id_downloadBt)).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the dialog appears
        Thread.sleep(500);
        
        // Assert that a download dialog should appear
        onView(withText("Download")).check(ViewAssertions.matches(isDisplayed()));
    }
}