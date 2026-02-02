package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1332_133205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistenceAfterAppRestart() throws InterruptedException {
        // Exit the app and relaunch it.
        activityRule.finishActivity();
        
        Thread.sleep(1000); // Wait for the app to be closed
        
        // Relaunch the app
        activityRule.launchActivity(null);
        
        // Test each element
        for (int i = 0; i < 6; i++) {
            onView(withId(R.id.id_checklist_item_checkbox))
                .perform(click());
            Thread.sleep(500);
            onView(withId(R.id.id_checklist_item_checkbox))
                .check(matches(isChecked()));
            Thread.sleep(500);
        }
        
        // Test the "Navigate up" button
        onView(withContentDescription("['Navigate up']"))
            .perform(click());
        Thread.sleep(500);
    }
}