package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11746_11746001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateToVocabularyScreen() throws InterruptedException {
        // Step 1: Open the Language Learning App (Assuming it's already open, or this step is handled by setup)

        // Step 2: Navigate to the Vocabulary section
        onView(withId(R.id.id_action_tip)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The Vocabulary screen is displayed with the correct layout and content
        onView(withText("Vocabulary")).check(matches(isDisplayed()));
    }
}