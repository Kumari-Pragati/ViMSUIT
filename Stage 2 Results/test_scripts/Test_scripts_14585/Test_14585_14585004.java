package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14585_14585004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheTetheringSettingsOption() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, or this step is handled by the rule)

        // Step 2: Navigate to the 'Data Sharing' menu
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Select the 'Tethering settings' option
        onView(ViewMatchers.withText("Data Sharing")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The application should navigate to the 'Tethering settings' screen
        onView(withId(R.id.tethering_settings_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}