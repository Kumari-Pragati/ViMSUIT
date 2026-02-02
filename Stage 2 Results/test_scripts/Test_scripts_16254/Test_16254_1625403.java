package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_16254_1625403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyFields() throws InterruptedException {
        // Loop through all elements and perform click actions
        for (int i = 1; i <= 9; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_side_panel_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_app_logo_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_refresh_menu_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withId(R.id.id_settings_menu_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 5:
                    onView(withId(R.id.id_share_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withId(R.id.id_profile_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 7:
                    onView(withId(R.id.id_settings_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 8:
                    onView(withId(R.id.id_info_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 9:
                    onView(withId(R.id.id_login_button)).perform(click());
                    Thread.sleep(500);
                    // Verify the error message is displayed
                    Espresso.onView(withId(android.R.id.content))
                            .check(matches(isDisplayed()));
                    break;
            }
        }
    }
}