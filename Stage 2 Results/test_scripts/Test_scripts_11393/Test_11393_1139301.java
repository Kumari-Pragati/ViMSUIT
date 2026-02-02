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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_11393_1139301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateToTheSearchScreenAndViewTheListOfOffairStations() throws InterruptedException {
        // Test each element
        onView(withContentDescription("['Search']"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withText("SEARCH")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));
        onView(withText("OFF AIR")).inRoot(isDialog()).check(matches(ViewMatchers.isDisplayed()));

        for (int i = 0; i < 10; i++) { // Assuming there are at least 10 items in the list
            onView(withId(R.id.recycler_view)).perform(swipeUp());
            Thread.sleep(500);
        }

        RecyclerView recyclerView = activityRule.getActivity().findViewById(R.id.recycler_view);
        for (int i = 0; i < 10; i++) { // Assuming there are at least 10 items in the list
            onView(recyclerView.getChildAt(i)).check(matches(hasIconAndNameAndLabel()));
            Thread.sleep(500);
        }

        // Test More options
        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);

        // Test None (No specific action for this element, just ensure it doesn't interfere)
        
        Espresso.pressBack();
    }

    private ViewAssertion hasIconAndNameAndLabel() {
        return new ViewAssertion() {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException) {
                if (noViewFoundException != null) {
                    throw noViewFoundException;
                }
                // Assuming the view is a CardView or similar with icon, name, and label
                onView(withContentDescription("[None]")).check(matches(isDisplayed()));
            }
        };
    }
}