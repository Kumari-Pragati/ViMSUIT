package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10544_10544005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForNewCarsUiTestSearchInputField() throws InterruptedException {
        // Open the CarWale app (assumed to be done by the rule)
        
        // Tap on the 'New Car' tab
        Espresso.onView(withId(R.id.newCarTab)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Enter 'New Cars' in the search input field
        Espresso.onView(withId(R.id.id_autoCompleteTextView1))
                .perform(ViewActions.typeText("New Cars"));
        Thread.sleep(500); // Wait for UI to update and text to be highlighted

        // Assert that the search input field highlights the entered text
        Espresso.onView(withId(R.id.id_autoCompleteTextView1))
                .check(ViewAssertions.matches(hasFocus()));
    }
}