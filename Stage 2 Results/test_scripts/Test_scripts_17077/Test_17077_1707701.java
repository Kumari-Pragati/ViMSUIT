package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17077_1707701 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowOpenTheAppAndVerifyTheListOfGlutenfreeTakeawayRestaurantsSortedByRating() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_menu_show_map))
                .perform(click());
        Thread.sleep(500);
        
        // Verify state of app bar
        onView(ViewMatchers.withText("Gluten-Free"))
                .check(matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withText("33 places"))
                .check(matches(ViewMatchers.isDisplayed()));

        // Navigate to the list of gluten-free takeaway restaurants
        onView(withId(R.id.id_listView1))
                .perform(click());
        Thread.sleep(500);

        // Verify that the list is sorted by rating
        RecyclerView recyclerView = (RecyclerView) activityRule.getActivity().findViewById(R.id.id_listView1);
        for (int i = 0; i < recyclerView.getChildCount() - 1; i++) {
            float rating1 = Float.parseFloat(((TextView) recyclerView.getChildAt(i).findViewById(R.id.rating)).getText().toString());
            float rating2 = Float.parseFloat(((TextView) recyclerView.getChildAt(i + 1).findViewById(R.id.rating)).getText().toString());
            assert (rating1 >= rating2);
        }

        // Check that each restaurant row contains details such as name, cuisine type, address, rating, and status
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            String name = ((TextView) recyclerView.getChildAt(i).findViewById(R.id.name)).getText().toString();
            String cuisineType = ((TextView) recyclerView.getChildAt(i).findViewById(R.id.cuisine_type)).getText().toString();
            String address = ((TextView) recyclerView.getChildAt(i).findViewById(R.id.address)).getText().toString();
            float rating = Float.parseFloat(((TextView) recyclerView.getChildAt(i).findViewById(R.id.rating)).getText().toString());
            String status = ((TextView) recyclerView.getChildAt(i).findViewById(R.id.status)).getText().toString();

            // Add assertions for each detail
            onView(ViewMatchers.withText(name))
                    .check(matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withText(cuisineType))
                    .check(matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withText(address))
                    .check(matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withText(String.valueOf(rating)))
                    .check(matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withText(status))
                    .check(matches(ViewMatchers.isDisplayed()));
        }

        // More options menu
        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);

        // Close the more options menu
        onView(withContentDescription("[None]"))
                .perform(click());
    }
}