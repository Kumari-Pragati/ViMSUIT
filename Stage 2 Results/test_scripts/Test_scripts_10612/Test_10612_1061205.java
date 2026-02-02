package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10612_1061205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnBatteryOption() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Click on the 'CHECK IN' option
        onView(withId(R.id.id_checkin_item)).perform(click());
        
        // Wait before checking the result
        Thread.sleep(500);
        
        // Assert that we are navigated to the Battery settings screen
        onView(withText("Battery")).check(matches(isDisplayed()));
    }
}