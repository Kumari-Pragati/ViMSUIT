package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.SwitchCompat;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17155_1715507 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyEnableRecentSearchesToggleSwitchDefaultState() throws InterruptedException {
        // Navigate to the Settings screen
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Verify that the 'Enable Recent Searches' toggle switch is in its default state
        onView(withId(R.id.enable_recent_searches_switch)).check(matches(isDisplayed()));
        SwitchCompat enableRecentSearchesSwitch = (SwitchCompat) activityRule.getActivity().findViewById(R.id.enable_recent_searches_switch);
        boolean isCheckedByDefault = enableRecentSearchesSwitch.isChecked(); // Assuming the default is false

        // Assertion
        onView(withId(R.id.enable_recent_searches_switch)).check(matches(isCheckedByDefault ? isNotChecked() : isNotChecked())); // Adjust based on actual default state
    }

    private org.hamcrest.Matcher<SwitchCompat> isNotChecked() {
        return SwitchCompat::isChecked;
    }
}