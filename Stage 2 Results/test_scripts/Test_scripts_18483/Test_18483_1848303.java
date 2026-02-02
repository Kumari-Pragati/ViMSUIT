package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ToggleButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_18483_1848303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationLikeButtonFunctionality() throws InterruptedException {
        // Step 1: Open the app and navigate to the main feed screen.
        // Assuming the main feed is already loaded or can be navigated directly.

        // Step 2: Click on the like button for Post 1.
        onView(withId(R.id.id_action_like)).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the like button for Post 2.
        onView(withId(R.id.id_action_like)).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the like button for Post 3.
        onView(withId(R.id.id_action_like)).perform(click());
        Thread.sleep(500);

        // Expected Result Assertions
        // Assuming there are TextViews or other views that display the number of likes.
        // For example, if the likes count is displayed in a TextView with id R.id.likes_count_1:
        
        // Check Post 1 like count increased by 1
        onView(withId(R.id.likes_count_1)).check(matches(ViewMatchers.withText("1")));
        
        // Check Post 2 like count increased by 1
        onView(withId(R.id.likes_count_2)).check(matches(ViewMatchers.withText("1")));

        // Check Post 3 like count increased by 1
        onView(withId(R.id.likes_count_3)).check(matches(ViewMatchers.withText("1")));
    }
}