package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
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
public class Test_1068_1068010 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUserCanResumeViewingTheirProfileInOnlineMode() throws InterruptedException {
        // Ensure the device is set to online mode.
        // Assuming there's a method in MainActivity or elsewhere that sets the network state to online
        activityRule.getActivity().setNetworkStateToOnline();

        Thread.sleep(500); // Wait for the network change to take effect

        // Observe the map and other profile details.
        onView(withId(R.id.id_profile)).perform(click());
        Thread.sleep(500);

        // The map and other profile details are displayed correctly in online mode.
        onView(withId(R.id.id_profile)).check(matches(isDisplayed()));
    }
}