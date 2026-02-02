package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15449_1544907 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheAdvertisementIsDisplayedCorrectly throws InterruptedException {
        // Step 1: Open the app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Book of Mormon section
        onView(withContentDescription("Books")).perform(click());
        Thread.sleep(500);
        
        // Step 3: Select chapter 7
        onView(allOf(withId(R.id.book_of_mormon), withText("Book of Mormon"))).perform(click());
        Thread.sleep(500);

        // Step 4: Verify that the advertisement for 'The Book of Mormon' is displayed correctly
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}