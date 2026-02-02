package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10180_1018008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheAppCanHandleInterruptionAndResume() throws InterruptedException {
        // Test each element
        for (int i = 1; i <= 8; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_drawer_layout)).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_menu_search)).perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_grid_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withId(R.id.id_content_wrapper)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 5:
                    Espresso.pressBack();
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withId(R.id.id_login_btn)).perform(click());
                    Thread.sleep(500);
                    break;
                case 7:
                    Espresso.pressBack();
                    Thread.sleep(500);
                    break;
                case 8:
                    Espresso.onView(ViewMatchers.withContentDescription("Navigate up")).perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify the state of the MOVIES screen after interruption and resume
        onView(withId(R.id.id_grid_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}