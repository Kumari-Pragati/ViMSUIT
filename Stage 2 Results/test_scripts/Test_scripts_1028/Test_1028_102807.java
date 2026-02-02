package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1028_102807 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleSwitchesState() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already on this screen)
        
        // Test each element
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    toggleAndVerify(withId(R.id.id_settings_severe_weather_alerts_switch));
                    break;
                case 1:
                    toggleAndVerify(withId(R.id.id_settings_station_alerts_switch));
                    break;
                case 2:
                    toggleAndVerify(withId(R.id.id_settings_temperature_display_switch));
                    break;
                case 3:
                    toggleAndVerify(withId(R.id.id_settings_lock_screen_weather_banner_switch));
                    break;
                case 4:
                    toggleAndVerify(withId(R.id.id_settings_show_alerts_in_status_bar_switch));
                    break;
            }
        }
    }

    private void toggleAndVerify(int viewId) throws InterruptedException {
        Thread.sleep(500);
        onView(withId(viewId))
                .perform(click());
        Thread.sleep(500);

        // Verify state
        if (viewId == R.id.id_settings_severe_weather_alerts_switch ||
            viewId == R.id.id_settings_station_alerts_switch ||
            viewId == R.id.id_settings_temperature_display_switch ||
            viewId == R.id.id_settings_lock_screen_weather_banner_switch ||
            viewId == R.id.id_settings_show_alerts_in_status_bar_switch) {
            onView(withId(viewId))
                    .check(matches(isChecked()));
        }
    }
}