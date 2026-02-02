package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_11499_11499007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectNone() throws InterruptedException {
        // Open the app and navigate to the 'Gallery' screen

        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withContentDescription("['Navigation Open']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_action_search))
                .perform(click());
        Thread.sleep(500);
        
        onView(withId(R.id.id_relevanceId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_priceId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_sizeId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_updatedId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_apartmentRecyclerView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_horizontalScrollView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
        
        onView(withId(R.id.id_apartment_photo_pager))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_favoriteButtonId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_horizontalScrollView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
        
        onView(withId(R.id.id_apartment_photo_pager))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_favoriteButtonId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_apartment_photo_pager))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        onView(withId(R.id.id_favoriteButtonId))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);
    }
}