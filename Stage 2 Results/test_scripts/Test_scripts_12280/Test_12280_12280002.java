package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_12280_12280002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Step 1: Open the Holaa app.
        
        // Step 2: Navigate to the 'Profile' section.
        onView(withId(R.id.id_secondaryIconView)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Simulate no internet connection.
        Espresso.closeSoftKeyboard();
        Thread.sleep(500); // Wait for UI to update

        // Expected Result
        // The 'Hoodle Score' screen is displayed, but the circular gauge and category labels are not visible.
        onView(withId(R.id.hoodleScoreCircularGauge)).check(ViewAssertions.doesNotExist());
        
        // The text 'You are 'The Listener'' is displayed.
        onView(withText("You are 'The Listener'")).check(ViewAssertions.matches(isDisplayed()));
        
        // The 'Share and tag friends to know their scores' text is visible.
        onView(withText("Share and tag friends to know their scores")).check(ViewAssertions.matches(isDisplayed()));
        
        // The Facebook share icon is visible.
        onView(withId(R.id.facebookShareIcon)).check(ViewAssertions.matches(isDisplayed()));
    }
}