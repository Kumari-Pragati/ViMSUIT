package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_11039_11039001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToThePreviousScreen() throws InterruptedException {
        // Step 1: Click on the back arrow icon in the Header/App Bar.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(click());

        // Expected Result: The user should be redirected to the previous screen.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.previous_screen_content)).check(ViewAssertions.matches(isDisplayed()));
    }
}