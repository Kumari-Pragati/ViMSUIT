package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_11235_1123506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestNavigation() throws InterruptedException {
        // Navigate to the 'Biancorosso' restaurant page (Assuming this is a known action)
        Espresso.onView(withId(R.id.id_tab_layout)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Click on the 'REVIEWS' tab
        Espresso.onView(withContentDescription("Reviews")).perform(ViewActions.click());
        Thread.sleep(500);

        // Test each element
        onView(withId(R.id.id_back))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_back)).check(matches(isDisplayed()));

        onView(withId(R.id.id_tab_layout))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_tab_layout)).check(matches(isDisplayed()));

        onView(withId(R.id.id_view_pager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        onView(withId(R.id.id_view_pager)).check(matches(isDisplayed()));

        // Test elements with no content description
        for (int i = 1; i <= 6; i++) {
            String contentDesc = "[None]" + i;
            onView(withContentDescription(contentDesc))
                    .perform(click());
            Thread.sleep(500);
            onView(withContentDescription(contentDesc)).check(matches(isDisplayed()));
        }

        // Click on the shopping cart icon in the Header/App Bar
        Espresso.onView(withContentDescription("Shopping Cart")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("Shopping Cart")).check(matches(isDisplayed()));
    }
}