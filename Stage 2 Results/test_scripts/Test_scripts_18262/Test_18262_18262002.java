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
public class Test_18262_18262002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToGarageScreenFromDeviceScreen() throws InterruptedException {
        // Step 1: Click on the 'Garage' option in the vertical menu to navigate to the Garage screen.
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms to ensure navigation is complete

        // Step 2: Verify that the Garage screen is displayed
        onView(withId(R.id.garage_screen_container)).check(matches(isDisplayed()));
    }
}