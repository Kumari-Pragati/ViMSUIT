package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_16254_1625407 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginInterruptionAndResume() throws InterruptedException {
        // Enter 'testuser' in the 'Username' field (Assuming there is a way to enter text)
        // Enter 'testpass' in the 'Password' field (Assuming there is a way to enter text)
        // Click on the 'Sign In' button
        // Simulate an interruption (e.g., force close the app)
        // Resume the app and check if the user is still logged in

        for (int i = 1; i <= 9; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_side_panel_button)).perform(click());
                    break;
                case 2:
                    onView(withId(R.id.id_app_logo_button)).perform(click());
                    break;
                case 3:
                    onView(withId(R.id.id_refresh_menu_button)).perform(click());
                    break;
                case 4:
                    onView(withId(R.id.id_settings_menu_button)).perform(click());
                    break;
                case 5:
                    onView(withId(R.id.id_share_button)).perform(click());
                    break;
                case 6:
                    onView(withId(R.id.id_profile_button)).perform(click());
                    break;
                case 7:
                    onView(withId(R.id.id_settings_button)).perform(click());
                    break;
                case 8:
                    onView(withId(R.id.id_info_button)).perform(click());
                    break;
                case 9:
                    onView(withId(R.id.id_login_button)).perform(click());
                    break;
            }
            sleep(500);
        }

        // Verify state after each interaction
        for (int i = 1; i <= 9; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_side_panel_button)).check(matches(isDisplayed()));
                    break;
                case 2:
                    onView(withId(R.id.id_app_logo_button)).check(matches(isDisplayed()));
                    break;
                case 3:
                    onView(withId(R.id.id_refresh_menu_button)).check(matches(isDisplayed()));
                    break;
                case 4:
                    onView(withId(R.id.id_settings_menu_button)).check(matches(isDisplayed()));
                    break;
                case 5:
                    onView(withId(R.id.id_share_button)).check(matches(isDisplayed()));
                    break;
                case 6:
                    onView(withId(R.id.id_profile_button)).check(matches(isDisplayed()));
                    break;
                case 7:
                    onView(withId(R.id.id_settings_button)).check(matches(isDisplayed()));
                    break;
                case 8:
                    onView(withId(R.id.id_info_button)).check(matches(isDisplayed()));
                    break;
                case 9:
                    // Assuming the login button is not visible after successful login
                    onView(withId(R.id.id_login_button)).check(matches(not(isDisplayed())));
                    break;
            }
        }
    }
}