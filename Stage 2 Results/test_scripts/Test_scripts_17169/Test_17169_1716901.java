package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17169_1716901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationDrawerOpensAndCloses() throws InterruptedException {
        // Step 1: Tap on the circular profile icon to open the navigation drawer.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for the drawer to open

        // Step 2: Verify the navigation drawer list is displayed.
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));

        // Step 3: Tap on the circular profile icon again to close the navigation drawer.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for the drawer to close

        // Step 4: Verify the navigation drawer is closed.
        onView(withId(R.id.id_drawer_layout)).check(matches(!isDisplayed()));
    }
}