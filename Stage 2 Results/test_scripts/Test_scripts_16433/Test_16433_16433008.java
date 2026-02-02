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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16433_16433008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestWidgetImageNavigation() throws InterruptedException {
        // Navigate to the 'Gallery' screen (assuming it's the main screen)
        
        // Test element 1: id_img_back_btn
        onView(withId(R.id.id_img_back_btn)).perform(click());
        Thread.sleep(500);
        // Verify state of the back button is displayed after click
        onView(withId(R.id.id_img_back_btn)).check(matches(isDisplayed()));

        // Test element 2: id_recycler_view
        onView(withId(R.id.id_recycler_view)).perform(click());
        Thread.sleep(500);
        // Verify state of the recycler view is displayed after click
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
        
        // Scroll through the grid of weather widget images (assuming it's a RecyclerView)
        Espresso.onView(withId(R.id.id_recycler_view))
                .perform(ViewActions.scrollToPosition(10)); // Adjust position as needed
        Thread.sleep(500);
    }
}