package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12188_12188002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowUserClicksMaybeLaterButton throws InterruptedException {
        // Navigate to the onboarding screen (assuming it's the default screen)
        
        // Click on the 'Maybe Later' button
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).perform(click());
        Thread.sleep(500); // Wait for 500ms
        
        // Assert that the application remains on the onboarding screen
        onView(withId(R.id.id_fragment_onboarding_introduction_maybe_later_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Assert that the 'Maybe Later' button is disabled after being clicked
        Espresso.onData(ViewMatchers.withId(R.id.id_fragment_onboarding_introduction_maybe_later_button))
                .inAdapterView(ViewMatchers.isAssignableFrom(android.widget.AbsListView.class))
                .perform(ViewActions.scrollTo())
                .check(ViewAssertions.matches(ViewMatchers.not(ViewMatchers.isEnabled())));
    }
}