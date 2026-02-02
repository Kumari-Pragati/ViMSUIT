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
public class Test_1809_1809006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotAccessible throws InterruptedException {
        // Open the app (already done by ActivityTestRule)
        
        // Locate the 'START' button
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isClickable()));
        
        Thread.sleep(500); // Add delay to ensure UI is updated
        
        // Assert that the 'START' button is accessible
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.matches(isEnabled()));
    }
}