package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.TimeUnit;

@RunWith(JUnit4.class)
public class Test_1068_1068002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAddAProfilePhoto() throws InterruptedException {
        // Element 1: Click on the placeholder icon for a profile photo.
        onView(withId(R.id.id_profile))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of Element 1 (optional, depending on what you expect to happen)
        Espresso.onView(ViewMatchers.isAssignableFrom(ImageButton.class)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: Click on the expand menu button
        onView(withId(R.id.id_fab_expand_menu_button))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of Element 2 (optional, depending on what you expect to happen)
        Espresso.onView(ViewMatchers.withContentDescription("Navigate up")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: Click on the "Navigate up" button
        onView(ViewMatchers.withContentDescription("Navigate up"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of Element 3 (optional, depending on what you expect to happen)
        Espresso.onView(ViewMatchers.isAssignableFrom(ImageButton.class)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 4: Perform an action with a non-content description element
        onView(ViewMatchers.withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of Element 4 (optional, depending on what you expect to happen)
        Espresso.onView(ViewMatchers.isAssignableFrom(ImageButton.class)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}