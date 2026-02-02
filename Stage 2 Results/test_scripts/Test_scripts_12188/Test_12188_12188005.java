package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;

@RunWith(AndroidJUnit4.class)
public class Test_12188_12188005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksMaybeLaterButtonAndThenLetsGoButton throws InterruptedException {
        // Navigate to the onboarding screen (assuming it's already there or will be automatically shown)
        
        // Step 3: Click on the 'Maybe Later' button
        Espresso.onView(ViewMatchers.withText("Maybe Later")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI updates
        
        // Step 4: Click on the 'Let's Go!' button
        Espresso.onView(withId(R.id.id_fragment_onboarding_introduction_next_button)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI updates

        // Expected result: The application should remain on the onboarding screen and the 'Maybe Later' button should be disabled
        Espresso.onView(ViewMatchers.withText("Maybe Later")).check(ViewAssertions.matches(isEnabled()));
    }
}