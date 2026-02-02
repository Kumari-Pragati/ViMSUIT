package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16433_16433009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestWidgetImageSelection() throws InterruptedException {
        // Navigate to the 'Gallery' screen
        onView(withId(R.id.id_img_back_btn)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
        
        // Select a weather widget image by tapping on it (Element 1)
        onView(withId(R.id.id_recycler_view)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));

        // Navigate back to the main screen
        onView(withId(R.id.id_img_back_btn)).perform(click());
        Thread.sleep(500);

        // Select a weather widget image by tapping on it (Element 2)
        onView(withId(R.id.id_recycler_view)).perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_recycler_view)).check(matches(isDisplayed()));
    }
}