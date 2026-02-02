package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_10863_10863008 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheRecentActivitySection() throws InterruptedException {
        // Step 2: Navigate to the home page (Assuming home page is already loaded)
        
        // Step 3: Click on the 'Recent activity' section
        onView(withId(R.id.id_listRecentActivity)).perform(click());
        Thread.sleep(500); // Wait for 500ms
        
        // Expected result: The user should be navigated to the recent activity section
        onView(withId(R.id.id_listRecentActivity)).check(matches(isDisplayed()));
    }
}