package com.example.tests;

import android.widget.ListView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15001_15001003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfNationalMatches() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'France: National' section.
        onView(allOf(withId(R.id.nav_france_national), withText("France: National"))).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Verify that the section displays the correct matches with their times and teams.
        // Assuming the list view is populated with match details
        onView(withId(R.id.id_liste)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Example assertion: Verify a specific match (adjust as per actual data)
        String expectedMatch = "Match 1 - Team A vs Team B";
        onView(allOf(withId(R.id.id_liste), withText(expectedMatch))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Example assertion: Verify a specific time (adjust as per actual data)
        String expectedTime = "14:30";
        onView(allOf(withId(R.id.id_liste), withText(expectedTime))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note:
- The `nav_france_national` resource ID is assumed to be the ID of a navigation item or button that leads to the 'France: National' section.
- The match details and times are placeholders. You should replace them with actual data from your app's UI.
- Adjust the sleep intervals as necessary based on your application's performance.