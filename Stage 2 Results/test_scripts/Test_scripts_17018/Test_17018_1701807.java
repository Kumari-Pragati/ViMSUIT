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

public class Test_17018_1701807 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityFlowSearchingForANewsSource() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu screen.
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        
        // Step 2: Click on the menu icon in the header.
        onView(withContentDescription("['More options']")).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the search icon in the header.
        onView(withId(R.id.id_menu_search)).perform(click());
        Thread.sleep(500);

        // Step 4: Type 'CNN' in the search bar.
        Espresso.onView(ViewMatchers.withText("CNN")).perform(ViewActions.typeText("CNN"));
        Espresso.onView(ViewMatchers.withText("CNN")).perform(ViewActions.closeSoftKeyboard());
        Thread.sleep(500);

        // Step 5: Verify that the list of news sources is filtered to show only 'CNN'.
        onView(withId(R.id.id_feeditem_list)).check(matches(ViewMatchers.isDisplayed()));
        
        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 8; i++) {
            String cardViewId = "id_feeditem_item_cardview";
            int cardViewResourceId = R.id.id_feeditem_item_cardview;
            onView(withId(cardViewResourceId)).check(matches(ViewMatchers.isDisplayed()));
            Thread.sleep(500);
        }

        // Verify the search result
        RecyclerView recyclerView = (RecyclerView) activityRule.getActivity().findViewById(R.id.id_feeditem_list);
        for (int i = 0; i < recyclerView.getAdapter().getItemCount(); i++) {
            String itemText = ((TextView) recyclerView.findViewHolderForAdapterPosition(i).itemView.findViewById(R.id.your_text_view_id)).getText().toString();
            if (!itemText.contains("CNN")) {
                fail("Expected to find only 'CNN' news sources, but found: " + itemText);
            }
        }

        // Verify the other elements
        onView(withContentDescription("['Navigate up']")).check(matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        for (int i = 12; i <= 14; i++) {
            String contentDesc = "[None]";
            int contentDescResourceId = R.id.id_feeditem_item_cardview;
            onView(withContentDescription(contentDesc)).check(matches(ViewMatchers.isDisplayed()));
            Thread.sleep(500);
        }
    }
}
```

Note: Replace `R.id.your_text_view_id` with the actual resource ID of the text view in your card views. This example assumes that each card view has a text view with an id like `R.id.text_view`.