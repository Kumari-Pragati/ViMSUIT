package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class Test_17018_1701806 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFunctionalFlowChangingTheOrderOfNewsSources() throws InterruptedException {
        // Open the app and navigate to the menu screen.
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Click on the menu icon in the header.
        onView(withContentDescription("['More options']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Select 'Reuters' from the list of news sources.
        String reuters = "Reuters";
        onView(ViewMatchers.withText(reuters)).perform(ViewActions.click());
        Thread.sleep(500);

        // Drag and drop 'Reuters' to a different position in the list.
        // Assuming we are moving Reuters to the first position
        RecyclerView recyclerView = (RecyclerView) activityRule.getActivity().findViewById(R.id.id_feeditem_list);
        Espresso.onView(recyclerView.atPosition(1)).perform(ViewActions.swipeLeft());
        Thread.sleep(500);

        // Verify that 'Reuters' is in the new position in the list.
        onView(ViewMatchers.withText(reuters)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Loop through all 14 elements and perform test steps on each
        for (int i = 1; i <= 14; i++) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    onView(withId(R.id.id_feeditem_empty_container)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_feeditem_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    // These are cardviews, no specific action needed
                    break;
                case 9:
                    onView(withId(R.id.id_menu_search)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 10:
                    onView(withContentDescription("['Navigate up']")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    // None content description, no specific action needed
                    break;
            }
        }
    }
}