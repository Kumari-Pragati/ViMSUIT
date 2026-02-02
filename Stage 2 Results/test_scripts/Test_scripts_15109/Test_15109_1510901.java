package com.example.tests;

import android.widget.ToggleButton;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15109_1510901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndVerifyTheLocationIsSetToSanFranciscoCa() throws InterruptedException {
        // Step 1: Open the app (already handled by ActivityTestRule)

        // Step 2: Verify the location is set to San Francisco, CA
        onView(ViewMatchers.withText("San Francisco, CA")).check(matches(isDisplayed()));

        // Additional step for UI element interaction if needed
        Thread.sleep(500); // Wait for 500ms

        // Optional: Interact with the toggle button (if necessary)
        onView(withId(R.id.id_layer_display_mode_past)).perform(click());
        Thread.sleep(500); // Wait for 500ms after interaction
    }
}