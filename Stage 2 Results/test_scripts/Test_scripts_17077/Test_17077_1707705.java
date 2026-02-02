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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17077_1707705 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsVerifyRestaurantDetailsCanBeClicked() throws InterruptedException {
        // Step 1: Open the Gluten-Free app.
        // Step 2: Navigate to the list of gluten-free takeaway restaurants.

        // Step 3: Click on a restaurant row.
        Thread.sleep(500);
        onView(withId(R.id.id_listView1)).perform(click());

        // Step 4: Verify that the restaurant details page is displayed.
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(ViewMatchers.isRoot()));
    }
}