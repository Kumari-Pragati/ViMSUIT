package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17135_17135001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheScreenDisplaysYouHaveNoMessagesWhenNoMessagesArePresent throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Messages' section.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Verify the screen displays 'You have no messages.'
        onView(withText("You have no messages.")).check(matches(isDisplayed()));
    }
}