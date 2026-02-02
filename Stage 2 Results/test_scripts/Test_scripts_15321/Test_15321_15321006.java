package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

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
public class Test_15321_15321006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityEnsureThePostContentIsAccessibleToUsersWithScreenReaders() throws InterruptedException {
        // Step 1: Open the Talklife app (Assuming it's already open, or this step is handled by setup)

        // Step 2: Navigate to the post with specific text and emojis
        onView(withId(R.id.id_rv_feed)).perform(click());
        Thread.sleep(500); // Wait for the RecyclerView to load

        // Step 3: Use a screen reader to verify that the post content is accessible
        // For demonstration, we will simulate this by checking if the text is visible on the screen
        onView(withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck")).check(matches(isDisplayed()));
        Thread.sleep(500); // Wait for the content to be displayed

        // Additional assertion: Check if the post content is accessible (simulated by checking text)
        onView(withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck")).check(matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}