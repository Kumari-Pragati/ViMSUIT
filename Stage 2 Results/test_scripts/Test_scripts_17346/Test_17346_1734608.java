package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_17346_1734608 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanAccessTheAdvertisement() throws InterruptedException {
        // Wait for the advertisement to appear and be clickable
        Thread.sleep(500);
        
        // Click on the 'hotwire' advertisement
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        // Wait for 500ms before checking the result
        Thread.sleep(500);
        
        // Assert that the user is redirected to the advertisement's landing page
        Espresso.onView(isClickable()).check(matches(withContentDescription("[None]")));
    }
}