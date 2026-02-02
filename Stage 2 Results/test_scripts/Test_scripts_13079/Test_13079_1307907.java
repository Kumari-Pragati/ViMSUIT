package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.CardView;

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
public class Test_13079_1307907 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Close the app
        activityRule.finishActivity();

        // Reopen the app
        Thread.sleep(500);
        activityRule.launchActivity(null);

        // Navigate to the 'Vehicles' screen
        Thread.sleep(500);
        onView(withId(R.id.id_card_view)).perform(click());

        // Wait for the card view to be displayed
        Thread.sleep(500);
        onView(withId(R.id.id_card_view)).check(matches(isDisplayed()));
    }
}