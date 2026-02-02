package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_12280_12280001 {

    private ActivityTestRule<MainActivity> activityTestRule;

    @Before
    public void setUp() {
        activityTestRule = new ActivityTestRule<>(MainActivity.class);
    }

    @Test
    public void testPositiveFlowNavigateToHoodleScoreScreen throws InterruptedException {
        // Step 1: Open the Holaa app.
        
        // Step 2: Navigate to the 'Profile' section.
        onView(withId(R.id.id_secondaryIconView)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result
        // The 'Hoodle Score' screen is displayed.
        onView(withText("My Hoodle Score")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // The header shows a green bar with a back arrow and the title 'Hoodle'.
        Espresso.onView(ViewMatchers.withContentDescription("Navigate up"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withText("Hoodle"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The title 'My Hoodle Score' and subtitle 'Holaa app's score based on mobile usage' are visible.
        onView(withText("My Hoodle Score")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withText("Holaa app's score based on mobile usage"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The date range 'Dec 19, 2016 - Recently' is displayed.
        onView(withText("Dec 19, 2016 - Recently")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The circular gauge showing the user's score distribution is visible.
        Espresso.onView(withId(R.id.circular_gauge)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The category labels 'The Listener,' 'Silent Monk,' 'Sweet Talker,' 'The Speaker,' and 'The Chatterbox' are visible.
        onView(withText("The Listener")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withText("Silent Monk")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withText("Sweet Talker")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withText("The Speaker")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withText("The Chatterbox")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The text 'You are 'The Listener'' is displayed.
        Espresso.onView(withText("You are 'The Listener'"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The 'Share and tag friends to know their scores' text is visible.
        Espresso.onView(withText("Share and tag friends to know their scores"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // The Facebook share icon is visible.
        Espresso.onView(withId(R.id.facebook_share_icon))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}