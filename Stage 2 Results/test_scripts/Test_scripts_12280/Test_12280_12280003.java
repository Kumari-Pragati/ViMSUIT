package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Spinner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12280_12280003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationEmptyDateRange() throws InterruptedException {
        // Step 1: Open the Holaa app.
        // Step 2: Navigate to the 'Profile' section.

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 3: The 'Hoodle Score' screen is displayed.
        onView(withId(R.id.id_hoodle_range_picker)).check(matches(isDisplayed()));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 4: The header shows a green bar with a back arrow and the title 'Hoodle'.
        onView(withId(R.id.header_title)).check(matches(withText("Hoodle")));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 5: The title 'My Hoodle Score' and subtitle 'Holaa app's score based on mobile usage' are visible.
        onView(withId(R.id.title)).check(matches(withText("My Hoodle Score")));
        onView(withId(R.id.subtitle)).check(matches(withText("Holaa app's score based on mobile usage")));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 6: The date range 'Dec 19, 2016 - Recently' is displayed.
        onView(withId(R.id.date_range)).check(matches(withText("Dec 19, 2016 - Recently")));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 7: The circular gauge showing the user's score distribution is visible.
        onView(withId(R.id.circular_gauge)).check(matches(isDisplayed()));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 8: The category labels 'The Listener,' 'Silent Monk,' 'Sweet Talker,' 'The Speaker,' and 'The Chatterbox' are visible.
        onView(withId(R.id.category_labels)).check(matches(isDisplayed()));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 9: The text 'You are 'The Listener'' is displayed.
        onView(withId(R.id.you_are_label)).check(matches(withText("You are 'The Listener'")));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 10: The 'Share and tag friends to know their scores' text is visible.
        onView(withId(R.id.share_text)).check(matches(withText("Share and tag friends to know their scores")));

        // Wait for the view to be displayed and interact with it
        Thread.sleep(500);

        // Step 11: The Facebook share icon is visible.
        onView(withId(R.id.facebook_share_icon)).check(matches(isDisplayed()));
    }
}