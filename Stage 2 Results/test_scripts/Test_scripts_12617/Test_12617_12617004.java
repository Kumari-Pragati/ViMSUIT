package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12617_12617004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyClickabilityOfPreseasonGameResults() throws InterruptedException {
        // Open the app and navigate to the profile screen (assuming it's already done in setup)

        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Main Menu Closed']"))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_list))
                .perform(click());
        Thread.sleep(500);
        // Assuming the list item click should navigate to a game details page
        // Add appropriate assertions here based on expected behavior

        // Test withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));

        // Loop through all elements and perform test steps on each
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_drawer_layout))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_list))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withContentDescription("['Main Menu Closed']"))
                            .check(matches(isDisplayed()));
                    break;
                case 3:
                    onView(withContentDescription("[None]"))
                            .check(matches(isDisplayed()));
                    break;
            }
        }

        // Add assertions to verify each element's behavior
        // Example: Verify that clicking on a list item navigates to the correct game details page
    }
}