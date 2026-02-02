package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnit4.class)
public class Test_1184_1184002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheCurrentWeekOfPregnancyIsDisplayedCorrectly() throws InterruptedException {
        // Step 1: Open the app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the pregnancy calendar view
        onView(withId(R.id.id_buttonNext)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI update
        
        // Step 3: Verify the current week of pregnancy is displayed as 6
        onView(withText("6")).inRoot(isDisplayed()).check(matches(withText("6")));
    }
}