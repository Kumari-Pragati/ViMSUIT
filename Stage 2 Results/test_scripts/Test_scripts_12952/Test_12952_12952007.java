package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_12952_12952007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestNavigation() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // Assuming onboarding is handled by MainActivity or a similar flow

        // Step 2: Click on the 'Receive Bitcoin' section.
        onView(withId(R.id.receive_bitcoin_section)).perform(click());

        // Step 3: Click on the 'Receive' button.
        Thread.sleep(500);
        onView(withContentDescription("['Receive']")).perform(click());

        // Step 4: Navigate back to the previous screen.
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Assertion: The user can navigate back to the previous screen
        Thread.sleep(500);
        onView(withId(R.id.receive_bitcoin_section)).check(matches(isDisplayed()));
    }
}