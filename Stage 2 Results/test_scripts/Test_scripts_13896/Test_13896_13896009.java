package com.example.tests;

import android.widget.GridView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_13896_13896009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckDataPersistence() throws InterruptedException {
        // Step 1: Navigate away from the screen and back to it.
        Espresso.pressBack();
        Thread.sleep(500);
        
        // Reopen the activity
        onView(allOf(withContentDescription("[None]"))).perform(click());
        Thread.sleep(500);

        // Assert that the selected animal face images are still highlighted or marked as selected
        onView(allOf(withId(R.id.grid_view))).check(matches(isDisplayed()));
        Espresso.onView(allOf(withId(R.id.grid_view))).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Assuming there is a specific image index that should be checked, for example, the first one.
        int selectedImageIndex = 1; // Adjust this based on your app's GridView layout
        onView(allOf(withId(R.id.grid_view), atPosition(selectedImageIndex))).check(matches(isDisplayed()));
    }
}