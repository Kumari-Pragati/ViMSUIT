package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_16664_16664005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheHomeButtonInTheFooter() throws InterruptedException {
        // Navigate to the Checkout 51 screen (assuming it's already on this screen)
        
        // Click on the 'Home' button in the footer
        Thread.sleep(500);
        onView(allOf(withId(R.id.id_icon))).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: The app should navigate to the home screen
        Espresso.onView(allOf(withId(R.id.home_screen_element_id))).check(matches(isDisplayed()));
    }
}