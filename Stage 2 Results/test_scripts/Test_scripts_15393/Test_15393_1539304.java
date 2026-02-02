package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15393_1539304 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheFooterAndReadsTheInstructionsToDonate() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Your good deed for today' screen.
        Espresso.onView(ViewMatchers.withId(R.id.your_good_deed_recycler_view)).perform(ViewActions.scrollTo(RecyclerView.SCROLL_STATE_SETTLING));

        // Step 2: Scroll down to the footer and read the instructions to donate to the Tiny Feet Foundation.
        Thread.sleep(500); // Wait for UI to settle

        Espresso.onView(withId(R.id.id_drawer_layout))
                .inRoot(withDecorView(not(isRoot())))
                .perform(ViewActions.scrollTo())
                .check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for UI to settle
    }
}