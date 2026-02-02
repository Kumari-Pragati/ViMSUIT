package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_10544_10544002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForNewCarsNegativeFlowEmptySearch() throws InterruptedException {
        // Open the CarWale app (Assuming MainActivity is launched by default)
        
        // Tap on the 'New Car' tab
        Espresso.onView(withId(R.id.new_car_tab)).perform(ViewActions.click());
        Thread.sleep(500);

        // Enter an empty string in the search input field
        Espresso.onView(withId(R.id.id_autoCompleteTextView1)).perform(ViewActions.typeText("")).perform(ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Tap on the 'FIND CAR' button
        Espresso.onView(withId(R.id.find_car_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Assert that an error message is displayed indicating that a search term is required
        Espresso.onView(withText("Please enter a valid search term")).check(ViewAssertions.matches(isDisplayed()));
    }
}