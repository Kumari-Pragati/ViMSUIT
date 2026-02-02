package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10522_1052203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheUploadIcon() throws InterruptedException {
        // Step 1: Click on the upload icon
        onView(withId(R.id.id_downloadBt)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: An upload dialog should appear
        onView(withId(R.id.id_upload_dialog_container)).check(matches(isDisplayed()));
    }
}