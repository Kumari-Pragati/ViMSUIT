package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13410_1341001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws InterruptedException {
        // Wait for the app to initialize and load the main screen
        Thread.sleep(500);
    }

    @Test
    public void testVerifyTheDisplayOfWorkoutPlansByDifficultyLevel() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Full Body Workout' screen.
        onView(withText("Full Body Workout")).perform(click());
        
        // Wait for the listview to be clickable and focusable
        Thread.sleep(500);

        // Step 2: Verify that the screen displays workout plans categorized by difficulty levels: Easy, Medium, and Hard.
        // Select the ListView element
        onView(withId(R.id.id_listview)).check(matches(ViewMatchers.isDisplayed()));

        // Wait for the list to be populated with items
        Thread.sleep(500);

        // Check if the list contains items corresponding to different difficulty levels
        onView(withText("Easy")).inRoot(isPlatformPopup()).check(matches(isDisplayed()));
        onView(withText("Medium")).inRoot(isPlatformPopup()).check(matches(isDisplayed()));
        onView(withText("Hard")).inRoot(isPlatformPopup()).check(matches(isDisplayed()));

        // Wait for the next interaction
        Thread.sleep(500);
    }
}