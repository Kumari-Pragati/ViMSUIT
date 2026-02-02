package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11475_1147502 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheFavoritesTab() throws InterruptedException {
        // Open the Nail Art App (Assuming it's already open, or this step is handled by setup)

        // Tap on the 'ИЗБРАННОЕ' (Favorites) tab at the bottom of the screen
        Thread.sleep(500); // Wait for 500ms to ensure the UI is ready

        onView(withId(R.id.id_tabs)).perform(ViewActions.click());

        // Wait for 500ms to ensure the navigation is complete
        Thread.sleep(500);

        // Assert that the screen displays the user's favorite nail design ideas
        onView(withId(R.id.id_favorites_screen_container)).check(matches(isDisplayed()));
    }
}