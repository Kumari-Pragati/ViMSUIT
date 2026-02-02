package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_17087_17087005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationNavigatingToARecentlyViewedPlace() throws InterruptedException {
        // Step 1: Tap on the 'Cafe Express' thumbnail in the Recently Viewed Places section
        Thread.sleep(500);
        onView(withId(R.id.recently_viewed_places_list)).perform(click());

        // Step 2: Enter '94010' in the input field
        Thread.sleep(500);
        onView(withId(R.id.search_input_field)).perform(ViewActions.typeText("94010"));

        // Step 3: Tap the search icon in the header/app bar
        Thread.sleep(500);
        onView(withId(R.id.id_imgBtnSearch)).perform(click());

        // Expected Result: The app should display a list of restaurants in the 94010 area
        Thread.sleep(500);
        onView(withText("Restaurants in 94010")).check(matches(ViewMatchers.isDisplayed()));
    }
}