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
public class Test_10636_1063608 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheSecondSmallerImageWithTheCaptionBestTweetsItsHappenedAgainarsenalDrawBayern() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withContentDescription("open drawer"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_tablayout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        // Continue for all elements...

        // Element 3
        onView(withId(R.id.id_vp_content_main_activity))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 4
        onView(withId(R.id.id_recyclerview))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 5
        onView(withId(R.id.id_horizontal_scroll_twins))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Elements 6 to 12 (withContentDescription("[None]"))
        for (int i = 6; i <= 12; i++) {
            String contentDesc = "[None]";
            if (i == 6) {
                contentDesc = "open drawer";
            }
            onView(ViewMatchers.withContentDescription(contentDesc))
                    .perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Verify the expected result
        Espresso.onView(ViewMatchers.withText("Best Tweets: It's happened again...Arsenal draw Bayern"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}