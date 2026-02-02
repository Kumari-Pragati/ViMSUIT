package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.CoreMatchers.allOf;

public class Test_12581_1258103 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAppDoesNotCrashDuringLoading() throws InterruptedException {
        // Wait for 500ms before proceeding to the next step
        Thread.sleep(500);

        // Navigate to the loading page (Screen ID: 12581)
        // Assuming that navigating to the loading page is done through some action in MainActivity

        // Wait for 30 seconds to ensure the app does not crash
        Thread.sleep(30000);

        // Check if the drawer layout is displayed, which indicates the app has not crashed
        onView(allOf(isDisplayed(), withId(R.id.id_drawer_layout))).check(matches(isDisplayed()));
    }
}