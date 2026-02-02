package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_1303_130308 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceSelectingACityAndVerifyingPersistence() throws InterruptedException {
        // Element 1: withId(R.id.id_city_list_view)
        onView(withId(R.id.id_city_list_view)).perform(click());
        Thread.sleep(500);
        
        // Select 'BUENOS AIRES'
        ListView cityListView = (ListView) activityRule.getActivity().findViewById(R.id.id_city_list_view);
        cityListView.performItemClick(cityListView.getAdapter().getView(0, null, cityListView), 0, 1);

        Thread.sleep(500);
        
        // Verify that 'BUENOS AIRES' is still selected
        onView(allOf(withId(R.id.id_city_list_view), withContentDescription("BUENOS AIRES"))).check(matches(withContentDescription("['BUENOS AIRES']")));

        // Element 2: withContentDescription("['Navigate up']")
        Thread.sleep(500);
        
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Navigate back to the 'Select City' screen
        Thread.sleep(500);
        
        // Verify that 'BUENOS AIRES' is still selected after navigating back
        onView(allOf(withId(R.id.id_city_list_view), withContentDescription("['BUENOS AIRES']"))).check(matches(withContentDescription("['BUENOS AIRES']")));
    }
}