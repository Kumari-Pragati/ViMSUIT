package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16433_16433004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationWidgetImageSize() throws InterruptedException {
        // Navigate to the 'Gallery' screen
        Espresso.onView(withId(R.id.id_img_back_btn)).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of id_img_back_btn
        Espresso.onView(withId(R.id.id_img_back_btn)).check(matches(isDisplayed()));

        // Navigate to the 'Gallery' screen using RecyclerView
        Espresso.onView(withId(R.id.id_recycler_view)).perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state of id_recycler_view
        Espresso.onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
    }
}