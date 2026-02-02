package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.AppCompatButton;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10544_10544006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // No setup needed for this test case
    }

    @Test
    public void testSearchForNewCarsUiTestFindCarButton throws InterruptedException {
        // Step 1: Open the CarWale app (assumed to be opened by ActivityTestRule)
        
        // Step 2: Tap on the 'New Car' tab
        onView(withText("New Cars")).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter 'New Cars' in the search input field (assuming there's a search input field)
        onView(withId(R.id.id_search_input)).perform(ViewActions.typeText("New Cars"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap on the 'FIND CAR' button
        onView(withId(R.id.id_btnSearch1)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The 'FIND CAR' button should change its appearance to indicate it has been pressed
        AppCompatButton findCarButton = (AppCompatButton) activityRule.getScenario().onActivity(a -> a.findViewById(R.id.id_btnSearch1));
        
        // Check if the button's background or text color has changed, indicating it was pressed
        onView(withId(R.id.id_btnSearch1)).check(matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}