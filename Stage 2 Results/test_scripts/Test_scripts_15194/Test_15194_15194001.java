package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15194_15194001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySplashScreenDisplay() throws InterruptedException {
        // Open the application.
        
        // Observe the splash screen.
        Thread.sleep(500);  // Wait for 500 milliseconds to ensure the splash screen is displayed.

        // Verify that the DrawerLayout is displayed.
        onView(withId(R.id.id_application_root_view_content_without_bars)).check(matches(isDisplayed()));

        // Additional assertions can be added here based on the expected UI elements
    }
}