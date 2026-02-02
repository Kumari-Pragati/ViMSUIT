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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15979_1597906 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnGoToSectionButtonInMapsSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu section.
        Espresso.onView(ViewMatchers.withText("Menu")).perform(click());

        // Step 2: Click on the 'GO TO SECTION' button in the Maps section.
        Thread.sleep(500); // Wait for UI to update
        onView(withId(R.id.id_buttonView)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Expected Result: The screen should navigate to the Maps section.
        Espresso.onView(ViewMatchers.withText("Maps")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}