package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

@RunWith(android.support.test.runner.AndroidJUnit4.class)
public class Test_12504_1250403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Optional: Any setup if needed
    }

    @Test
    public void testUserCanViewTheDetailsOfTheEssentialsBundle throws InterruptedException {
        // Scroll down to view the details of the Essentials Bundle
        onView(withId(R.id.id_BundleDetailsLandingRecyclerView)).perform(scrollTo());
        Thread.sleep(500);

        // Check if the image of personal care products is displayed
        onView(ViewMatchers.withContentDescription("Personal Care Products")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Check if 'Essentials Bundle' text is displayed
        onView(ViewMatchers.withText("Essentials Bundle")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Check if the price '$35.95/month' is displayed
        onView(ViewMatchers.withText("$35.95/month")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Check if the subtitle explaining the subscription details is displayed
        onView(ViewMatchers.withText("Subscription Details:")).check(matches(isDisplayed()));
        Thread.sleep(500);
    }
}