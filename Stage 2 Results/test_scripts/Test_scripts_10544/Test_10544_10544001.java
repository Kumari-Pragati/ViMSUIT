package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.SearchView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10544_10544001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Ensure the app is launched before each test
        activityRule.getScenario().onActivity(activity -> {
            InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        });
    }

    @Test
    public void testSearchForNewCarsPositiveFlow throws InterruptedException {
        // Step 1: Open the CarWale app (already covered by ActivityTestRule)
        
        // Step 2: Tap on the 'New Car' tab
        onView(withId(R.id.tab_new_cars)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter 'New Cars' in the search input field
        onView(ViewMatchers.isAssignableFrom(SearchView.class)).perform(ViewActions.typeText("New Cars"));
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap on the 'FIND CAR' button
        onView(withId(R.id.id_btnSearch1)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The search results for 'New Cars' should be displayed
        onView(withText("New Cars")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
    }
}