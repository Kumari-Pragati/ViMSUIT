package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10863_10863003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserSelectsTheSureButtonInTheRatingPrompt() throws InterruptedException {
        // Step 2: Navigate to the home page (Assuming home page is already open or can be navigated directly)
        
        // Step 3: Click on the 'Sure' button in the rating prompt
        Thread.sleep(500); // Wait for UI to load and any initial prompts to appear
        
        onView(withId(R.id.id_btnPositive)).perform(click());
        
        Thread.sleep(500); // Small delay before checking if the prompt is dismissed

        // Expected result: The rating prompt should be dismissed
        onView(withId(R.id.id_btnPositive)).check(matches(not(isDisplayed())));
    }
}