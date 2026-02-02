package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_15095_15095001 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheScreenDisplaysTheCorrectHeaderAndPromotionalImage() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Watchlist' page.
        onView(withId(R.id.id_header_browse_btn)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Verify that the header displays the 'Dove Channel' logo and the 'WATCHLIST' title.
        ImageView headerBrowseBtn = (ImageView) activityTestRule.getActivity().findViewById(R.id.id_header_browse_btn);
        
        onView(withId(R.id.id_header_browse_btn))
                .check(matches(withText("WATCHLIST")))
                .check(matches(ViewMatchers.isDisplayed()));
        
        // Step 3: Verify that the promotional image for 'The Real Deal' is displayed correctly.
        Thread.sleep(500); // Wait for UI to update
        
        onView(withId(R.id.promo_image_view)) // Assuming promo_image_view is the ID of the ImageView containing the promotional image
                .check(matches(ViewMatchers.isDisplayed()));
        
        Espresso.onView(ViewMatchers.withContentDescription("The Real Deal"))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}