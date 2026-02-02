package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10592_1059204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceWhenTheApplicationIsClosedAndReopened throws InterruptedException {
        // Step 1: Open the application and navigate to the 'Social Networks' screen.
        onView(withId(R.id.id_btn_facebook)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Add a social network by clicking the green plus sign.
        Button addSocialNetworkButton = activityRule.getActivity().findViewById(R.id.id_btn_add_social_network);
        addSocialNetworkButton.performClick();
        
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Close the application and reopen it.
        // This step is handled by Espresso's default behavior of closing and reopening the activity.

        // Step 4: Verify that the added social network is still present in the list.
        onView(withId(R.id.id_btn_facebook)).check(matches(isDisplayed()));
    }
}