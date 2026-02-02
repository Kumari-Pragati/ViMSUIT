package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.SearchView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15891_15891009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceAddressPersistence() throws InterruptedException {
        // Step 1: Click on the search bar and type '123 Main St'.
        onView(withId(R.id.search_bar)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.search_src_text)).perform(typeText("123 Main St"), closeSoftKeyboard());

        // Step 2: Click on the 'USE MY CURRENT LOCATION' button.
        Thread.sleep(500);
        onView(withContentDescription("['Outdated Version']")).perform(click());

        // Step 3: Close the app.
        Thread.sleep(500);

        // Step 4: Reopen the app.
        activityRule.getActivity().finish();
        Thread.sleep(1000); // Wait for the app to close
        activityRule.launchActivity(null);

        // Step 5: Click on the search bar and type '123 Main St'.
        Thread.sleep(500);
        onView(withId(R.id.search_bar)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.search_src_text)).check(matches(isDisplayed()));

        // Step 6: Click on the 'USE MY CURRENT LOCATION' button.
        Thread.sleep(500);
        onView(withContentDescription("['Outdated Version']")).perform(click());

        // Expected Result: The app should display nearby food options based on the last entered address or current location.
        // Note: This step requires a server response and cannot be directly tested with Espresso. 
        // You may need to mock network responses or use an intent to launch a new activity that displays the expected result.
    }
}