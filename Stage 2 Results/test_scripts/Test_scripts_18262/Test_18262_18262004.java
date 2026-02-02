package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_18262_18262004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToTroubleCodesScreenFromDeviceScreen() throws InterruptedException {
        // Step 1: Click on the 'Trouble Codes' option in the vertical menu to navigate to the Trouble Codes screen.
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms to ensure navigation is complete

        // Step 2: Verify that the Trouble Codes screen is displayed
        onView(withId(R.id.trouble_codes_screen_container)).check(matches(isDisplayed()));
    }
}