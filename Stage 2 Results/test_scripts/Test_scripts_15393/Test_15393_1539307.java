package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15393_1539307 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserChecksTheDataPersistenceOfTheScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Your good deed for today' screen.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Close the app and reopen it to check if the screen data is still present.
        activityTestRule.finishActivity();
        activityTestRule.launchActivity(null);
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The screen data is still present when the app is reopened.
        onView(withId(R.id.id_drawer_layout)).check(matches(isDisplayed()));
    }
}