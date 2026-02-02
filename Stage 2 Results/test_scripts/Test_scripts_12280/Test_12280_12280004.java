package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_12280_12280004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateCircularGaugeVisibility() throws InterruptedException {
        // Step 1: Open the Holaa app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the 'Profile' section
        onView(withId(R.id.id_secondaryIconView)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Simulate a toggle to hide the circular gauge
        onView(withId(R.id.id_secondaryIconView)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result Assertions
        // The 'Hoodle Score' screen is displayed.
        onView(withId(R.id.header)).check(matches(isDisplayed()));
        
        // The header shows a green bar with a back arrow and the title 'Hoodle'.
        onView(withId(R.id.backArrow)).check(matches(isDisplayed()));
        onView(withText("Hoodle")).check(matches(isDisplayed()));

        // The title 'My Hoodle Score' and subtitle 'Holaa app's score based on mobile usage' are visible.
        onView(withText("My Hoodle Score")).check(matches(isDisplayed()));
        onView(withText("Holaa app's score based on mobile usage")).check(matches(isDisplayed()));

        // The date range 'Dec 19, 2016 - Recently' is displayed.
        onView(withText("Dec 19, 2016 - Recently")).check(matches(isDisplayed()));

        // The circular gauge showing the user's score distribution is not visible.
        onView(withId(R.id.circularGauge)).check(matches(not(isDisplayed())));

        // The category labels 'The Listener,' 'Silent Monk,' 'Sweet Talker,' 'The Speaker,' and 'The Chatterbox' are visible.
        onView(withText("The Listener")).check(matches(isDisplayed()));
        onView(withText("Silent Monk")).check(matches(isDisplayed()));
        onView(withText("Sweet Talker")).check(matches(isDisplayed()));
        onView(withText("The Speaker")).check(matches(isDisplayed()));
        onView(withText("The Chatterbox")).check(matches(isDisplayed()));

        // The text 'You are 'The Listener'' is displayed.
        onView(withText("You are 'The Listener'")).check(matches(isDisplayed()));

        // The 'Share and tag friends to know their scores' text is visible.
        onView(withText("Share and tag friends to know their scores")).check(matches(isDisplayed()));

        // The Facebook share icon is visible.
        onView(withId(R.id.facebookShareIcon)).check(matches(isDisplayed()));
    }
}