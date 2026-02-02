package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13721_1372106 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceMessageRetention() throws InterruptedException {
        // Element 1: withId(R.id.id_content_drawer)
        onView(withId(R.id.id_content_drawer)).perform(click());
        Thread.sleep(500);
        onView(allOf(isDisplayed(), withContentDescription("['Open menu']"))).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_menu_notifications)).check(matches(isDisplayed()));
        
        // Element 2: withId(R.id.id_menu_notifications)
        onView(withId(R.id.id_content_drawer)).perform(click());
        Thread.sleep(500);
        onView(allOf(isDisplayed(), withContentDescription("['Open menu']"))).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_menu_notifications)).check(matches(isDisplayed()));
        
        // Element 3: withId(R.id.id_note_sticky_view_action_add)
        onView(withId(R.id.id_content_drawer)).perform(click());
        Thread.sleep(500);
        onView(allOf(isDisplayed(), withContentDescription("['Open menu']"))).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_note_sticky_view_action_add)).check(matches(isDisplayed()));
        
        // Element 4: withContentDescription("['Open menu']")
        onView(withId(R.id.id_content_drawer)).perform(click());
        Thread.sleep(500);
        onView(allOf(isDisplayed(), withContentDescription("['Open menu']"))).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_menu_notifications)).check(matches(isDisplayed()));
    }
}