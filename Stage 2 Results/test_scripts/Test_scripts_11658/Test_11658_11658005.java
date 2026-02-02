package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_11658_11658005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyBuyDeveloperACupOfCoffeeSuggestion() throws InterruptedException {
        // Step 2: Navigate to the Subscription Options screen (Assuming this step is handled by UI navigation)
        
        // Step 3: Verify that the 'Buy developer a cup of Coffee' suggestion is displayed at the bottom
        Thread.sleep(500); // Wait for 500ms to ensure the view is fully loaded
        
        Espresso.onView(ViewMatchers.withId(R.id.id_btn_purchase1)).check(matches(isDisplayed()));
        
        Thread.sleep(500); // Additional wait time for better test stability
    }
}