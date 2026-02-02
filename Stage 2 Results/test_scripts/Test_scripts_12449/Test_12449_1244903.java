package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12449_1244903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationSelectingTheFirstAndLastCountryInTheList() throws InterruptedException {
        // Step 1: Open the app and navigate to the search functionality
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Step 2: Tap on the 'Choose country to search in' header
        Espresso.onView(ViewMatchers.withText("Choose country to search in")).perform(ViewActions.click());

        // Step 3: Select the first country in the list
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).perform(ViewActions.scrollToPosition(0));
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).perform(ViewActions.click());

        // Step 4: Tap the 'OK' button to confirm the selection
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("OK")).perform(ViewActions.click());

        // Step 5: Select the last country in the list
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).perform(ViewActions.scrollToPosition(-1));
        Espresso.onView(ViewMatchers.withId(R.id.id_countries_list)).perform(ViewActions.click());

        // Step 6: Tap the 'OK' button to confirm the selection
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("OK")).perform(ViewActions.click());
    }
}