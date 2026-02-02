package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15321_15321004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateClickOnTheStarIconToFavoriteThePost() throws InterruptedException {
        // Step 1: Open the Talklife app (Assuming it's already open and on the main activity)
        
        // Step 2: Navigate to the post with specific text and emojis
        Espresso.onView(withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck"))
                .perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the star icon
        Espresso.onView(withId(R.id.id_ib_star))
                .perform(click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The star icon is toggled to indicate that the post is now favorited.
        Espresso.onView(withId(R.id.id_ib_star))
                .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}