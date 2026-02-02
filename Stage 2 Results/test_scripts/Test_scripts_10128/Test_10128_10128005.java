package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.widget.ListView;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10128_10128005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyArticleCount() throws InterruptedException {
        // Step 1: Open the Help section.
        onView(ViewMatchers.withId(R.id.menu_help)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Navigate to the 'Knowledge Base' section.
        onView(ViewMatchers.withText("Knowledge Base")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Verify article count under Locations category
        ListView listView = (ListView) Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                .inRoot(ViewMatchers.withClassName(is(ListView.class.getName())))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollTo(), ViewActions.click())
                .onView(ViewMatchers.withId(R.id.list))
                .inRoot(Espresso.getRecyclerViewRoot())
                .check(ViewAssertions.matches(ViewMatchers.hasChildCount(4)));

        // Step 4: Verify article count under Mapping category
        onView(ViewMatchers.withText("Mapping")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        listView = (ListView) Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                .inRoot(ViewMatchers.withClassName(is(ListView.class.getName())))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollTo(), ViewActions.click())
                .onView(ViewMatchers.withId(R.id.list))
                .inRoot(Espresso.getRecyclerViewRoot())
                .check(ViewAssertions.matches(ViewMatchers.hasChildCount(5)));

        // Step 5: Verify article count under Push Alerts category
        onView(ViewMatchers.withText("Push Alerts")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        listView = (ListView) Espresso.onView(ViewMatchers.withContentDescription("[None]"))
                .inRoot(ViewMatchers.withClassName(is(ListView.class.getName())))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollTo(), ViewActions.click())
                .onView(ViewMatchers.withId(R.id.list))
                .inRoot(Espresso.getRecyclerViewRoot())
                .check(ViewAssertions.matches(ViewMatchers.hasChildCount(1)));
    }
}