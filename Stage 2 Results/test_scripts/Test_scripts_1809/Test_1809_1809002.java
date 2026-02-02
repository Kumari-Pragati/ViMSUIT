package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1809_1809002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoStartButtonPresent() throws InterruptedException {
        // Open the app (already handled by ActivityTestRule)
        
        // Locate the 'START' button and assert it is not present
        try {
            Espresso.onView(withId(R.id.id_startbtn)).check(matches(isDisplayed()));
            fail("Expected NoMatchingViewException because the START button should not be present");
        } catch (NoMatchingViewException e) {
            // Expected exception, as the button is not supposed to be there
            Thread.sleep(500);
        }
    }
}