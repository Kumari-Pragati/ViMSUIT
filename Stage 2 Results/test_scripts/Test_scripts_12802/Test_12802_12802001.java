package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12802_12802001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigateToMusicHistoryScreen() throws InterruptedException {
        // Step 1: Open the Music App (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the Music History screen
        onView(withId(R.id.id_recyclerview)).performScrollToPosition(0, null, true);
        Thread.sleep(500); // Wait for UI to update

        // Expected Result Assertions
        // Check if the header 'Music history' is displayed
        onView(withText("Music history")).check(matches(isDisplayed()));
        
        // Check if the RecyclerView is displayed and has items
        onView(withId(R.id.id_recyclerview)).check(matches(isDisplayed()));
    }
}