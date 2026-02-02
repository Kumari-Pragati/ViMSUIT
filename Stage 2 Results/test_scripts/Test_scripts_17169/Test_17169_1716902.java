package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17169_1716902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationDrawerOptionsAreClickable() throws InterruptedException {
        // Loop through all elements and perform actions
        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_drawer_layout)).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_homeRecyclerView)).perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_card_recycler_view)).perform(click());
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withId(R.id.id_card_recycler_view)).perform(click());
                    Thread.sleep(500);
                    break;
                case 5:
                    onView(withId(R.id.id_home_search_icon)).perform(click());
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withId(R.id.id_home_search_edittext)).perform(click());
                    Thread.sleep(500);
                    break;
                case 7:
                    onView(withId(R.id.id_left_drawer)).perform(click());
                    Thread.sleep(500);
                    break;
            }

            // Add assertions to verify each element's behavior
            switch (i) {
                case 1:
                    onView(withId(R.id.id_homeRecyclerView)).check(matches(isDisplayed()));
                    break;
                case 2:
                    onView(withId(R.id.id_card_recycler_view)).check(matches(isDisplayed()));
                    break;
                case 3:
                    onView(withId(R.id.id_card_recycler_view)).check(matches(isDisplayed()));
                    break;
                case 4:
                    onView(withId(R.id.id_home_search_icon)).check(matches(isDisplayed()));
                    break;
                case 5:
                    onView(withId(R.id.id_home_search_edittext)).check(matches(isDisplayed()));
                    break;
                case 6:
                    onView(withId(R.id.id_left_drawer)).check(matches(isDisplayed()));
                    break;
            }
        }
    }
}