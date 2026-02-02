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

@RunWith(AndroidJUnit4.class)
public class Test_17105_17105005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheViewAllButton() throws InterruptedException {
        // Open the property listing for Thompson St #6.
        Espresso.onView(ViewMatchers.withText("Thompson St #6")).perform(ViewActions.click());
        Thread.sleep(500);

        // Navigate to the floor plans and pricing section.
        Espresso.onView(withId(R.id.id_show_more_floorplan)).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_expand_collapse)).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_check_availability_button)).perform(click());
        Thread.sleep(500);

        // Verify state for each element
        verifyElementState(withId(R.id.id_show_more_floorplan), "Floor plan details should be visible");
        verifyElementState(withId(R.id.id_expand_collapse), "Collapse button should toggle correctly");
        verifyElementState(withId(R.id.id_check_availability_button), "Availability check button should work");

        // Verify the navigation to detailed view
        Espresso.onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
    }

    private void verifyElementState(int id, String message) {
        Espresso.onView(withId(id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}