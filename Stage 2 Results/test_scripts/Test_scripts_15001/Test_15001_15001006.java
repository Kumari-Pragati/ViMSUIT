package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15001_15001006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheMenuIconFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: Ligue 1' section.
        // Assuming there is a way to navigate to this section, for example, by clicking on a button with id R.id.nav_france_ligue_1
        onView(withId(R.id.nav_france_ligue_1)).performClick();
        
        Thread.sleep(500); // Wait for the navigation to complete

        // Step 2: Click on the menu icon.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        
        Thread.sleep(500); // Wait for the drawer to open

        // Step 3: Verify that the menu options are displayed.
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));
    }
}