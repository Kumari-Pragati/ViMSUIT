package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11039_11039002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForASpecificCharacter() throws InterruptedException {
        // Step 1: Click on the magnifying glass icon in the Header/App Bar.
        onView(withId(R.id.id_action_search)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Enter the search term 'Michael' in the search input field.
        onView(withText("Search")).inRoot(isDialog()).perform(ViewActions.typeText("Michael"));
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Press the Enter key to perform the search.
        Espresso.pressBack(); // Simulate pressing enter
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The search results for 'Michael' should be displayed.
        onView(withId(R.id.search_results)).check(matches(isDisplayed()));
    }
}