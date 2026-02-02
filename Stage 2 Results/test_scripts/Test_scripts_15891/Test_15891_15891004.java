package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_15891_15891004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateHamburgerMenu() throws InterruptedException {
        // Step 1: Click on the hamburger menu icon on the top left.
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Click on the hamburger menu icon again to close it.
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The hamburger menu should toggle between open and closed states.
        // Check if drawer layout is visible (open) or not (closed)
        DrawerLayout drawerLayout = activityRule.getActivity().findViewById(R.id.drawer_layout);
        boolean isOpen = drawerLayout.isDrawerOpen(DrawerLayoutCompat.START);

        // Assert the state of the drawer
        if (isOpen) {
            onView(withContentDescription("[None]")).check(matches(not(isDisplayed()))); // Menu should be closed
        } else {
            onView(withContentDescription("[None]")).check(matches(isDisplayed())); // Menu should be open
        }
    }
}
```

Note: Ensure that `MainActivity` and the `DrawerLayout` with id `R.id.drawer_layout` are correctly implemented in your application. Also, make sure to import necessary classes like `DrawerLayoutCompat`.