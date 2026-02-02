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

@RunWith(AndroidJUnit4.class)
public class Test_18262_18262003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToLookupScreenFromDeviceScreen() throws InterruptedException {
        // Step 1: Click on the 'Lookup' option in the vertical menu to navigate to the Lookup screen.
        Thread.sleep(500);
        onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());

        // Expected Result: The Lookup screen should be displayed.
        Thread.sleep(500);
        Espresso.onView(isRoot()).check(ViewAssertions.matches(hasDescendant(withText("Lookup"))));
    }
}