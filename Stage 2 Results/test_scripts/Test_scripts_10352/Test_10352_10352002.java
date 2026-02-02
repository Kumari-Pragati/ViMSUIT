package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10352_10352002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheCommentsTabFromTheEventsTab throws InterruptedException {
        // Step 1: Click on the 'COMMENTS' tab.
        Espresso.onView(withId(R.id.id_pager)).perform(ViewActions.click());
        
        // Step 2: Verify that the 'COMMENTS' tab is now active.
        Thread.sleep(500); // Wait for UI to update
        
        // Assuming the ViewPager has a way to check which tab is active, e.g., by checking the current item
        Espresso.onView(withId(R.id.id_pager)).check(ViewAssertions.matches(ViewPagerMatchers.withSelectedPosition(1)));
    }
}
```

Note: The `ViewPagerMatchers` class is part of the Espresso-contrib library. If you are not using it, you can implement a custom matcher or use another approach to verify which tab is active.