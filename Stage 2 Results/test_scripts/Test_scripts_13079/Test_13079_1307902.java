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
public class Test_13079_1307902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheHeaderAndListRows() throws InterruptedException {
        // Element 1: Verify the header shows the menu icon and the title 'Vehicles'
        onView(withId(R.id.id_drawer_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        onView(withContentDescription("['Fuelio']"))
                .check(matches(ViewMatchers.withText("Vehicles")));

        // Element 2: Verify there are two list rows, each with an image, a title, and a subtitle
        onView(withId(R.id.id_recyclerView))
                .perform(ViewActions.click());
        Thread.sleep(500);
        RecyclerView recyclerView = (RecyclerView) Espresso.onView(withId(R.id.id_recyclerView)).getRecyclerViewInstance();
        int itemCount = recyclerView.getAdapter().getItemCount();
        assert itemCount == 2 : "Expected 2 list rows, but found " + itemCount;

        // Element 3: Verify the card view
        onView(withId(R.id.id_card_view))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 4: Verify the button popup
        onView(withId(R.id.id_button_popup))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 5: Verify the second card view
        onView(withId(R.id.id_card_view))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 6: Verify the second button popup
        onView(withId(R.id.id_button_popup))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 7: Verify the floating action button (FAB)
        onView(withId(R.id.id_fab))
                .check(matches(ViewMatchers.isDisplayed()));

        // Element 8: Verify the header title 'Vehicles'
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Fuelio']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        onView(withContentDescription("['Fuelio']"))
                .check(matches(ViewMatchers.withText("Vehicles")));
    }
}