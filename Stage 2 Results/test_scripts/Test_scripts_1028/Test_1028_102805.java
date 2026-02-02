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
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_1028_102805 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnabledisableSoundslightsvibration() throws InterruptedException {
        // Test each element
        testElement(withId(R.id.id_settings_severe_weather_alerts_switch));
        Thread.sleep(500);
        
        testElement(withId(R.id.id_settings_station_alerts_switch));
        Thread.sleep(500);
        
        testElement(withId(R.id.id_settings_show_alerts_in_status_bar_switch));
        Thread.sleep(500);
        
        testElement(withId(R.id.id_settings_other_checkbox_use_sounds));
        Thread.sleep(500);
        
        testElement(withId(R.id.id_settings_other_checkbox_use_lights));
        Thread.sleep(500);
        
        testElement(withId(R.id.id_settings_other_checkbox_use_vibration));
    }

    private void testElement(org.hamcrest.Matcher<View> matcher) {
        onView(matcher)
                .perform(click());
        Thread.sleep(500);

        // Verify state
        boolean initialState = !onView(matcher).check(matches(isChecked())).getValue();
        assertTrue("Checkbox should toggle between enabled and disabled states", !initialState);
    }
}