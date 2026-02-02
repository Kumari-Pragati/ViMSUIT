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
public class Test_12393_1239302 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoTasksInCompletedTasksTab() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, so this step is skipped)

        // Step 2: Tap on the 'MY TASK LIST' tab
        onView(withId(R.id.id_viewpager)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Tap on the 'COMPLETED TASKS' tab
        Espresso.onView(ViewPager.class).inRoot(isDialog()).perform(swipeLeft());
        Thread.sleep(500);

        // Step 4: Verify that the 'COMPLETED TASKS' tab is empty
        onView(withId(R.id.id_viewpager)).check(matches(hasNoChildren()));
    }
}
```

Note:
- The `isDialog()` method is used to handle the dialog-like behavior of the ViewPager when switching tabs.
- The `swipeLeft()` action simulates a swipe gesture to navigate between tabs in the ViewPager.
- The `matches(hasNoChildren())` assertion checks if there are no child views, indicating that the 'COMPLETED TASKS' tab is empty.