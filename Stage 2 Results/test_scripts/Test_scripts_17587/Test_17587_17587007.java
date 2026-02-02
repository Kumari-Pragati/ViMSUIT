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
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17587_17587007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheFollowButtonInTheFooter() throws InterruptedException {
        // Step 1: Open the news app (Assuming MainActivity is launched by default)
        
        // Step 2: Tap on the 'For You' tab in the navigation bar
        onView(withId(R.id.nav_for_you)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Tap on the 'Follow' button in the footer
        onView(withId(R.id.id_o3)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The app should navigate to the follow section
        onView(withId(R.id.follow_section)).check(matches(isDisplayed()));
    }
}