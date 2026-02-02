package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(JUnit4.class)
public class Test_16741_1674104 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTogglesStateEpisodeDetailsToggle() throws InterruptedException {
        // Step 1: Open the app and navigate to the news screen.
        // Assuming the news screen is already open or can be navigated directly

        // Step 2: Verify the title, image, subtitle, and headline are displayed as expected.
        ImageView imageView = activityTestRule.getActivity().findViewById(R.id.news_image);
        TextView titleTextView = activityTestRule.getActivity().findViewById(R.id.news_title);
        TextView subtitleTextView = activityTestRule.getActivity().findViewById(R.id.news_subtitle);
        TextView headlineTextView = activityTestRule.getActivity().findViewById(R.id.news_headline);

        onView(allOf(withId(R.id.news_image), isDisplayed())).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.news_title), isDisplayed(), withText("Expected Title"))).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.news_subtitle), isDisplayed(), withText("Expected Subtitle"))).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.news_headline), isDisplayed(), withText("Expected Headline"))).check(matches(isDisplayed()));

        // Step 3: Tap on the subtitle to toggle the episode details.
        Thread.sleep(500);
        onView(allOf(withId(R.id.news_subtitle), isDisplayed())).perform(ViewActions.click());

        // Step 4: Verify the episode details are displayed.
        TextView episodeDetailsTextView = activityTestRule.getActivity().findViewById(R.id.episode_details);

        Thread.sleep(500);
        onView(allOf(withId(R.id.episode_details), isDisplayed(), withText("Expected Episode Details"))).check(matches(isDisplayed()));
    }
}