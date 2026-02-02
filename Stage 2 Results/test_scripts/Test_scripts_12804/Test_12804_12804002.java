package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_12804_12804002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickingOnTheThreedotMenuIcon() throws InterruptedException {
        // Step 1: Click on the three-dot menu icon on the right side of the list row.
        Thread.sleep(500);
        onView(allOf(withId(R.id.id_popup_menu), isAssignableFrom(AppCompatImageView.class)))
                .perform(ViewActions.click());

        // Expected Result: The app should display a context menu with options related to the artist.
        Thread.sleep(500);
        Espresso.onView(withId(android.R.id.list)).check(matches(hasDescendant(withText("Artist Options"))));
    }
}