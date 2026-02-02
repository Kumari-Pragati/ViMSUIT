package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14554_1455407 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheScreenIsAccessibleAndUsable() throws InterruptedException {
        // Test each element
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_main_menu_friends))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_main_menu_airmail))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_main_menu_notification))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_main_menu_more))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withId(R.id.id_airmail_list))
                            .check(matches(isClickable()));
                    Thread.sleep(500);
                    break;
                case 5:
                    onView(withId(R.id.id_airmail_fab_new))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withContentDescription("['Navigate up']"))
                            .check(matches(isClickable()));
                    Thread.sleep(500);
                    break;
            }
        }

        // Additional assertions can be added here if necessary
    }
}