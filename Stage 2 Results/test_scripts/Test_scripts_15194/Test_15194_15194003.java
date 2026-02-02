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
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15194_15194003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySplashScreenImageInteraction() throws InterruptedException {
        // Wait for the splash screen to appear
        Thread.sleep(500);

        // Tap on the image of four individuals
        onView(withId(R.id.id_application_root_view_content_without_bars)).perform(click());

        // Wait for the next screen to load
        Thread.sleep(500);

        // Assert that the next screen is displayed
        onView(withId(R.id.next_screen_id)).check(matches(isDisplayed()));
    }
}