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
public class Test_11499_11499005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsTabs() throws InterruptedException {
        // Navigate to the Gallery screen and tap on 'Relevance' tab
        onView(withId(R.id.gallery_screen)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Tap on the 'Relevance' tab
        onView(withContentDescription("['Navigation Open']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates relevance)
        onView(withId(R.id.listing_sort_relevance)).check(ViewAssertions.matches(isDisplayed()));

        // Tap on the 'Price' tab
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withContentDescription("['Navigation Open']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates price)
        onView(withId(R.id.listing_sort_price)).check(ViewAssertions.matches(isDisplayed()));

        // Tap on the 'Size' tab
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withContentDescription("['Navigation Open']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates size)
        onView(withId(R.id.listing_sort_size)).check(ViewAssertions.matches(isDisplayed()));

        // Tap on the 'Updated' tab
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withContentDescription("['Navigation Open']")).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates updated)
        onView(withId(R.id.listing_sort_updated)).check(ViewAssertions.matches(isDisplayed()));
    }
}