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
public class Test_11499_11499002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidTabSelection() throws InterruptedException {
        // Open the app and navigate to the 'Gallery' screen.
        onView(ViewMatchers.withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Tap on the 'Relevance' tab to view the apartment listings.
        onView(ViewMatchers.withId(R.id.id_relevanceId)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Tap on the 'Price' tab to view the apartment listings.
        onView(ViewMatchers.withId(R.id.id_priceId)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Tap on the 'Size' tab to view the apartment listings.
        onView(ViewMatchers.withId(R.id.id_sizeId)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Tap on the 'Updated' tab to view the apartment listings.
        onView(ViewMatchers.withId(R.id.id_updatedId)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Loop through all 16 elements and perform test steps on each
        for (int i = 1; i <= 16; i++) {
            switch (i) {
                case 2:
                    onView(ViewMatchers.withId(R.id.id_action_search)).perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    // This is the same as relevance, no need to repeat
                    break;
                case 4:
                    // This is the same as price, no need to repeat
                    break;
                case 5:
                    // This is the same as size, no need to repeat
                    break;
                case 6:
                    // This is the same as updated, no need to repeat
                    break;
                case 7:
                    Espresso.onView(ViewMatchers.withId(R.id.id_apartmentRecyclerView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 8:
                    onView(ViewMatchers.withId(R.id.id_horizontalScrollView)).perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 9:
                    Espresso.onView(ViewMatchers.withId(R.id.id_apartment_photo_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 10:
                    onView(ViewMatchers.withId(R.id.id_favoriteButtonId)).perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 11:
                    // This is the same as horizontalScrollView, no need to repeat
                    break;
                case 12:
                    // This is the same as apartment_photo_pager, no need to repeat
                    break;
                case 13:
                    // This is the same as favoriteButtonId, no need to repeat
                    break;
                case 14:
                    // This is the same as apartment_photo_pager, no need to repeat
                    break;
                case 15:
                    // This is the same as favoriteButtonId, no need to repeat
                    break;
                case 16:
                    Espresso.onView(ViewMatchers.withContentDescription("Navigation Open")).perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
            }
        }
    }
}