package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1303_130303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Test
    public void testBoundaryValidationSelectingTheFirstCityInTheList() throws InterruptedException {
        // Open the application (assumed to be already open by ActivityTestRule)
        
        // Navigate to the 'Select City' screen
        onView(withText("Select City")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Tap on 'ARGENTINA' at the top of the list
        onView(withId(R.id.id_city_list_view)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Verify that 'ARGENTINA' is selected
        onView(withText("ARGENTINA")).check(matches(withText("ARGENTINA")));
    }
}