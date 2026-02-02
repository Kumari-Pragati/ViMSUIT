package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.GrantPermissionRule;
import androidx.test.rule.InitializationRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_1281_1281007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule grantPermissionRule = GrantPermissionRule.grant(
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE);

    @Before
    public void setUp() throws InterruptedException {
        Thread.sleep(500); // Wait for the UI to load before proceeding
    }

    @Test
    public void testCheckTheSearchFunctionality() throws InterruptedException {
        // Step 1: Open the product detail page
        // Assuming the product detail page is already open or can be navigated to

        Thread.sleep(500); // Wait for the UI to load before proceeding

        // Step 2: Click on the search icon in the header/App Bar
        onView(withContentDescription("Search")).perform(click());

        Thread.sleep(500); // Wait for the UI to load after clicking the search icon

        // Step 3: Enter a search query and verify that the search results are displayed correctly
        onView(withId(R.id.search_query)).perform(ViewActions.typeText("Harry Potter"), ViewActions.closeSoftKeyboard());
        
        Thread.sleep(500); // Wait for the UI to load after typing the search query

        // Verify that the search results are displayed correctly
        onView(withText("Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals")).check(matches(isDisplayed()));
    }
}