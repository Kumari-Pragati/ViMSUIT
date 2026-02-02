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
public class Test_1028_102804 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnabledisableShowAlertsInStatusBar() throws InterruptedException {
        // Navigate to the Weather Notifications screen (assuming it's already on this screen)
        
        // Test each element
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_settings_severe_weather_alerts_switch))
                            .perform(click());
                    Thread.sleep(500);
                    verifyState(i, isChecked());
                    break;
                case 1:
                    onView(withId(R.id.id_settings_station_alerts_switch))
                            .perform(click());
                    Thread.sleep(500);
                    verifyState(i, isChecked());
                    break;
                case 2:
                    onView(withId(R.id.id_settings_temperature_display_switch))
                            .perform(click());
                    Thread.sleep(500);
                    verifyState(i, isChecked());
                    break;
                case 3:
                    onView(withId(R.id.id_settings_lock_screen_weather_banner_switch))
                            .perform(click());
                    Thread.sleep(500);
                    verifyState(i, isChecked());
                    break;
                case 4:
                    onView(withId(R.id.id_settings_show_alerts_in_status_bar_switch))
                            .perform(click());
                    Thread.sleep(500);
                    verifyState(i, isChecked());
                    break;
            }
        }
    }

    private void verifyState(int index, Matcher<View> matcher) {
        switch (index) {
            case 0:
                onView(withId(R.id.id_settings_severe_weather_alerts_switch))
                        .check(matches(matcher));
                break;
            case 1:
                onView(withId(R.id.id_settings_station_alerts_switch))
                        .check(matches(matcher));
                break;
            case 2:
                onView(withId(R.id.id_settings_temperature_display_switch))
                        .check(matches(matcher));
                break;
            case 3:
                onView(withId(R.id.id_settings_lock_screen_weather_banner_switch))
                        .check(matches(matcher));
                break;
            case 4:
                onView(withId(R.id.id_settings_show_alerts_in_status_bar_switch))
                        .check(matches(matcher));
                break;
        }
    }
}