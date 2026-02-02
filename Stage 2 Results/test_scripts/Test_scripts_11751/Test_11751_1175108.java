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
public class Test_11751_1175108 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAdvertisementBanner() throws InterruptedException {
        // Navigate to the 'Bus Routes' screen (assuming it's the initial screen)
        
        // Test withId(R.id.id_listView1) element
        onView(withId(R.id.id_listView1))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Test withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_listView1))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}