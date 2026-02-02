package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.CardView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15950_1595003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSegmentedControlPositiveFlow() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Teams' screen.
        // Assuming Teams screen is already open or can be navigated directly

        // Step 2: Click on the segmented control
        Thread.sleep(500);
        onView(withId(R.id.id_search_query_section)).perform(click());

        // Step 3: Select the 'United' option
        Thread.sleep(500);
        onView(withText("United")).perform(click());

        // Expected Result: The screen should display a list of popular sports teams from the United region.
        Thread.sleep(500);
        onView(withId(R.id.id_search_query_section)).check(matches(isDisplayed()));

        // Additional assertion to check if the correct content is displayed
        Espresso.onView(CardView.class).inRoot(hasDescendant(withText("United")))
                .check(matches(isDisplayed()));
    }
}