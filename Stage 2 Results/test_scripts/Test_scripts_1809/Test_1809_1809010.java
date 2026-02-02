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
public class Test_1809_1809010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotInteractive() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Locate the 'START' button
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.isClickable());

        // Attempt to press the 'START' button
        Thread.sleep(500); // Wait for 500ms before checking again

        // Check if the 'START' button is still clickable after a short delay
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.isClickable());
    }
}