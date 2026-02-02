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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15194_15194004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySplashScreenLogoInteraction() throws InterruptedException {
        // Wait for the splash screen to appear and logo to be displayed
        Thread.sleep(500);
        
        // Tap on the 'FIRST ALERT WEATHER' logo
        onView(withId(R.id.id_page_header_icon_click)).perform(click());
        
        // Wait for 500ms before checking the next screen
        Thread.sleep(500);
        
        // Assert that the next screen is displayed
        onView(withId(R.id.next_screen_id)).check(matches(isDisplayed()));
    }
}