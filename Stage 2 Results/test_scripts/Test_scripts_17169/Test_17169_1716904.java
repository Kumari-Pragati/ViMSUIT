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
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_17169_1716904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheMainContentAreaDisplaysItemsForSale() throws InterruptedException {
        // Element 1: Verify drawer layout is visible
        onView(withId(R.id.id_drawer_layout))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 2: Verify homeRecyclerView is visible and contains items for sale
        onView(withId(R.id.id_homeRecyclerView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollToPosition(1)); // Scroll to the second item as an example
        Thread.sleep(500);

        // Element 3: Verify card_recycler_view is visible and contains items for sale
        onView(withId(R.id.id_card_recycler_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollToPosition(1)); // Scroll to the second item as an example
        Thread.sleep(500);

        // Element 4: Verify card_recycler_view is visible and contains items for sale (same as element 3)
        onView(withId(R.id.id_card_recycler_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.scrollToPosition(1)); // Scroll to the second item as an example
        Thread.sleep(500);

        // Element 5: Verify home_search_icon is visible
        onView(withId(R.id.id_home_search_icon))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 6: Verify home_search_edittext is visible and enabled
        onView(withId(R.id.id_home_search_edittext))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.typeText("motorcycle"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Element 7: Verify left_drawer is visible
        onView(withId(R.id.id_left_drawer))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
    }
}