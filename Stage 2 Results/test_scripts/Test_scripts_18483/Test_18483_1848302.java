package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_18483_1848302 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowClickingOnNonexistentElements() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_tabLayout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_viewPager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_recycler_view))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_like))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_comment))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_share))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_like))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_comment))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_action_share))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_fab))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Error"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        for (int i = 1; i <= 3; i++) {
            String contentDescription = "[None]" + i;
            onView(withContentDescription(contentDescription))
                    .perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.onView(ViewMatchers.withText("Error"))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}