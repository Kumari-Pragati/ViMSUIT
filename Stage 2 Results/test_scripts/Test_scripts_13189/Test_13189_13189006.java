package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.AbsListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_13189_13189006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Step 1: Open the news application.
        // Step 2: Navigate to the news feed section.
        
        // Wait for the RecyclerView to be displayed and interactable
        Thread.sleep(500);
        onView(withId(R.id.id_recyclerView)).check(matches(isDisplayed()));

        // Step 3: Close the application and reopen it.
        activityTestRule.finishActivity();
        activityTestRule.launchActivity(null);

        // Step 4: Verify that the news feed is still displayed with the same articles.
        Thread.sleep(500);
        onView(withId(R.id.id_recyclerView)).check(matches(isDisplayed()));

        // Additional check to ensure the same articles are loaded
        AbsListView recyclerView = (AbsListView) activityTestRule.getActivity().findViewById(R.id.id_recyclerView);
        int childCountBeforeClose = recyclerView.getChildCount();
        
        Thread.sleep(500);

        int childCountAfterOpen = recyclerView.getChildCount();
        assert childCountBeforeClose == childCountAfterOpen : "The number of articles in the news feed has changed.";
    }
}