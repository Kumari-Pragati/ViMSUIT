package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14585_14585001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheActivityLogOptionIsCorrectlySelected() throws InterruptedException {
        // Step 1: Open the application (Assumed to be done by ActivityTestRule)
        
        // Step 2: Navigate to the 'Data Sharing' menu
        onView(withId(R.id.id_design_navigation_view)).performScrollTo();
        Thread.sleep(500); // Wait for UI to settle
        
        // Step 3: Verify that the 'Activity log' option is highlighted
        onView(withId(R.id.id_design_navigation_view)).check(matches(isDisplayed()));
        
        // Assuming the activity log item has a specific id or can be matched by content description
        // For example, if it's the first item in the navigation view:
        onView(withId(R.id.id_design_navigation_view)).perform(DrawerLayoutActions.clickFirstItem());
        Thread.sleep(500); // Wait for UI to settle
        
        // Verify that the 'Activity log' option is highlighted (assuming it has a specific id)
        onView(withId(R.id.activity_log_item_id)).check(matches(isDisplayed()));
        
        // Additional assertion to check if the item is selected/highlighted
        onView(withId(R.id.activity_log_item_id)).check(matches(hasSelectedBackground()));
    }
    
    private android.support.test.espresso.matcher.ViewMatchers.HasSelector hasSelectedBackground() {
        return new android.support.test.espresso.matcher.ViewMatchers.HasSelector(
                R.drawable.selected_background_selector);
    }
}
```

Note: The `DrawerLayoutActions.clickFirstItem()` is a hypothetical method. In actual Espresso, you would need to use the appropriate actions or matchers to interact with the navigation view. Also, ensure that the resource IDs and selectors are correctly defined in your application's resources.