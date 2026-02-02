package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16342_16342001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateToTheProfileSectionFromTheNavigationBar() throws InterruptedException {
        // Step 1: Click on the 'people' icon in the navigation bar.
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user should be navigated to the profile section.

        // Check if the profile section is displayed
        onView(withId(R.id.profile_fragment_container)).check(matches(isDisplayed()));
    }
}