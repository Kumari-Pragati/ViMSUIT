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

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14585_14585008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheContactUsOption() throws InterruptedException {
        // Step 1: Open the application (Assuming it's already open, as this is an Espresso test)

        // Step 2: Navigate to the 'Data Sharing' menu
        Thread.sleep(500);
        onView(withContentDescription("Data Sharing")).perform(ViewActions.click());

        // Step 3: Select the 'Contact us' option
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        // Expected Result: The application should navigate to the 'Contact us' screen
        Thread.sleep(500);
        Espresso.onView(withId(R.id.contact_us_screen)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}