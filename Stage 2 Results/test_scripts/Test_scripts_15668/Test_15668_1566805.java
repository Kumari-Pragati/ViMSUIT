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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15668_1566805 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTheInviteYourFriendsButtonClick() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Vouchers' section.
        Thread.sleep(500); // Wait for the UI to load

        // Step 2: Click on the 'Invite your friends' button.
        onView(withId(R.id.id_vouchers_button)).perform(click());
        Thread.sleep(500); // Wait for the action to complete

        // Step 3: Verify that the app navigates to the 'Invite Friends' screen.
        // Assuming there is a unique text or ID in the Invite Friends screen
        onView(withText("Invite Friends")).check(matches(isDisplayed()));
    }
}