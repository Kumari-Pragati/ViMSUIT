package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_18262_18262009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToAboutScreenFromDeviceScreen() throws InterruptedException {
        // Step 1: Click on the 'About' option in the vertical menu to navigate to the About screen.
        Thread.sleep(500);
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());
        
        // Wait for a moment before checking if the About screen is displayed
        Thread.sleep(500);

        // Expected result: The About screen should be displayed.
        Espresso.onView(withId(R.id.about_screen_container)).check(matches(isDisplayed()));
    }
}