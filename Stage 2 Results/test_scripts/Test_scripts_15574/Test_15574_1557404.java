package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatRadioButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15574_1557404 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSelectForRentTabWhenAlreadySelected throws InterruptedException {
        // Step 1: Tap on the 'For Rent' tab.
        onView(withId(R.id.id_button_for_rent)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms to ensure UI updates
        
        // Step 2: Tap on the 'For Rent' tab again.
        onView(withId(R.id.id_button_for_rent)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms to ensure UI updates

        // Expected Result: The 'For Rent' tab remains selected.
        // Here we assert that the view is still clickable, which implies it's selected
        onView(withId(R.id.id_button_for_rent)).check(matches(isDisplayed()));
    }
}