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
public class Test_1809_1809004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowStartButtonIsNotVisible() throws InterruptedException {
        // Open the app (already handled by ActivityTestRule)
        
        // Locate the 'START' button
        Thread.sleep(500);
        onView(withId(R.id.id_startbtn)).check(ViewAssertions.doesNotExist());

        // Expected result: The 'START' button should be visible on the screen.
        // Since it is a negative test case, we expect the button to not be present.
    }
}