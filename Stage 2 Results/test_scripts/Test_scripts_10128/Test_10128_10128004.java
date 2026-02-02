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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_10128_10128004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testVerifyArticleNavigation() throws InterruptedException {
        // Step 1: Open the Help section.
        onView(allOf(withContentDescription("Help"))).perform(click());
        
        Thread.sleep(500);
        
        // Step 2: Navigate to the 'Knowledge Base' section.
        onView(allOf(withContentDescription("Knowledge Base"))).perform(click());
        
        Thread.sleep(500);
        
        // Step 3: Select an article from the 'Locations' category.
        // Assuming there is a list of articles and we select one
        onView(allOf(withContentDescription("Locations"))).perform(click());
        
        Thread.sleep(500);
        
        // Step 4: Navigate back to the 'Knowledge Base' section.
        onView(withContentDescription("['Navigate up']")).perform(click());
        
        Thread.sleep(500);
        
        // Expected Result: The 'Knowledge Base' section is displayed.
        onView(allOf(withContentDescription("Knowledge Base"))).check(matches(isDisplayed()));
    }
}