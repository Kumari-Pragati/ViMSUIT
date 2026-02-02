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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(AndroidJUnit4.class)
public class Test_10128_10128006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyFooterInformation() throws InterruptedException {
        // Open the Help section (assuming it's opened by clicking on a specific view)
        onView(withId(R.id.id_uv_action_search)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for 500ms to ensure the action is processed

        // Verify footer information
        onView(withText("Powered by UserVoice")).check(ViewAssertions.matches(withText(containsString("Powered by UserVoice"))));
        Thread.sleep(500); // Wait for 500ms to ensure the text is displayed

        onView(withText("Android SDK v1.2.5.")).check(ViewAssertions.matches(withText(containsString("Android SDK v1.2.5."))));
        Thread.sleep(500); // Wait for 500ms to ensure the text is displayed
    }
}