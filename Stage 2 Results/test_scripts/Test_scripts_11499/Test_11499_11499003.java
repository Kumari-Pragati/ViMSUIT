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
public class Test_11499_11499003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationEmptySearchInput() throws InterruptedException {
        // Open the app and navigate to the 'Gallery' screen.
        onView(ViewMatchers.withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Tap on the search icon in the header.
        onView(ViewMatchers.withId(R.id.id_action_search)).perform(ViewActions.click());
        Thread.sleep(500);

        // Enter an empty string in the search input field.
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);

        // Tap on the search icon to perform the search.
        onView(ViewMatchers.withId(R.id.id_action_search)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state of all elements
        for (int i = 1; i <= 16; i++) {
            switch (i) {
                case 1:
                    // Verify id_drawer_layout
                    onView(ViewMatchers.withId(R.id.id_drawer_layout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 2:
                    // Verify id_action_search
                    onView(ViewMatchers.withId(R.id.id_action_search)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 3:
                    // Verify id_relevanceId
                    onView(ViewMatchers.withId(R.id.id_relevanceId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 4:
                    // Verify id_priceId
                    onView(ViewMatchers.withId(R.id.id_priceId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 5:
                    // Verify id_sizeId
                    onView(ViewMatchers.withId(R.id.id_sizeId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 6:
                    // Verify id_updatedId
                    onView(ViewMatchers.withId(R.id.id_updatedId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 7:
                    // Verify id_apartmentRecyclerView
                    onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 8:
                    // Verify id_horizontalScrollView
                    onView(ViewMatchers.withId(R.id.id_horizontalScrollView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 9:
                    // Verify id_apartment_photo_pager
                    onView(ViewMatchers.withId(R.id.id_apartment_photo_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 10:
                    // Verify id_favoriteButtonId
                    onView(ViewMatchers.withId(R.id.id_favoriteButtonId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 11:
                    // Verify id_horizontalScrollView (repeated)
                    onView(ViewMatchers.withId(R.id.id_horizontalScrollView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 12:
                    // Verify id_apartment_photo_pager (repeated)
                    onView(ViewMatchers.withId(R.id.id_apartment_photo_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 13:
                    // Verify id_favoriteButtonId (repeated)
                    onView(ViewMatchers.withId(R.id.id_favoriteButtonId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 14:
                    // Verify id_apartment_photo_pager (repeated)
                    onView(ViewMatchers.withId(R.id.id_apartment_photo_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 15:
                    // Verify id_favoriteButtonId (repeated)
                    onView(ViewMatchers.withId(R.id.id_favoriteButtonId)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
                case 16:
                    // Verify Navigation Open
                    onView(ViewMatchers.withContentDescription("Navigation Open")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    break;
            }
        }
    }
}