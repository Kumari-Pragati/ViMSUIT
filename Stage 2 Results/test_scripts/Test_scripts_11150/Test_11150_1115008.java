package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_11150_1115008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfShortReviews() throws InterruptedException {
        // Step 1: Open the app and navigate to the feedback review screen.
        onView(withContentDescription("['写点评']")).perform(ViewActions.click());

        // Step 2: Click on the title '1 条点评' (1 short review).
        Thread.sleep(500);

        // Step 3: Verify that short reviews are displayed.
        onView(allOf(withId(R.id.action_comment_compose), withContentDescription("['写点评']"))).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Assuming the RecyclerView containing the short reviews has an id of R.id.short_reviews
        onView(allOf(withId(R.id.short_reviews))).check(matches(isDisplayed()));
    }
}