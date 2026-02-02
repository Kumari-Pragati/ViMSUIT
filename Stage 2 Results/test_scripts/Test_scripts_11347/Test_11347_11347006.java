package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11347_11347006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationReturnToPreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'TEAMDEX' section.
        // Assuming TEAMDEX is already open or can be navigated directly

        // Step 2: Click on the 'Create a Team' option in the main content area
        onView(withId(R.id.create_team_button)).perform(click());
        Thread.sleep(500);

        // Step 3: Navigate back to the previous screen
        onView(withId(R.id.id_options)).perform(click());
        Thread.sleep(500);

        // Expected Result: The user should be returned to the 'TEAMDEX' screen.
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withId(R.id.teamdex_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}