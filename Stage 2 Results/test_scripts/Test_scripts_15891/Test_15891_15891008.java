package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_15891_15891008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInterruptionresumeAppClosure() throws InterruptedException {
        // Step 1: Click on the search bar and type '123 Main St'.
        onView(withContentDescription("Search")).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.search_input)).perform(typeText("123 Main St"), closeSoftKeyboard());

        // Step 2: Close the app.
        Thread.sleep(500);
        activityRule.getActivity().finish();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) activityRule.getActivity().getSystemService(activityRule.getActivity().ACTIVITY_SERVICE);
        activityManager.killBackgroundProcesses(activityRule.getActivity().getPackageName());

        // Step 3: Reopen the app.
        Thread.sleep(500);
        activityRule.launchActivity(null);

        // Step 4: Click on the 'USE MY CURRENT LOCATION' button.
        Thread.sleep(500);
        onView(withContentDescription("['Outdated Version']")).perform(click());

        // Expected Result: The app should display nearby food options based on the last entered address or current location.
        Thread.sleep(500);
        onView(withId(R.id.recycler_view)).check(matches(isDisplayed()));
    }
}