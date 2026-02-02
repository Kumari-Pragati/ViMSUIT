package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17368_17368005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testShareADessertRecipe() throws InterruptedException {
        // Step 1: Open the mobile app (Assuming MainActivity is launched by default)
        
        // Step 2: Navigate to the Eggless Desserts screen
        Espresso.onView(ViewMatchers.withText("Eggless Desserts")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the phone icon next to a dessert recipe
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500); // Wait for sharing options to appear
        
        // Expected Result: The sharing options for the selected dessert recipe are displayed
        Espresso.onView(ViewMatchers.withText("Share via WhatsApp"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}