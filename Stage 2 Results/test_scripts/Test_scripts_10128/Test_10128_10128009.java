package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_10128_10128009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyArticleNavigation() throws InterruptedException {
        // Open the Help section.
        onView(withId(R.id.help_section)).perform(click());
        Thread.sleep(500);

        // Navigate to the 'Knowledge Base' section.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Select an article from the 'Locations' category.
        // Assuming there is a button or view with id R.id.locations_category
        onView(withId(R.id.locations_category)).perform(click());
        Thread.sleep(500);

        // Navigate back to the 'Knowledge Base' section.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Verify that the 'Knowledge Base' section is displayed.
        onView(withId(R.id.knowledge_base_section)).check(matches(ViewMatchers.isDisplayed()));
    }
}