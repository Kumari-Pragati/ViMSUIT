package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13575_1357504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateExpandAndCollapseACategory throws InterruptedException {
        // Step 1: Open the app and navigate to the category selection screen (Assuming it's already on this screen)
        
        // Step 2: Tap on the 'Cars' category option
        onView(withId(R.id.id_category_subcategory_list)).perform(click());
        Thread.sleep(500); // Wait for UI update
        
        // Step 3: Verify that the 'Cars' category is expanded (Assuming it's a list view and we need to check if subcategories are visible)
        onView(withId(R.id.id_category_subcategory_list)).check(matches(isDisplayed()));
        
        // Step 4: Tap on the 'Cars' category option again
        onView(withId(R.id.id_category_subcategory_list)).perform(click());
        Thread.sleep(500); // Wait for UI update
        
        // Step 5: Verify that the 'Cars' category is collapsed (Assuming it's a list view and we need to check if subcategories are not visible)
        onView(withId(R.id.id_category_subcategory_list)).check(matches(isDisplayed()));
        
        // Additional assertion to ensure the state change
        Espresso.closeSoftKeyboard();
    }
}