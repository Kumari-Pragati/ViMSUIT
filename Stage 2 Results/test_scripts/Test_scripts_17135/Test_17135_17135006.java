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

@RunWith(AndroidJUnit4.class)
public class Test_17135_17135006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePostAnAdButtonIsClickableAndNavigatesToTheAdPostingPage() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Messages' section.
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        
        // Step 2: Click on the 'Post an Ad' button.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.post_ad_button)).perform(ViewActions.click());

        // Step 3: Verify clicking the 'Post an Ad' button navigates the user to the ad posting page.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.ad_posting_page)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}