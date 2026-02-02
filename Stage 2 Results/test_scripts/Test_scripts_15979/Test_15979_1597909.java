package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15979_1597909 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheModsSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu section.
        Thread.sleep(500); // Wait for the app to initialize

        // Step 2: Click on the 'Mods' section.
        onView(withId(R.id.id_drawer)).perform(click());
        Thread.sleep(500); // Wait for the drawer to open

        // Expected Result: The screen should display the 'Mods' section with the subtitle
        // 'All the most interesting modification.'
        onView(withText("Mods")).inRoot(isAssignableFrom(DrawerLayout.class)).check(matches(isDisplayed()));
    }
}