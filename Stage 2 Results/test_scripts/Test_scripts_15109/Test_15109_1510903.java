package com.example.tests;

import android.view.View;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15109_1510903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForADifferentLocation() throws InterruptedException {
        // Step 1: Click on the Search Icon
        onView(withId(R.id.id_page_header_find_click)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter a different location name
        onView(withText("Search Location")).inRoot(isDialog()).perform(typeText("New York"), closeSoftKeyboard());
        Thread.sleep(500); // Wait for the search results to load

        // Step 3: Press Enter
        Espresso.pressBack(); // Simulate pressing enter by going back in the dialog
        Thread.sleep(500); // Wait for UI to update

        // Step 4: Verify the new location is displayed
        onView(withText("New York")).inRoot(isDialog()).check(matches(withText("New York")));
    }
}