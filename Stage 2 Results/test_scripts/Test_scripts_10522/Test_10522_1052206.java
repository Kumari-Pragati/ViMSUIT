package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test_10522_1052206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnThePaintTool throws InterruptedException {
        // Click on the paint tool
        onView(withId(R.id.id_colorBt)).perform(click());
        
        // Wait for 500ms to ensure the action is processed
        Thread.sleep(500);
        
        // Assert that the paint tool is active
        onView(withId(R.id.id_colorBt)).check(ViewAssertions.matches(isChecked()));
    }
}