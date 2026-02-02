package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15393_1539302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserReadsTheBodyTextExplainingTheConceptOfSpiritualAdoption() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Your good deed for today' screen.
        Espresso.onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Read the body text explaining the concept of spiritual adoption, voluntary sacrifices, and supporting women who have withdrawn from abortion.
        Espresso.onView(withId(R.id.id_drawer_layout))
                .check(matches(isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to stabilize

        // Assuming there is a RecyclerView or similar view that contains the body text
        Espresso.onView(withId(R.id.your_good_deed_recycler_view)) // Replace with actual ID if different
                .perform(ViewActions.scrollToPosition(1)); // Scroll to the position containing the body text
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Assert that the body text is clearly visible and legible.
        Espresso.onView(withId(R.id.your_good_deed_text_view)) // Replace with actual ID if different
                .check(matches(ViewMatchers.withText("N/A"))); // Replace "N/A" with expected text

        Thread.sleep(500); // Wait for UI to stabilize
    }
}