package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_13575_1357501 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectACategoryAndProceedToTheNextScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the category selection screen
        Thread.sleep(500); // Wait for the initial screen

        // Step 2: Tap on the 'Cars' category option
        onView(withId(R.id.id_category_subcategory_list)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for the next screen to load

        // Step 3: Verify that the 'Cars' category is selected and proceed to the next screen
        Espresso.onView(withId(R.id.id_category_subcategory_list))
                .check(ViewAssertions.matches(ViewMatchers.withText("Cars")));
    }
}