package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_17346_1734603 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanSelectAnExistingPhotoOrVideo() throws InterruptedException {
        // Test each element
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_application_root_view_content_without_bars))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_navigation_bar_scroll))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_station_logo))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withId(R.id.id_menu_button))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withContentDescription("[None]"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
            }
            // Verify state
            if (i == 3) {
                assertTrue("Selected photo or video should be displayed", isDisplayed().check(matches(isDisplayed())));
            }
        }
    }
}