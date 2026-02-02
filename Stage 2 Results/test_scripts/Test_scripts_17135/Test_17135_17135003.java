package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_17135_17135003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePostAnAdButtonIsDisabledWhenNoMessagesArePresent() throws InterruptedException {
        // Open the app and navigate to the 'My Messages' section.
        Espresso.onView(withId(R.id.id_drawer_layout)).perform(Thread.sleep(500));

        // Verify the 'Post an Ad' button is disabled.
        Espresso.onView(withId(R.id.post_ad_button))
                .check(ViewAssertions.matches(isClickable(false)));
    }
}