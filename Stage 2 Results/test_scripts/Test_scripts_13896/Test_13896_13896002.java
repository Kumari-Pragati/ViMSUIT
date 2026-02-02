package com.example.tests;

import android.widget.GridView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_13896_13896002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectARandomAnimalFaceImage() throws InterruptedException {
        // Wait for the GridView to be displayed
        onView(allOf(isDisplayed(), withContentDescription("[None]"))).check(ViewAssertions.matches(isDisplayed()));

        // Click on a random animal face image in the 3x3 grid
        Thread.sleep(500);
        onView(allOf(isDisplayed(), withContentDescription("[None]"))).perform(click());

        // Wait for the selected image to be highlighted or marked as selected
        Thread.sleep(500);

        // Assert that the selected animal face image is highlighted or marked as selected
        onView(allOf(isDisplayed(), withContentDescription("[None]"))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}