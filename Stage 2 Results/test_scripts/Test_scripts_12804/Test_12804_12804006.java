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
public class Test_12804_12804006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestTappingOnTheListRow() throws InterruptedException {
        // Wait for the RecyclerView to be ready
        Thread.sleep(500);

        // Tap on the list row containing the text '<unknown>'
        onView(withId(R.id.id_recyclerview)).perform(click());

        // Wait for the next screen to load
        Thread.sleep(500);

        // Check if the new screen displays more details about the artist
        onView(withText("<unknown> Details")).check(matches(isDisplayed()));
    }
}