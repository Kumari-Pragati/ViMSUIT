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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11499_11499006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckBoxesNone() throws InterruptedException {
        // Open the app and navigate to the 'Gallery' screen

        // Element 1: withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).check(matches(ViewMatchers.withText("Gallery")));

        // Element 2: withId(R.id.id_action_search)
        onView(withId(R.id.id_action_search)).perform(click());
        Thread.sleep(500);

        // Element 3: withId(R.id.id_relevanceId)
        onView(withId(R.id.id_relevanceId)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 4: withId(R.id.id_priceId)
        onView(withId(R.id.id_priceId)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 5: withId(R.id.id_sizeId)
        onView(withId(R.id.id_sizeId)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 6: withId(R.id.id_updatedId)
        onView(withId(R.id.id_updatedId)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 7: withId(R.id.id_apartmentRecyclerView)
        onView(withId(R.id.id_apartmentRecyclerView)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 8: withId(R.id.id_horizontalScrollView)
        onView(withId(R.id.id_horizontalScrollView)).perform(click());
        Thread.sleep(500);
        
        // Element 9: withId(R.id.id_apartment_photo_pager)
        onView(withId(R.id.id_apartment_photo_pager)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 10: withId(R.id.id_favoriteButtonId)
        onView(withId(R.id.id_favoriteButtonId)).perform(click());
        Thread.sleep(500);

        // Element 11: withId(R.id.id_horizontalScrollView) - duplicate, no action needed
        Thread.sleep(500);

        // Element 12: withId(R.id.id_apartment_photo_pager)
        onView(withId(R.id.id_apartment_photo_pager)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 13: withId(R.id.id_favoriteButtonId)
        onView(withId(R.id.id_favoriteButtonId)).perform(click());
        Thread.sleep(500);

        // Element 14: withId(R.id.id_apartment_photo_pager)
        onView(withId(R.id.id_apartment_photo_pager)).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Element 15: withId(R.id.id_favoriteButtonId)
        onView(withId(R.id.id_favoriteButtonId)).perform(click());
        Thread.sleep(500);

        // Element 16: withContentDescription("['Navigation Open']")
        Espresso.onView(withContentDescription("['Navigation Open']")).perform(click());
        Thread.sleep(500);
    }
}