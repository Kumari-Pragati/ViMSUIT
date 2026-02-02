package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_15109_1510906 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheTimeAndLocationAreDisplayedCorrectly() throws InterruptedException {
        // Wait for the view to be displayed
        Thread.sleep(500);
        
        // Find the root view content without bars
        onView(allOf(withId(R.id.id_application_root_view_content_without_bars), isDisplayed()))
                .check(matches(isDisplayed()));

        // Verify the time and location are displayed correctly
        Espresso.onView(ViewMatchers.withText("10:35 AM PDT"))
                .inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));

        Espresso.onView(ViewMatchers.withText("San Francisco, CA"))
                .inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView())))
                .check(matches(isDisplayed()));
    }
}