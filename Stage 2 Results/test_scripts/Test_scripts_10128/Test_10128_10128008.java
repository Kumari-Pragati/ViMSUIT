package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.widget.ListView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10128_10128008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Ensure the main activity is launched before tests start
    }

    @Test
    public void testVerifyArticleSelection throws InterruptedException {
        // Step 1: Open the Help section.
        onView(withText("Help")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Navigate to the 'Knowledge Base' section.
        onView(withText("Knowledge Base")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Select an article from the 'Locations' category.
        // Assuming there is a ListView with id R.id.list and we select the first item
        onView(withId(R.id.list)).check(matches(ViewMatchers.isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Perform click on the first item in the list (assuming it's the article from 'Locations' category)
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The selected article is displayed.
        // Assuming there is a TextView with id R.id.articleTitle that displays the title of the article
        onView(withId(R.id.articleTitle)).check(matches(withText("Article Title"))); // Replace "Article Title" with actual expected text
    }
}