package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18512_1851202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnACategoryToNavigateToItsDetails() throws InterruptedException {
        // Step 1: Open the 'Photo Notes Maker' app (already covered by ActivityTestRule)
        
        // Step 2: Click on a category from the list, e.g., 'Anniversary'
        onView(withId(R.id.id_list_mes)).perform(click());
        Thread.sleep(500); // Wait for the navigation to complete

        // Step 3: Verify that the app navigates to the details page for the selected category
        onView(withText("Anniversary Details")).check(matches(isDisplayed()));
    }
}