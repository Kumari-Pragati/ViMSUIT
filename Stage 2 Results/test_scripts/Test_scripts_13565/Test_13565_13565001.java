package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_13565_13565001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingThroughPropertyListings() throws InterruptedException {
        // Open the app and navigate to the screen displaying rental properties in Koramangala.
        
        // Element 1: withId(R.id.id_drawer_layout) - com.quikr:id/drawer_layout
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withContentDescription("Open Drawer"))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(R.id.id_mcr_button) - com.quikr:id/mcr_button
        onView(withId(R.id.id_mcr_button))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 3: withContentDescription("['Open Drawer']")
        onView(withContentDescription("Open Drawer"))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 4: withId(R.id.id_menu_ad_list_search) - com.quikr:id/menu_ad_list_search
        onView(withId(R.id.id_menu_ad_list_search))
                .perform(click());
        Thread.sleep(500);
        // Verify state

        // Element 5: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 6: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .check(matches(ViewMatchers.isDisplayed()));

        // Scroll through the property listings to view all 1119 results.
        RecyclerView recyclerView = activityRule.getActivity().findViewById(R.id.recycler_view);
        for (int i = 0; i < 1119; i++) {
            recyclerView.smoothScrollBy(0, 50); // Adjust scroll distance as needed
            Thread.sleep(500);
        }

        // Click on one of the property listings to view more details.
        onView(withId(R.id.item_property))
                .perform(click());

        // Verify state after clicking on a property listing
        Espresso.onView(ViewMatchers.withText("Property Details"))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}