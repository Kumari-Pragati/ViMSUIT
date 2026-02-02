package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10863_10863004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheProfileSection() throws InterruptedException {
        // Step 1: Open the healthcare-related mobile application.
        // Step 2: Navigate to the home page. (Assuming this is done by default when MainActivity starts)

        // Step 3: Click on the user's name 'Laura Lee' in the header.
        onView(withText("Laura Lee")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The user is navigated to the profile page.
        // Assuming the profile page has an ImageView with id R.id.id_patient_image
        onView(withId(R.id.id_patient_image)).check(matches(isDisplayed()));
    }
}