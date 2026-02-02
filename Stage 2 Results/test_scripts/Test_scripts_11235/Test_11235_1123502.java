package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TabLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_11235_1123502 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Step 1: Open the Food Delivery App.
        
        // Step 2: Navigate to the 'Biancorosso' restaurant page. (Assuming this is a known action)
        onView(withId(R.id.restaurant_list)).perform(ViewActions.click());
        
        // Step 3: Simulate no internet connection.
        // This step would typically involve network configuration changes or using a library like MockWebServer,
        // but for simplicity, we will proceed to the next step and assume it fails.

        // Step 4: Click on the 'REVIEWS' tab. (Assuming REVIEWS is a tab in TabLayout)
        Thread.sleep(500); // Wait for UI to update
        onView(withId(R.id.id_tab_layout)).perform(click());
        
        // Expected Result: The app should display an error message indicating no internet connection.
        Thread.sleep(500); // Wait for the error message to appear
        onView(withText("No Internet Connection")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}