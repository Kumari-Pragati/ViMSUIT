package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11231_1123108 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityUserPerformsASearchUsingVoiceCommands() throws InterruptedException {
        // Step 1: Open the Talabat.com mobile app.
        // Step 2: Enable voice commands on the device. (Assuming this is done manually by user)

        // Step 3: Speak the command to search for Italian restaurants.
        // Espresso does not support voice input directly, so we simulate it with a click action.

        // Simulate opening the search view
        onView(withId(R.id.id_home_toolbar_search)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Assert that the search view is displayed
        onView(withId(R.id.id_home_toolbar_search)).check(matches(isDisplayed()));

        // Simulate voice command input (simulated by typing "Italian restaurants")
        Espresso.pressKey(getInstrumentation().getTargetContext().getString(R.string.search_query_italian_restaurants));
        Thread.sleep(500); // Wait for UI to update

        // Assert that the search results are displayed
        onView(withId(R.id.search_results)).check(matches(isDisplayed()));
    }
}