package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16664_16664008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheUserProfileIconInTheHeader() throws InterruptedException {
        // Navigate to the Checkout 51 screen (Assuming it's already on this screen)
        
        // Click on the user profile icon in the header
        Thread.sleep(500);
        onView(withId(R.id.id_icon)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: The app should navigate to the user profile screen
        Espresso.onView(withId(R.id.user_profile_screen_id)).check(matches(isDisplayed()));
    }
}