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
public class Test_1028_102808 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckboxesState() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already on this screen)
        
        // Test each element
        for (int i = 1; i <= 9; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_menu_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_settings_severe_weather_alerts_switch)).perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_settings_station_alerts_switch)).perform(click());
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withId(R.id.id_settings_temperature_display_switch)).perform(click());
                    Thread.sleep(500);
                    break;
                case 5:
                    onView(withId(R.id.id_settings_lock_screen_weather_banner_switch)).perform(click());
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withId(R.id.id_settings_show_alerts_in_status_bar_switch)).perform(click());
                    Thread.sleep(500);
                    break;
                case 7:
                    onView(withId(R.id.id_settings_other_checkbox_use_sounds)).perform(click());
                    Thread.sleep(500);
                    break;
                case 8:
                    onView(withId(R.id.id_settings_other_checkbox_use_lights)).perform(click());
                    Thread.sleep(500);
                    break;
                case 9:
                    onView(withId(R.id.id_settings_other_checkbox_use_vibration)).perform(click());
                    Thread.sleep(500);
                    break;
            }
            
            // Verify state
            switch (i) {
                case 2:
                    onView(withId(R.id.id_settings_severe_weather_alerts_switch)).check(matches(isChecked()));
                    break;
                case 3:
                    onView(withId(R.id.id_settings_station_alerts_switch)).check(matches(isChecked()));
                    break;
                case 4:
                    onView(withId(R.id.id_settings_temperature_display_switch)).check(matches(isChecked()));
                    break;
                case 5:
                    onView(withId(R.id.id_settings_lock_screen_weather_banner_switch)).check(matches(isChecked()));
                    break;
                case 6:
                    onView(withId(R.id.id_settings_show_alerts_in_status_bar_switch)).check(matches(isChecked()));
                    break;
                case 7:
                    onView(withId(R.id.id_settings_other_checkbox_use_sounds)).check(matches(isChecked()));
                    break;
                case 8:
                    onView(withId(R.id.id_settings_other_checkbox_use_lights)).check(matches(isChecked()));
                    break;
                case 9:
                    onView(withId(R.id.id_settings_other_checkbox_use_vibration)).check(matches(isChecked()));
                    break;
            }
        }
    }
}