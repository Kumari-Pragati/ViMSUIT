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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12775_12775003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheBonusTab() throws InterruptedException {
        // Step 1: Open the 'Falloutcrafter Mod' app

        // Step 2: Tap on the 'ALL MODS' tab in the navigation bar.
        onView(withId(R.id.id_howto))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).check(matches(isDisplayed()));

        // Step 3: Tap on the 'BONUS' tab in the navigation bar.
        onView(withId(R.id.id_sliding_tabs))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_pager)).check(matches(isDisplayed()));
        
        for (int i = 1; i <= 13; i++) {
            switch (i) {
                case 2:
                    onView(withId(R.id.id_sliding_tabs))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    Espresso.onView(withId(R.id.id_pager)).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 4:
                    Espresso.onView(withId(R.id.id_my_recycler_view))
                            .check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                default:
                    // Handle the [None] content descriptions
                    onView(withContentDescription("[None]"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
            }
        }

        // Verify that the 'BONUS' tab is selected and the list of mods under the 'BONUS' category is displayed.
        Espresso.onView(withId(R.id.id_my_recycler_view))
                .check(matches(isDisplayed()));
    }
}