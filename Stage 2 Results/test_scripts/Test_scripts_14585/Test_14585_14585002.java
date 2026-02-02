package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_14585_14585002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheDashboardOption() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, so this step is skipped)

        // Step 2: Navigate to the 'Data Sharing' menu
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for drawer to open

        // Step 3: Select the 'Dashboard' option
        onView(withText("Data Sharing")).perform(click()); // Assuming "Data Sharing" is a text in the drawer menu
        Thread.sleep(500); // Wait for navigation

        // Expected Result: The application should navigate to the 'Dashboard' screen
        onView(withId(R.id.dashboard_screen)).check(matches(withText("Dashboard")));
    }
}