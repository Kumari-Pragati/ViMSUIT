package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15674_15674003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectAProductCategory() throws InterruptedException {
        // Step 1: Open the shopping app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the navigation menu icon in the header
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for the drawer to open

        // Step 3: Tap on the 'Brilliant Lighting' category in the grid
        onView(withText("Brilliant Lighting")).inRoot(isDialog()).perform(ViewActions.click());
        Thread.sleep(500); // Wait for navigation to complete
        
        // Expected Result: The app navigates to the 'Brilliant Lighting' category page
        onView(withId(R.id.category_page)).check(matches(isDisplayed()));
    }
}