package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_15979_1597901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToModsSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu section.
        Thread.sleep(500); // Wait for the app to initialize

        // Step 2: Click on the 'Mods' section.
        onView(withId(R.id.id_drawer)).perform(click());
        Thread.sleep(500); // Wait for the drawer to open

        // Expected Result: The screen should display the 'Mods' section with the subtitle
        // 'All the most interesting modification.'
        onView(ViewMatchers.withText("Mods")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("All the most interesting modifications."))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}