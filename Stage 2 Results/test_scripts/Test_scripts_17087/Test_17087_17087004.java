package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_17087_17087004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTogglesStateSelectingAPlaceType() throws InterruptedException {
        // Step 1: Tap on the 'Restaurant' icon in the place type selection grid
        Espresso.onView(ViewMatchers.withId(R.id.id_imgBtnSearch)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Enter '94010' in the input field
        EditText searchField = activityRule.getActivity().findViewById(R.id.id_searchInput);
        searchField.perform(ViewActions.typeText("94010"));
        Thread.sleep(500);

        // Step 3: Tap the search icon in the header/app bar
        Espresso.onView(ViewMatchers.withId(R.id.id_imgBtnSearch)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The app should display a list of restaurants in the 94010 area
        Espresso.onView(ViewMatchers.withText("Restaurants")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}