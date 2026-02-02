package com.example.tests;

import android.app.Instrumentation;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.os.Handler;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15065_1506505 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityInterruptionAndResume throws InterruptedException {
        // Step 1: Open the app and navigate to the Contacts settings page.
        onView(withId(R.id.id_invisibleContacts)).check(matches(isDisplayed()));

        // Step 2: Simulate a phone call interruption.
        simulatePhoneCall();

        // Step 3: Resume the app and verify that the Contacts settings page is still open.
        Thread.sleep(500);
        onView(withId(R.id.id_invisibleContacts)).check(matches(isDisplayed()));

        // Step 4: Simulate a notification interruption.
        simulateNotification();

        // Step 5: Resume the app and verify that the Contacts settings page is still open.
        Thread.sleep(500);
        onView(withId(R.id.id_invisibleContacts)).check(matches(isDisplayed()));
    }

    private void simulatePhoneCall() {
        Instrumentation.ActivityResult result = new Instrumentation.ActivityResult(Activity.RESULT_OK, null);
        activityRule.getScenario().onActivity(activity -> {
            activity.sendBroadcast(new android.content.Intent("android.intent.action.PHONE_STATE"));
        });
    }

    private void simulateNotification() {
        Handler handler = new Handler();
        Runnable runnable = () -> {
            // Simulate a notification
            activityRule.getScenario().onActivity(activity -> {
                activity.sendBroadcast(new android.content.Intent("android.intent.action.NOTIFICATION"));
            });
        };
        handler.postDelayed(runnable, 1000);
    }
}