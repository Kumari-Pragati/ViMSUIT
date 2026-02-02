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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13349_1334901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfAllLegalLinks() throws InterruptedException {
        // Open the app and navigate to the Legal screen
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
        
        // Verify header contains a back arrow and the word 'Legal'
        onView(ViewMatchers.withParent(withId(R.id.toolbar)))
                .check(matches(hasDescendant(withText("Legal"))));
        Thread.sleep(500);

        // Check that the content area lists the following items
        RecyclerView recyclerView = activityRule.getActivity().findViewById(R.id.id_recycler_view_legal_items);
        Espresso.onView(withId(R.id.id_recycler_view_legal_items))
                .perform(ViewActions.scrollToPosition(0))
                .check(matches(hasItemWithText("Online security")))
                .check(matches(hasItemWithText("Privacy policy")))
                .check(matches(hasItemWithText("Terms of use")))
                .check(matches(hasItemWithText("Pay to mobile terms")));
        Thread.sleep(500);

        // Ensure each item has a rightward chevron icon
        for (int i = 0; i < 4; i++) {
            onView(withId(R.id.id_recycler_view_legal_items))
                    .perform(ViewActions.scrollToPosition(i));
            Thread.sleep(500);
            Espresso.onView(withRecyclerView(recyclerView)
                    .atPositionOnView(i, R.id.item_right_chevron))
                    .check(matches(isDisplayed()));
        }
    }

    private static RecyclerViewMatcher withRecyclerView(final int recyclerViewId) {
        return new RecyclerViewMatcher(recyclerViewId);
    }

    private static class RecyclerViewMatcher {

        private final int recyclerViewId;

        public RecyclerViewMatcher(int recyclerViewId) {
            this.recyclerViewId = recyclerViewId;
        }

        protected RecyclerView.ViewHolder findViewHolder(RecyclerView recyclerView, long id) {
            for (RecyclerView.ViewHolder viewHolder : ((android.support.v7.widget.RecyclerView.Adapter) recyclerView.getAdapter()).item分工合作，共同完成测试。