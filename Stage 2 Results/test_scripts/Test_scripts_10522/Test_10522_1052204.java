package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10522_1052204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheShareIcon() throws InterruptedException {
        // Click on the share icon
        Thread.sleep(500);
        onView(withId(R.id.id_shareBt)).perform(ViewActions.click());

        // Wait for 500ms to ensure the dialog appears
        Thread.sleep(500);

        // Assert that a share dialog should appear
        onView(isAssignableFrom(AppCompatImageButton.class)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}