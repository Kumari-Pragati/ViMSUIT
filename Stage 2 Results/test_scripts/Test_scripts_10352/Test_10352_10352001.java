package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.view.ViewPager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Test_10352_10352001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheInfoTabFromTheEventsTab() throws InterruptedException {
        // Step 1: Click on the 'INFO' tab.
        onView(withId(R.id.id_pager)).perform(click());
        
        // Step 2: Verify that the 'INFO' tab is now active.
        Thread.sleep(500); // Wait for UI to update
        
        // Assuming the ViewPager has a method to check which tab is active
        Espresso.onView(isAssignableFrom(ViewPager.class))
                .check(matches(hasActiveTabWithId(R.id.info_tab_id)));
        
        // Additional assertion to verify that 'INFO' tab is active
        onView(withId(R.id.info_tab_id)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
    
    private Matcher<View> hasActiveTabWithId(int id) {
        return new TypeSafeMatcher<View>() {
            @Override
            protected boolean matchesSafely(View view) {
                if (view instanceof ViewPager) {
                    PagerAdapter adapter = ((ViewPager) view).getAdapter();
                    int activePosition = ((ViewPager) view).getCurrentItem();
                    return adapter != null && id == adapter.getItemId(activePosition);
                }
                return false;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("has active tab with id: " + id);
            }
        };
    }
}
```

Note:
- The `MainActivity` class and the `ViewPager` setup are assumed to be in place.
- The `info_tab_id` is a placeholder for the actual resource ID of the 'INFO' tab.
- The `matches(hasActiveTabWithId(R.id.info_tab_id))` method checks if the active tab has the specified ID. You may need to adjust this based on your actual implementation details.